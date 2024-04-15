
package com.server.sockets;

import com.server.xmlflexcup.XmlAnalyzer;
import com.server.xmlflexcup.parser;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ServidorSer implements Runnable{
    
    private Socket con;
    public static String messege;
    public static ArrayList<String>errors=new ArrayList<>();
    private String error;

    public ServidorSer(Socket con){
        this.con=con;
    }
    
    @Override
    public void run(){
        try {
            ObjectInputStream entrada=new ObjectInputStream(con.getInputStream());
            messege=(String)entrada.readObject();
            //System.out.println("Mensaje del cliente: "+messege);
            if(messege.endsWith(">")){
                XmlAnalyzer flex=new XmlAnalyzer(new BufferedReader(new StringReader(messege)));
                parser p=new parser(flex);
                p.parse();
                validar(messege);
            }else{
                error="Error en la sintaxis, falta cierre de > en el ultimo tag";
                System.out.println(error);
                errors.add(error);
            }
            con.close();
        } catch (IOException |ClassNotFoundException ex) {
            System.out.println("No se encontro clientes...");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public void validar(String XML){
        String patron="^[-_$][a-zA-Z0-9_$-]*";
        try {
            // Creo un DocumentBuilder para procesar el XML
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dbBuilder=dbFactory.newDocumentBuilder();
            Document doc= dbBuilder.parse(new InputSource(new StringReader(XML)));

            // Creao un XPathFactory para hacer consultas XPath
            XPathFactory xpathFactory=XPathFactory.newInstance();
            XPath xpath=xpathFactory.newXPath();

            // Obtener la lista de nodos de acción
            XPathExpression accionExpresion= xpath.compile("//*[local-name()='accion']");
            NodeList accionNodos=(NodeList) accionExpresion.evaluate(doc, XPathConstants.NODESET);
            System.out.println("Numero de acciones: "+accionNodos.getLength());

            // Iterar sobre los nodos de acción
            for (int i = 0; i < accionNodos.getLength(); i++) {
                Node acctionNodo=accionNodos.item(i);
                String nombreAccion=acctionNodo.getAttributes().getNamedItem("nombre").getNodeValue();
                System.out.println("Nombre de la accion: "+nombreAccion);

                //Procesamos parametros
                Map<String, String>parametros=getParametros(xpath, doc, acctionNodo);
                System.out.println("Parametros: ");
                for(Map.Entry<String, String>entidad:parametros.entrySet()){
                    System.out.println(" "+entidad.getKey()+" "+entidad.getValue());
                }

                //Procesamos Etiquetas
                Map<Integer, String>tags=getTags(xpath, doc, acctionNodo);
                System.out.println("Etiquetas: ");
                for (Map.Entry<Integer,String>eti:tags.entrySet()) {
                    System.out.println(" "+eti.getValue());
                }


                //Procesar Atributos
                Map<String,String> attr=getAtributos(xpath, doc, acctionNodo);
                System.out.println("Atributos: ");
                for (Map.Entry<String,String>att:attr.entrySet()){
                    System.out.println(" "+att.getKey()+" "+att.getValue());
                }

                System.out.println(" ");

            }


                   }catch (Exception e){
                    e.printStackTrace();
        }
    }

    private static Map<String,String> getParametros(XPath xpath, Document doc, Node nodo) throws Exception{
        Map<String, String> parameters = new HashMap<>();
        XPathExpression parameterExpression = xpath.compile("*[local-name()='parametros']/*[local-name()='parametro']");
        NodeList parameterNodes = (NodeList) parameterExpression.evaluate(nodo, XPathConstants.NODESET);
        for (int j = 0; j < parameterNodes.getLength(); j++) {
            Node parameterNode = parameterNodes.item(j);
            String parameterName = parameterNode.getAttributes().getNamedItem("nombre").getNodeValue();
            String parameterValue = parameterNode.getTextContent();
            parameters.put(parameterName, parameterValue);
        }
        return parameters;
    }

    private static Map<Integer,String> getTags(XPath xpath, Document doc, Node nodo) throws Exception{
        Map<Integer, String> etiquetas=new HashMap<>();
        XPathExpression expEtiquetas=xpath.compile("*[local-name()='etiquetas']/*[local-name()='etiqueta']");
        NodeList listaEtiquetas=(NodeList) expEtiquetas.evaluate(nodo, XPathConstants.NODESET);
        for (int i = 0; i < listaEtiquetas.getLength(); i++) {
            String etiqueta=listaEtiquetas.item(i).getAttributes().getNamedItem("valor").getNodeValue();
            etiquetas.put(i,etiqueta);
        }
        return etiquetas;
    }

    private static  Map<String, String> getAtributos(XPath xpath,Document doc, Node nodo)throws Exception{
        Map<String, String> attr=new HashMap<>();
        XPathExpression expAtributos=xpath.compile("*[local-name()='atributos']/*[local-name()='atributo']");
        NodeList listaAttr=(NodeList) expAtributos.evaluate(nodo,XPathConstants.NODESET);
        for (int i = 0; i < listaAttr.getLength(); i++) {
            Node nodoAttr=listaAttr.item(i);
            String clave=nodoAttr.getAttributes().getNamedItem("nombre").getNodeValue();
            String valor = nodoAttr.getTextContent();
            attr.put(clave,valor);
        }
        return attr;
    }
    
}
