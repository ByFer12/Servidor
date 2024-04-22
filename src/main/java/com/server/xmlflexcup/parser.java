
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615
//----------------------------------------------------

package com.server.xmlflexcup;

import java_cup.runtime.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** CUP v0.11b 20160615 generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\031\000\002\002\004\000\002\002\012\000\002\002" +
    "\003\000\002\020\004\000\002\020\003\000\002\003\015" +
    "\000\002\004\004\000\002\004\003\000\002\005\003\000" +
    "\002\005\003\000\002\005\003\000\002\006\012\000\002" +
    "\007\012\000\002\010\012\000\002\011\004\000\002\011" +
    "\003\000\002\014\015\000\002\021\003\000\002\012\004" +
    "\000\002\012\003\000\002\017\015\000\002\015\003\000" +
    "\002\013\004\000\002\013\003\000\002\016\011" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\131\000\004\017\007\001\002\000\006\002\ufffd\017" +
    "\ufffd\001\002\000\006\002\uffff\017\014\001\002\000\004" +
    "\002\133\001\002\000\006\004\011\005\010\001\002\000" +
    "\004\021\022\001\002\000\004\016\012\001\002\000\004" +
    "\017\014\001\002\000\004\017\016\001\002\000\004\005" +
    "\010\001\002\000\006\002\ufffe\017\ufffe\001\002\000\006" +
    "\005\010\020\017\001\002\000\004\004\020\001\002\000" +
    "\004\016\021\001\002\000\004\002\000\001\002\000\004" +
    "\015\023\001\002\000\004\014\024\001\002\000\004\016" +
    "\025\001\002\000\004\017\031\001\002\000\004\017\ufff8" +
    "\001\002\000\004\017\ufffa\001\002\000\004\017\ufff9\001" +
    "\002\000\010\006\036\010\037\012\040\001\002\000\004" +
    "\017\035\001\002\000\004\017\ufff7\001\002\000\004\017" +
    "\ufffb\001\002\000\012\006\036\010\037\012\040\020\041" +
    "\001\002\000\004\016\107\001\002\000\004\016\070\001" +
    "\002\000\004\016\044\001\002\000\004\005\042\001\002" +
    "\000\004\016\043\001\002\000\006\002\ufffc\017\ufffc\001" +
    "\002\000\004\017\045\001\002\000\004\013\053\001\002" +
    "\000\004\017\uffee\001\002\000\004\017\051\001\002\000" +
    "\004\017\uffef\001\002\000\006\013\053\020\052\001\002" +
    "\000\004\012\066\001\002\000\004\021\054\001\002\000" +
    "\004\015\055\001\002\000\004\014\056\001\002\000\004" +
    "\016\057\001\002\000\004\022\060\001\002\000\004\017" +
    "\uffec\001\002\000\004\017\062\001\002\000\004\020\063" +
    "\001\002\000\004\013\064\001\002\000\004\016\065\001" +
    "\002\000\004\017\uffed\001\002\000\004\016\067\001\002" +
    "\000\004\017\ufff5\001\002\000\004\017\071\001\002\000" +
    "\004\011\077\001\002\000\004\017\074\001\002\000\004" +
    "\017\uffea\001\002\000\006\011\077\020\076\001\002\000" +
    "\004\017\uffeb\001\002\000\004\010\105\001\002\000\004" +
    "\023\100\001\002\000\004\015\101\001\002\000\004\014" +
    "\102\001\002\000\004\020\103\001\002\000\004\016\104" +
    "\001\002\000\004\017\uffe9\001\002\000\004\016\106\001" +
    "\002\000\004\017\ufff4\001\002\000\004\017\110\001\002" +
    "\000\004\007\115\001\002\000\004\017\113\001\002\000" +
    "\004\017\ufff2\001\002\000\006\007\115\020\116\001\002" +
    "\000\004\017\ufff3\001\002\000\004\021\121\001\002\000" +
    "\004\006\117\001\002\000\004\016\120\001\002\000\004" +
    "\017\ufff6\001\002\000\004\015\122\001\002\000\004\014" +
    "\123\001\002\000\004\016\124\001\002\000\004\022\125" +
    "\001\002\000\004\017\ufff0\001\002\000\004\017\127\001" +
    "\002\000\004\020\130\001\002\000\004\007\131\001\002" +
    "\000\004\016\132\001\002\000\004\017\ufff1\001\002\000" +
    "\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\131\000\010\002\005\003\003\020\004\001\001\000" +
    "\002\001\001\000\004\003\014\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\006\003\003\020\012\001\001\000\004\003\014\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\014\004" +
    "\031\005\026\006\027\007\025\010\032\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\012\005\033\006\027\007\025\010\032\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\006\012" +
    "\046\017\045\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\017\047\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\015\060\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\013\071\016\072" +
    "\001\001\000\002\001\001\000\004\016\074\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\011\110\014" +
    "\111\001\001\000\002\001\001\000\004\014\113\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\021\125\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



        List<String> parametros=List.of("ID","USUARIO_CREACION","FECHA_CREACION","FECHA_MODIFICACION","USUARIO_MODIFICACION","TITULO","SITIO","PADRE","PAGINA","CLASE");
        List<String> clases=List.of("TITULO","PARRAFO","IMAGEN","VIDEO","MENU");
        List<String> action=List.of("NUEVO_SITIO_WEB","BORRAR_SITIO_WEB","NUEVA_PAGINA","BORRAR_PAGINA","MODIFICAR_PAGINA","AGREGAR_COMPONENTE","BORRAR_COMPONENTE","MODIFICAR_COMPONENTE");
        List<String> atributos=List.of("TEXTO","ALINEACION","COLOR","ORIGEN","ALTURA","ANCHO","PADRE","ETIQUETAS","CENTRAR","IZQUIERDA","DERECHA","JUSTIFICAR");

        public static ArrayList<String> erroresSintacticos=new ArrayList();
        String errorss;
       public static boolean isError=false;
    //public static List<String> col= new ArrayList<>();
   // public static List<String> path= new ArrayList<>();
   // public static List<String> cond= new ArrayList<>();
   // public static List<String> valores= new ArrayList<>();
    // Connect this parser to a scanner!
    public parser(XmlAnalyzer lex) {
	    super(lex);
	  }


    public void syntax_error(Symbol s) {
           String lexema=s.value.toString();
           int columna=s.right;
           int fila=s.left;
           System.out.println("Error sintactico en lexema: "+lexema+" en columna: "+columna+" y fila: "+fila);

        }

    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception {
           String lexema=s.value.toString();
           int columna=s.right;
           int fila=s.left;
           errorss= " Error sintactico en \""+lexema+"\" se esperaba ese tokenn en fila"+fila+" Columna"+columna;

           erroresSintacticos.add(errorss);
    }

  public void textParam(String text, String name, int left, int right) {
    if (!text.startsWith("[") && !text.endsWith("]")) {
      isError = true;
      System.out.println("Error en lexema: " + text + " en columna: " + left + " y fila: " + right);
      errorss= " Error sintactico en \""+text+"\" Falta corchetes en fila "+left+" Columna "+right;
      erroresSintacticos.add(errorss);
    } else {
      if (!name.equals(name.toUpperCase())) {
     errorss= " Error sintactico en \""+name+"\" se esperaba tokenn MAYUSCULA en fila "+left+" Columna "+right;
      System.out.println(errorss);
      erroresSintacticos.add(errorss);
       isError = true;
      } else {
        int ind = name.lastIndexOf('\"');
        name = name.substring(1, ind);
        if(!parametros.contains(name)){
        isError=true;
             errorss= " Error sintactico en \""+name+"\" parametro no existe en fila "+left+" Columna "+right;
        System.out.println(errorss);
              erroresSintacticos.add(errorss);
        }else  {
          if (name.equals("ID")) {
            int index = text.indexOf("]");
            text = text.substring(1, index);
            String patron = "^[$\\-_][a-zA-Z0-9$\\-_]+";
            Pattern pattern = Pattern.compile(patron);
            Matcher matcher = pattern.matcher(text);
            if (!matcher.matches()) {
              errorss= " Error sintactico en \""+name+"\" El identificador debe iniciar con _, $, - en fila "+left+" Columna "+right;
              System.out.println(errorss);
              erroresSintacticos.add(errorss);
              isError = true;
            }
          }
          if (name.equals("CLASE")) {
            int index = text.indexOf("]");
            text = text.substring(1, index);
            if (!clases.contains(text)) {
               errorss= " Error sintactico en \""+text+"\" esa clase no existe en fila "+left+" Columna "+right;
              System.out.println(errorss);
              erroresSintacticos.add(errorss);
              isError = true;
            }
          }

        }
      }

    }
  }


   public void textAttr(String text, String name, int left, int right) {
      if (!text.startsWith("[") && !text.endsWith("]")) {
        isError = true;
         errorss= " Error sintactico en \""+text+"\" falta corchetes en fila "+left+" Columna "+right;
        System.out.println(errorss);
        erroresSintacticos.add(errorss);
      } else {
        if (!name.equals(name.toUpperCase())) {
         errorss= " Error sintactico en \""+name+"\" Debe ser mayuscula en fila "+left+" columna "+right;
          System.out.println(errorss);
        erroresSintacticos.add(errorss);
         isError = true;
        } else {
          int ind = name.lastIndexOf('\"');
          name = name.substring(1, ind);
                if(!atributos.contains(name)){
                isError=true;
                errorss= " Error sintactico en \""+name+"\" El atributo no existe en fila "+left+" columna "+right;
                System.out.println(errorss);
                      erroresSintacticos.add(errorss);
                }
          if (name.equals("COLOR")) {
            int index = text.indexOf("]");
            text = text.substring(1, index);
            String color = "^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$";
            Pattern pattern = Pattern.compile(color);
            Matcher matcher = pattern.matcher(text);
            if(!matcher.matches()){
              errorss= " Error sintactico en \""+name+"\" debe tener formato hexadecimal en fila "+left+" columna "+right;
              erroresSintacticos.add(errorss);
              isError=true;
            }

          }
        }

      }
    }
    public void actionManage(String act, int left, int right) {
      if (!act.equals(act.toUpperCase())) {
       errorss= " Error sintactico en \""+act+"\" Debe ser mayuscula en fila "+left+" columna "+right;
        System.out.println(errorss);
        erroresSintacticos.add(errorss);
        isError = true;
      } else {
        int ind = act.lastIndexOf('\"');
        act = act.substring(1, ind);
        if (!action.contains(act)) {
          isError = true;
            errorss= " Error sintactico en \""+act+"\" esta accion no existe en fila "+left+" columna "+right;
          System.out.println(errorss);
          erroresSintacticos.add(errorss);
        }


      }
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= xml_validator EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // xml_validator ::= MEN ACCIONES MAY accionnes MEN CIERRE ACCIONES MAY 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("xml_validator",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // xml_validator ::= accionnes 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("xml_validator",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // accionnes ::= accionnes accionn 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("accionnes",14, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // accionnes ::= accionn 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("accionnes",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // accionn ::= MEN ACCION NOMBRE IGUAL STRING MAY execution MEN CIERRE ACCION MAY 
            {
              Object RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)).right;
		Object s = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-6)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		 	 actionManage(s.toString(),sleft+1,sright);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("accionn",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-10)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // execution ::= execution xmlother 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("execution",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // execution ::= xmlother 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("execution",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // xmlother ::= parametros 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("xmlother",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // xmlother ::= atributos 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("xmlother",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // xmlother ::= etiquetas 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("xmlother",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // parametros ::= MEN PARAMETROS MAY xparametro MEN CIERRE PARAMETROS MAY 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("parametros",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // atributos ::= MEN ATRIBUTOS MAY xatributo MEN CIERRE ATRIBUTOS MAY 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("atributos",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // etiquetas ::= MEN ETIQUETAS MAY xetiqueta MEN CIERRE ETIQUETAS MAY 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("etiquetas",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // xparametro ::= xparametro param 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("xparametro",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // xparametro ::= param 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("xparametro",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // param ::= MEN PARAMETRO NOMBRE IGUAL STRING MAY mospar MEN CIERRE PARAMETRO MAY 
            {
              Object RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)).right;
		Object s = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-6)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		String t = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		
                                                                                          textParam(t,s.toString(), sleft+1, sright);
                                                                                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("param",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-10)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // mospar ::= TEXTO 
            {
              String RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                   String dato=t.toString();
                   RESULT=dato;
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("mospar",15, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // xatributo ::= xatributo atr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("xatributo",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // xatributo ::= atr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("xatributo",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // atr ::= MEN ATRIBUTO NOMBRE IGUAL STRING MAY mosatr MEN CIERRE ATRIBUTO MAY 
            {
              Object RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)).right;
		Object s = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-6)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		
                                                                                textAttr(t.toString(),s.toString(),sleft+1,sright);
                                                                              
              CUP$parser$result = parser.getSymbolFactory().newSymbol("atr",13, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-10)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // mosatr ::= TEXTO 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object t = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		String dato=t.toString();
                    RESULT=dato;
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("mosatr",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // xetiqueta ::= xetiqueta eti 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("xetiqueta",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // xetiqueta ::= eti 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("xetiqueta",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // eti ::= MEN ETIQUETA VALOR IGUAL STRING CIERRE MAY 
            {
              Object RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object s = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		System.out.println("Etiqueta "+s);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("eti",12, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
