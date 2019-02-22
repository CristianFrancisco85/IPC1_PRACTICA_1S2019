package pokemonsimulator;

/**
 *
 * @author cristianmeono
 */


public class Data {
    

public int counter=0;    
public String currentBattle[] = new String[15];
public String HistoryData[][] = new String[500][11];
 
public void recordData(String [] toRecord){
 
    for(int i=0;i<11;i++){
      this.HistoryData[this.counter][i]=toRecord[i]; 
    }
    this.counter++;
}

public void printData(){
    
    for(int i=0;i<this.counter;i++){   
          for(int j=0;j<15;j++){              
              System.out.print("| "+this.HistoryData[i][j]+" |");
          }
          System.out.println();
        }
    
}




}


