package pokemonsimulator;

/**
 * @author Cristian Meoño
 * Clase abstracta que tiene metodos para el funcionamiento del programa.
 */

public abstract class Tools {
    
    /**
     * Matriz 75*160 que simula pantalla.
     */
    static char matrix [][] = new char [75][160];
    
   public Tools(){
         
    }
    
    /**
     * 
     * @param arg1 : Recibe un string a escribir en la matriz
     * @param f1 : Recibe el numero fila para iniciar a escribir
     * @param f2 : Recibe el numero fila para terminar de escribir
     * @param c1 : Recibe el numero de columna para iniciar a escribir
     * @param c2 : Recibe el numero de columna para terminar de escribir
     * La diferecia de f2-f1 = Cantidad de lineas de String -1
     * La diferecia de c2-c1 = Ancho -1
     * De no cumplirse estas igualdades se escribira de forma erronea.
     */
    public static void writeMatrix(String arg1,int f1,int f2,int c1,int c2){
          
        for(int i=f1;i<f2;i++){   
            for(int j=c1;j<=c2;j++){              
                matrix[i][j]= arg1.charAt(j+((i-f1)*(c2-c1+2))-c1);
            }
        }
    }
    
    public static void clearMatrix(int f1,int f2,int c1,int c2){
        for(int i=f1;i<f2;i++){   
          for(int j=c1;j<=c2;j++){              
              matrix[i][j]= ' ';
          }
        }   
    }
    
    public static void printMatrix(int f1,int f2,int c1,int c2){
        for(int i=f1;i<f2;i++){   
          for(int j=c1;j<=c2;j++){              
              System.out.print(matrix[i][j]);
          }
          System.out.println();
        }   
    }
    
    public static boolean validaNum(String arg1,int rango1,int rango2){
      try{
        Integer.parseInt(arg1);
        if(Integer.parseInt(arg1)>=rango1 && Integer.parseInt(arg1)<=rango2){
          return true;  
        }
        else{
            return false;
        }
        
    }
    catch(NumberFormatException e){
        //System.err.println("OPCION INVALIDA");
        return false;
    }
        
    }       
        
        
    /**
     * Metodo que imprime la matriz completa
     * @deprecated 
     */
    public static void printMatrix2(){
        for (char[] matrix1 : matrix) {
            for (int j = 0; j <matrix1.length; j++) {
                System.out.print(matrix1[j]);
            }
            System.out.println();
        }  
    }
    
        /**
    *@deprecated
    */
    public static void pushIcon(String Icon1 ,String Icon2){
            
        //SE LLENA TODA LA MATRIZ CON ESPACIOS EN BLANCO
        for(int i=0;i<matrix.length;i++){
          for(int j=0;j<matrix[i].length;j++){              
              matrix[i][j]= ' ';
          }            
        }
        
        //SE LLENA MATRIZ DEL LADO IZQUIERDO CON ICONO1
        //OCUPA DESDE (3,31) hasta (35,69)
        for(int i=3;i<matrix.length;i++){      
          for(int j=31;j<=69;j++){              
              matrix[i][j]= Icon1.charAt(j+((i-3)*40)-31);
          }  
        }
        
        //SE RELLENA MATRIZ DE LADO DERECHO CON ICONO2
        //OCUPA DESDE (3,91) hasta (35,130)
        for(int i=3;i<matrix.length;i++){   
          for(int j=91;j<=130;j++){              
              matrix[i][j]= Icon2.charAt(j+((i-3)*40)-91);
          }
        }  
        
        //SE HACE UNA SALIDA DE TODA LA MATRIZ
        //CADA ICONO TIENE 20 ESPACIOS DE POR MEDIO 30 AL LADO Y 3 ARRIBA
        for(int i=0;i<matrix.length;i++){  
          for(int j=0;j<matrix[i].length;j++){              
              System.out.print(matrix[i][j]);
          }
          System.out.println();
        }  
      
    
}
    
    
}
