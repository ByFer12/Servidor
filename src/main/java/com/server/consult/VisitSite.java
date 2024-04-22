package com.server.consult;

import com.server.SqlFlexyCup.SqlLexer;
import com.server.SqlFlexyCup.parser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.StringReader;


public class VisitSite {
        public static void procesVisitSite(String cadena){
            try {
                cadena=cadena.toLowerCase();
                System.out.println("Mes: "+cadena);
                SqlLexer lex=new SqlLexer(new BufferedReader(new StringReader(cadena)));
                parser pa=new  parser(lex);
                pa.parse();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
}
