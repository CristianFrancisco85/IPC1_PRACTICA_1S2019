package pokemonsimulator;

/**
 * Clase Pokemon
 * @author Cristian Meoño
 */
public class Pokemon {
    
    public final String Icon;
    public String Name;
    public int Life; //50-100pts
    public int Attack; //5-20pts
    public boolean State;
    public int counter;
    
    /**
     * @param name :Nombre que recibira el objeto Pokemon
     * @param icon :String que contiene el icono del objeto Pokemon
     */
    public Pokemon(String icon,String name){
       this.Life= randomNumber(50,100);
       this.Attack= randomNumber(5,20);
       this.Name=name;
       this.Icon=icon;
       this.State= true;
    }
    
    public static int randomNumber(int min,int max){   
       int randomNum=(int)Math.floor(Math.random()*(max-min+1)+(min));
       return randomNum;
   }
    
    public void resetPokemon(){
        this.Life= randomNumber(50,100);
        this.State= true;   
    }
    
    public void attackPokemon(){
        
    }
    
    
}
