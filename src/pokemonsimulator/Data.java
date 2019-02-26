package pokemonsimulator;

/**
 *
 * @author Cristian Meoño 201801397
 */


public class Data {
    

public int counter=0;    
public String currentBattle[] = new String[15];
public String HistoryData[][] = new String[100][15];
 
public void recordData(String [] toRecord){
 
    for(int i=0;i<15;i++){
      this.HistoryData[this.counter][i]=toRecord[i]; 
    }
    this.counter++;
    
    counter=(counter==100)?0:counter;
}

public void printData(){
    
    for(int i=0;i<this.counter;i++){
        
        System.out.println("\n************************************************************\n");
        System.out.println("PARTIDA No. "+(i+1));
        System.out.println("\nJUGADOR 1: "+this.HistoryData[i][0]);
        System.out.println("POKEMONES UTILIZADOS:");
        System.out.println("POKEMON 1: "+this.HistoryData[i][1]+" Ataques Dados: "+this.HistoryData[i][2]+ " Ataques Recibidos: "+this.HistoryData[i][3]);
        System.out.println("POKEMON 2: "+this.HistoryData[i][4]+" Ataques Dados: "+this.HistoryData[i][5]+ " Ataques Recibidos: "+this.HistoryData[i][6]);
        System.out.println("\nJUGADOR 2: "+this.HistoryData[i][7]);
        System.out.println("POKEMONES UTILIZADOS:");
        System.out.println("POKEMON 1: "+this.HistoryData[i][8]+" Ataques Dados: "+this.HistoryData[i][9]+ " Ataques Recibidos: "+this.HistoryData[i][10]);
        System.out.println("POKEMON 2: "+this.HistoryData[i][11]+" Ataques Dados: "+this.HistoryData[i][12]+ " Ataques Recibidos: "+this.HistoryData[i][13]);
        System.out.println("\nGANADOR: "+this.HistoryData[i][14]);
        System.out.println("\n************************************************************\n");
                
          
        }
    
    
    
}




}


