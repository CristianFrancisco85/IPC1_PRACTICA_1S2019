package pokemonsimulator;

/**
 * @author Cristian Meoño 201801397
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
    
    public static int[][] burbujaDesc(int[][] matrix){
        
        int temp,temp2;
        
        for(int i=0;i<matrix[0].length-1;i++){
            
            for(int j=0;j<matrix[0].length-1;j++){
               if(matrix[0][j]<matrix[0][j+1]){ 
                   
                temp=matrix[0][j];
                temp2=matrix[1][j];
                
                matrix[0][j]=matrix[0][j+1];
                matrix[1][j]=matrix[1][j+1];
                
                matrix[0][j+1]=temp;
                matrix[1][j+1]=temp2;              
                   
               } 
            }
                       
        }
        return matrix;
        
    }
    
    public static int[][] burbujaAsc(int[][] matrix){
        
        int temp,temp2;
        
        for(int i=0;i<matrix[0].length-1;i++){
            
            for(int j=0;j<matrix[0].length-1;j++){
               if(matrix[0][j]>matrix[0][j+1]){ 
                   
                temp=matrix[0][j];
                temp2=matrix[1][j];
                
                matrix[0][j]=matrix[0][j+1];
                matrix[1][j]=matrix[1][j+1];
                
                matrix[0][j+1]=temp;
                matrix[1][j+1]=temp2;              
                   
               } 
            }
                       
        }
        return matrix;
        
    }
       
}
