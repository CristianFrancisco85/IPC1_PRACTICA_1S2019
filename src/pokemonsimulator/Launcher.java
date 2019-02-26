package pokemonsimulator;
import java.util.Scanner;
/**
 * @author Cristian Meoño 201801397
 */

public class Launcher {
    //Variables Globales
    static boolean runTime=true;
    static String menu;
    static int editPok,editPok2;
    static boolean control;
    //Objetos Globales
    static Scanner S=new Scanner(System.in);
    
    
    
public static void main(String[] args) throws CloneNotSupportedException {
        
    Data DataCollector = new Data();
        
    //Objetos Pokemon
    
    // IDENTIFICADOR 1
    Pokemon Torchic=new Pokemon(torchicIco,"TORCHIC");
    // IDENTIFICADOR 2
    Pokemon Mudkip=new Pokemon(mudkipIco,"MUDKIP");
    // IDENTIFICADOR 3
    Pokemon Treecko=new Pokemon(treeckoIco,"TREECKO"); 
    // IDENTIFICADOR 4
    Pokemon Charmander=new Pokemon(charmanderIco,"CHARMANDER");
    // IDENTIFICADOR 5
    Pokemon Squirtle=new Pokemon(squirtleIco,"SQUIRTLE");
    // IDENTIFICADOR 6
    Pokemon Bulbasaur=new Pokemon(bulbasaurIco,"BULBASAUR");
    
        
while(runTime){
    
    System.out.println("*****BIENVENIDO AL SIMULADOR DE BATALLAS POKEMON****");
    System.out.println("\n PARA PODER MOVERTE DENTRO DE LOS MENUS UNICAMENTE TECLEA EL NUMERO CORRESPONDIENTE");
    System.out.println(
    "---------------------MENU------------------------\n"+
    "| [1] LISTAR POKEMONES                          |\n"+
    "| [2] EDITAR POKEMONES                          |\n"+
    "| [3] REGISTRO DE PARTIDAS                      |\n"+
    "| [4] BATALLAR                                  |\n"+
    "| [5] POKEMONES MAS USADOS                      |\n"+
    "| [6] POKEMONES MENOS USADOS                    |\n"+
    "| [7] SALIR                                     |\n"+
    "-------------------------------------------------\n");
    menu=S.next();
    control=(Tools.validaNum(menu,0,7))?true:false;  
    Tools.clearMatrix(0,74,0,159);
    
    if(control){
        
    switch (Integer.parseInt(menu)){
        
    case 1:
            Launcher.listPokemon(Torchic,31);
            Launcher.listPokemon(Mudkip,20);
            Launcher.listPokemon(Treecko,20);
            Launcher.listPokemon(Charmander,22);
            Launcher.listPokemon(Squirtle,20);
            Launcher.listPokemon(Bulbasaur,18);
            break;
            
    case 2:
            System.out.println("\n SELECCIONA EL NOMBRE DEL POKEMON");
            System.out.println(
            "----------------POKEMONES----------------\n"+
            "| [1] "+Torchic.Name+"                           |\n"+
            "| [2] "+Mudkip.Name+"                            |\n"+
            "| [3] "+Treecko.Name+"                           |\n"+
            "| [4] "+Charmander.Name+"                        |\n"+
            "| [5] "+Squirtle.Name+"                          |\n"+
            "| [6] "+Bulbasaur.Name+"                         |\n"+
            "-----------------------------------------\n");
            try{
             editPok=S.nextInt();   
            }
            catch(Exception e){
               System.err.println("OPCION INVALIDA");
               break;
            }
            
            System.out.println("\n ¿QUE DESEAS EDITAR?");
            System.out.println(
            "----------------POKEMONES----------------\n"+
            "| [1] Nombre                            |\n"+
            "| [2] Puntos de Vida                    |\n"+
            "| [3] Puntos de Ataque                  |\n"+
            "-----------------------------------------\n");
            try{
             editPok2=S.nextInt();   
            }
            catch(Exception e){
               System.err.println("OPCION INVALIDA");
               break;
            }
            switch(editPok){
                case 1:
                Torchic=Launcher.editPokemon(editPok2,Torchic);
                break;
                case 2:
                Mudkip=Launcher.editPokemon(editPok2,Mudkip);
                break;
                case 3:
                Treecko=Launcher.editPokemon(editPok2,Treecko);
                break;
                case 4:
                Charmander=Launcher.editPokemon(editPok2,Charmander);
                break;
                case 5:
                Squirtle=Launcher.editPokemon(editPok2,Squirtle);
                break;
                case 6:
                Bulbasaur=Launcher.editPokemon(editPok2,Bulbasaur);
                break;
                default:
                System.err.println("OPCION DE POKEMON NO VALIDA");
                }
            break;      
    case 3:
        DataCollector.printData();
            break;
    case 4:
        
        // SE PIDEN LOS DATOS DE LOS JUGADORES Y LOS POKEMONES A USAR
            System.out.print("\n Ingrese Nombre del Jugador 1: ");
            DataCollector.currentBattle[0]=S.next();
            System.out.println("\n SELECCIONA TUS POKEMONES");
            System.out.println(
            "----------------POKEMONES----------------\n"+
            "| [1] "+Torchic.Name+"                           |\n"+
            "| [2] "+Mudkip.Name+"                            |\n"+
            "| [3] "+Treecko.Name+"                           |\n"+
            "| [4] "+Charmander.Name+"                        |\n"+
            "| [5] "+Squirtle.Name+"                          |\n"+
            "| [6] "+Bulbasaur.Name+"                         |\n"+
            "-----------------------------------------\n");
            
            System.out.print("\n Primer Pokemon: ");
            menu=S.next();
                if(Tools.validaNum(menu,1,6)){
                    DataCollector.currentBattle[1]=menu;        
                }
                else{
                    System.err.println("OPCION INVALIDA");
                break;
                }
            System.out.print("\n Segundo Pokemon: ");
            menu=S.next();
                if(Tools.validaNum(menu,1,6)){
                    DataCollector.currentBattle[4]=menu;        
                }
                else{
                    System.err.println("OPCION INVALIDA");
                    break;
                }
    
            System.out.print("\n Ingrese Nombre del Jugador 2: ");
            DataCollector.currentBattle[7]=S.next();
            System.out.println("\n SELECCIONA TUS POKEMONES");
            System.out.println(
            "----------------POKEMONES----------------\n"+
            "| [1] "+Torchic.Name+"                           |\n"+
            "| [2] "+Mudkip.Name+"                            |\n"+
            "| [3] "+Treecko.Name+"                           |\n"+
            "| [4] "+Charmander.Name+"                        |\n"+
            "| [5] "+Squirtle.Name+"                          |\n"+
            "| [6] "+Bulbasaur.Name+"                         |\n"+
            "-----------------------------------------\n");
            
            System.out.print("\n Primer Pokemon: ");
            menu=S.next();
                if(Tools.validaNum(menu,1,6)){
                    DataCollector.currentBattle[8]=menu;        
                }
                else{
                    System.err.println("OPCION INVALIDA");
                break;
                }
            System.out.print("\n Segundo Pokemon: ");
            menu=S.next();
                if(Tools.validaNum(menu,1,6)){
                    DataCollector.currentBattle[11]=menu;        
                }
                else{
                    System.err.println("OPCION INVALIDA");
                    break;
                }
                
                
        //Se clasifican los datos para mandarlos a la funcion de Battle
        //Las variables pok(n) son destiandas par ala funcion Battle
                
        Pokemon pok1=null;
        Pokemon pok2=null;
        Pokemon pok3=null;
        Pokemon pok4=null;
        
        //pok(n) es igual al un objeto pokemon segun la decision del usuario.
        //En cada casa se le dara un objeto clonado para preservar los objetos Pokemon originales
        switch(DataCollector.currentBattle[1]){
            case "1":
            pok1=Torchic.clone();
            Torchic.counter++;
            Tools.writeMatrix(torchicIco,3,34,31,69);
            DataCollector.currentBattle[1]=Torchic.Name;
            break;
            case "2":
            pok1=Mudkip.clone();
            Mudkip.counter++;
            Tools.writeMatrix(mudkipIco,3,23,31,69);
            DataCollector.currentBattle[1]=Mudkip.Name;
            break;
            case "3":
            pok1=Treecko.clone();
            Treecko.counter++;
            Tools.writeMatrix(treeckoIco,3,23,31,69);
            DataCollector.currentBattle[1]=Treecko.Name;
            break;
            case "4":
            pok1=Charmander.clone();
            Charmander.counter++;
            Tools.writeMatrix(charmanderIco,3,25,31,69);
            DataCollector.currentBattle[1]=Charmander.Name;
            break;
            case "5":
            pok1=Squirtle.clone();
            Squirtle.counter++;
            Tools.writeMatrix(squirtleIco,3,23,31,69);
            DataCollector.currentBattle[1]=Squirtle.Name;
            break;
            case "6":
            pok1=Bulbasaur.clone();
            Bulbasaur.counter++;
            Tools.writeMatrix(bulbasaurIco,3,21,31,69);
            DataCollector.currentBattle[1]=Bulbasaur.Name;
        }
        switch(DataCollector.currentBattle[4]){
            case "1":
            pok2=Torchic.clone();
            Torchic.counter++;
            Tools.writeMatrix(torchicIco,3,34,81,119);
            DataCollector.currentBattle[4]=Torchic.Name;
            break;
            case "2":
            pok2=Mudkip.clone();
            Mudkip.counter++;
            Tools.writeMatrix(mudkipIco,3,23,81,119);
            DataCollector.currentBattle[4]=Mudkip.Name;
            break;
            case "3":
            pok2=Treecko.clone();
            Treecko.counter++;
            Tools.writeMatrix(treeckoIco,3,23,81,119);
            DataCollector.currentBattle[4]=Treecko.Name;
            break;
            case "4":
            pok2=Charmander.clone();
            Charmander.counter++;
            Tools.writeMatrix(charmanderIco,3,25,81,119);
            DataCollector.currentBattle[4]=Charmander.Name;
            break;
            case "5":
            pok2=Squirtle.clone();
            Squirtle.counter++;
            Tools.writeMatrix(squirtleIco,3,23,81,119);
            DataCollector.currentBattle[4]=Squirtle.Name;
            break;
            case "6":
            pok2=Bulbasaur.clone();
            Bulbasaur.counter++;
            Tools.writeMatrix(bulbasaurIco,3,21,81,119);
            DataCollector.currentBattle[4]=Bulbasaur.Name;
        }
        switch(DataCollector.currentBattle[8]){
            case "1":
            pok3=Torchic.clone();
            Torchic.counter++;
            Tools.writeMatrix(torchicIco,43,74,31,69);
            DataCollector.currentBattle[8]=Torchic.Name;
            break;
            case "2":
            pok3=Mudkip.clone();
            Mudkip.counter++;
            Tools.writeMatrix(mudkipIco,43,63,31,69);
            DataCollector.currentBattle[8]=Mudkip.Name;
            break;
            case "3":
            pok3=Treecko.clone();
            Treecko.counter++;
            Tools.writeMatrix(treeckoIco,43,63,31,69);
            DataCollector.currentBattle[8]=Treecko.Name;
            break;
            case "4":
            pok3=Charmander.clone();
            Charmander.counter++;
            Tools.writeMatrix(charmanderIco,43,65,31,69);
            DataCollector.currentBattle[6]=Charmander.Name;
            break;
            case "5":
            pok3=Squirtle.clone();
            Squirtle.counter++;
            Tools.writeMatrix(squirtleIco,43,63,31,69);
            DataCollector.currentBattle[8]=Squirtle.Name;
            break;
            case "6":
            pok3=Bulbasaur.clone();
            Bulbasaur.counter++;
            Tools.writeMatrix(bulbasaurIco,43,61,31,69);
            DataCollector.currentBattle[8]=Bulbasaur.Name;
        }
        switch(DataCollector.currentBattle[11]){
            case "1":
            pok4=Torchic.clone();
            Torchic.counter++;
            Tools.writeMatrix(torchicIco,43,74,81,119);
            DataCollector.currentBattle[11]=Torchic.Name;
            break;
            case "2":
            pok4=Mudkip.clone();
            Mudkip.counter++;
            Tools.writeMatrix(mudkipIco,43,63,841,119);
            DataCollector.currentBattle[11]=Mudkip.Name;
            break;
            case "3":
            pok4=Treecko.clone();
            Treecko.counter++;
            Tools.writeMatrix(treeckoIco,43,63,81,119);
            DataCollector.currentBattle[11]=Treecko.Name;
            break;
            case "4":
            pok4=Charmander.clone();
            Charmander.counter++;
            Tools.writeMatrix(charmanderIco,43,65,81,119);
            DataCollector.currentBattle[11]=Charmander.Name;
            break;
            case "5":
            pok4=Squirtle.clone();
            Squirtle.counter++;
            Tools.writeMatrix(squirtleIco,43,63,81,119);
            DataCollector.currentBattle[11]=Squirtle.Name;
            break;
            case "6":
            pok4=Bulbasaur.clone();
            Bulbasaur.counter++;
            Tools.writeMatrix(bulbasaurIco,43,61,81,119);
            DataCollector.currentBattle[11]=Bulbasaur.Name;
        }
        
        Tools.writeMatrix("JUGADOR 1: "+DataCollector.currentBattle[0],1,2,70,DataCollector.currentBattle[0].length()+80);
        Tools.writeMatrix("JUGADOR 2: "+DataCollector.currentBattle[7],39,40,70,DataCollector.currentBattle[7].length()+80);
        //SE MANDAN DATOS A LA FUNCION BATTLE
        Launcher.Battle(DataCollector.currentBattle, pok1, pok2, pok3, pok4);
        DataCollector.recordData(DataCollector.currentBattle);        
        
            break;        
    case 5:
        Launcher.prueba();
        Launcher.mostUsed(Torchic, Mudkip, Treecko, Charmander, Squirtle, Bulbasaur);
            break;
    case 6:
        Launcher.mostUnused(Torchic, Mudkip, Treecko, Charmander, Squirtle, Bulbasaur);
            break;
    case 7:
        System.err.println("GRACIAS POR JUGAR");
            runTime=false;
            break;
    default:
            System.err.println("OPCION NO VALIDA");
        }
    }
        
}
             
}
    

// Lista el pokemon recibido    
public static void listPokemon(Pokemon objPok,int lineas){
    
    Tools.writeMatrix(objPok.Icon,3,lineas+3,31,69);
    Tools.writeMatrix("NOMBRE: "+objPok.Name,10,11,6,13+objPok.Name.length());
    Tools.writeMatrix("ATAQUE: "+Integer.toString(objPok.Attack),11,12,6,13+Integer.toString(objPok.Attack).length());
    Tools.writeMatrix("VIDA: "+Integer.toString(objPok.Life),12,13,6,11+Integer.toString(objPok.Life).length());
    Tools.printMatrix(0,35,0,159);
    Tools.clearMatrix(0,74,0,159);

}

public static Pokemon editPokemon(int propertie,Pokemon objPok){
    
if(propertie>=1 && propertie<=3){
    String newName;
    int newValue;
    
        switch(propertie){
            case 1:
            System.out.println("Ingrese el nuevo nombre: ");
            newName=S.next();
            objPok.Name=newName;
            System.out.println("CAMBIO GUARDADO");
            break;
            
            case 2:
            System.out.println("Ingrese el nuevo valor entre 50-100");
            newValue=S.nextInt();
            if(newValue>=50 && newValue<=100){
                    objPok.Life=newValue;
                    System.out.println("CAMBIO GUARDADO");
                }
                else{
                    System.err.println("VALOR NO VALIDO");
                }
            break;
            
            case 3:
            System.out.println("Ingrese el nuevo valor entre 5-20");
            newValue=S.nextInt();
                if(newValue>=5 && newValue<=20){
                    objPok.Attack=newValue;
                    System.out.println("CAMBIO GUARDADO");
                }
                else{
                    System.err.println("VALOR NO VALIDO");
                }
        }       
}
else{
        System.err.println("OPCION NO VALIDA");
    }
    return objPok;
}

public static String[] Battle(String [] BattleMatrix, Pokemon pok1,Pokemon pok2,Pokemon pok3,Pokemon pok4){
    
    boolean control=true;
    int from,to;
    int turno=(Pokemon.randomNumber(0,10)<=5)?1:2;
    //System.err.println("ES EL TURNO DEL JUGADOR "+turno);
    
    //SE IMPRIME MATRIZ Y STATS
    Launcher.writeStats(pok1, pok2, pok3, pok4);
    Tools.printMatrix(0,74,0,159);
    int moves1=0;
    int moves2=0;
    int moves3=0;
    int moves4=0;
    
    int received1=0;
    int received2=0;
    int received3=0;
    int received4=0;

    while(control){
        
        // SI EL TURNO ES DEL JUGADOR 1
        
        if(turno==1){
        System.out.println("ES EL TURNO DE: "+BattleMatrix[0]);
        System.out.println("¿CON QUE POKEMON DESEAS ATACAR?");
        System.out.println(
            "----------------POKEMONES-------------\n"+
            "| [1] "+pok1.Name+"                   |\n"+
            "| [2] "+pok2.Name+"                   |\n"+
            "---------------------------------------");
        from=S.nextInt();
        System.out.println("¿A QUE POKEMON DESEAS ATACAR?");
        System.out.println(
            "----------------POKEMONES-------------\n"+
            "| [1] "+pok3.Name+"                   |\n"+
            "| [2] "+pok4.Name+"                   |\n"+
            "---------------------------------------");
        try{
            to=S.nextInt();
        }
        catch(Exception e){
            to=-1;
        }
        
        
            if( (Tools.validaNum(Integer.toString(from),1,2)) && (Tools.validaNum(Integer.toString(to),1,2))){
                //Se aumenta el contador de numeros de ataques realizados por el pokemon
                moves1=(from==1)?moves1+1:moves1;
                moves2=(from==2)?moves2+1:moves2;
                received3=(to==1)?received3+1:received3;
                received4=(to==2)?received4+1:received4;
                
                //Se realiza las resta a la vida del pokemon segun las decisiones tomadas
                pok3.Life=(from==1&&to==1&&pok1.Life>0)?pok3.Life-pok1.Attack:pok3.Life;
                pok3.Life=(from==2&&to==1&&pok2.Life>0)?pok3.Life-pok2.Attack:pok3.Life;
                pok4.Life=(from==1&&to==2&&pok1.Life>0)?pok4.Life-pok1.Attack:pok4.Life;
                pok4.Life=(from==2&&to==2&&pok2.Life>0)?pok4.Life-pok2.Attack:pok4.Life;
                turno=2;
                
                //SE VERFICA SI ALGUN POKEMON YA HA MUERTO Y YA NO PUEDE UTILIZARSE
                if(pok3.Life<0){
                    pok3.Life=0;
                    pok3.State="Muerto";
                    Launcher.writeStats(pok1, pok2, pok3, pok4);
                    System.out.println(BattleMatrix[7]+" YA NO PUEDES UTILIZAR A "+pok3.Name+" HA MUERTO");  
                }
                if(pok4.Life<0){
                    pok4.Life=0;
                    pok4.State="Muerto";
                    Launcher.writeStats(pok1, pok2, pok3, pok4);
                    System.out.println(BattleMatrix[7]+" YA NO PUEDES UTILIZAR A "+pok4.Name+" HA MUERTO");  
                }
                Launcher.writeStats(pok1, pok2, pok3, pok4);
                Tools.printMatrix(0,74,0,159);
            }
            
            else{
                System.out.println("OPCIONES NO VALIDAS");
            }
            
        }
        
        // SI EL TURNO ES DEL JUGADOR 2
        else{
        System.out.println("ES EL TURNO DE: "+BattleMatrix[7]);
        System.out.println("¿CON QUE POKEMON DESEAS ATACAR?");
        System.out.println(
            "----------------POKEMONES-------------\n"+
            "| [1] "+pok3.Name+"                   |\n"+
            "| [2] "+pok4.Name+"                   |\n"+
            "---------------------------------------");
        from=S.nextInt();
        System.out.println("¿A QUE POKEMON DESEAS ATACAR?");
        System.out.println(
            "----------------POKEMONES-------------\n"+
            "| [1] "+pok1.Name+"                   |\n"+
            "| [2] "+pok2.Name+"                   |\n"+
            "---------------------------------------");
        try{
            to=S.nextInt();
        }
        catch(Exception e){
            to=-1;
        }
        
            if((Tools.validaNum(Integer.toString(from),1,2)) && (Tools.validaNum(Integer.toString(to),1,2))){
                //Se aumenta el contador de numeros de ataques realizados por el pokemon
                moves3=(from==1)?moves3+1:moves3;
                moves4=(from==2)?moves4+1:moves4;
                received1=(to==1)?received1+1:received1;
                received2=(to==2)?received2+1:received2;
                
                //Se realiza las resta a la vida del pokemon segun las decisiones tomadas
                pok1.Life=(from==1&&to==1&&pok3.Life>0)?pok1.Life-pok3.Attack:pok1.Life;
                pok1.Life=(from==2&&to==1&&pok4.Life>0)?pok1.Life-pok4.Attack:pok1.Life;
                pok2.Life=(from==1&&to==2&&pok3.Life>0)?pok2.Life-pok3.Attack:pok2.Life;
                pok2.Life=(from==2&&to==2&&pok4.Life>0)?pok2.Life-pok4.Attack:pok2.Life;
                turno=1;
                
                //SE VERFICA SI ALGUN POKEMON YA HA MUERTO Y YA NO PUEDE UTILIZARSE
                if(pok1.Life<0){
                    pok1.Life=0;
                    pok1.State="Muerto";
                    Launcher.writeStats(pok1, pok2, pok3, pok4);
                    System.out.println(BattleMatrix[0]+" YA NO PUEDE UTILIZAR A "+pok1.Name+" HA MUERTO");  
                }
                if(pok2.Life<0){
                    pok2.Life=0;
                    pok2.State="Muerto";
                    Launcher.writeStats(pok1, pok2, pok3, pok4);
                    System.out.println(BattleMatrix[0]+" YA NO PUEDES UTILIZAR A "+pok2.Name+" HA MUERTO");  
                }
                
                Launcher.writeStats(pok1, pok2, pok3, pok4);
                Tools.printMatrix(0,74,0,159);
            }
            else{
                System.out.println("OPCIONES NO VALIDAS");
            }
            
        }        
                       
        //SE VERIFICA SI HAY UN GANADOR
        if(pok1.Life<=0 && pok2.Life<=0){
        System.out.println("EL GANADOR ES "+BattleMatrix[7]);
        BattleMatrix[14]=BattleMatrix[7];
        control=false;    
        }
        if(pok3.Life<=0 && pok4.Life<=0){
        System.out.println("EL GANADOR ES "+BattleMatrix[0]);
        BattleMatrix[14]=BattleMatrix[0];
        control=false;
        }
        //SE ESTABLECEN EN LA MATRIZ LA CANTIDAD DE MOVIMIENTOS DADOS Y RECIBIDOS
        BattleMatrix[2]=Integer.toString(moves1);
        BattleMatrix[5]=Integer.toString(moves2);
        BattleMatrix[9]=Integer.toString(moves3);
        BattleMatrix[12]=Integer.toString(moves4);
        
        BattleMatrix[3]=Integer.toString(received1);
        BattleMatrix[6]=Integer.toString(received2);
        BattleMatrix[10]=Integer.toString(received3);
        BattleMatrix[13]=Integer.toString(received4);
    }
    
    return BattleMatrix;
}

public static void writeStats(Pokemon pok1,Pokemon pok2,Pokemon pok3,Pokemon pok4){
    
    Tools.clearMatrix(12,13,6,16);
    Tools.clearMatrix(12,13,130,140);
    Tools.clearMatrix(52,53,6,16);
    Tools.clearMatrix(52,53,130,140);
   
    Tools.writeMatrix("NOMBRE: "+pok1.Name,10,11,6,13+pok1.Name.length());
    Tools.writeMatrix("ATAQUE: "+Integer.toString(pok1.Attack),11,12,6,13+Integer.toString(pok1.Attack).length());
    Tools.writeMatrix("VIDA: "+Integer.toString(pok1.Life),12,13,6,11+Integer.toString(pok1.Life).length());
    Tools.writeMatrix("ESTADO: "+pok1.State,13,14,6,13+pok1.State.length());
    
    Tools.writeMatrix("NOMBRE: "+pok2.Name,10,11,130,137+pok2.Name.length());
    Tools.writeMatrix("ATAQUE: "+Integer.toString(pok2.Attack),11,12,130,137+Integer.toString(pok2.Attack).length());
    Tools.writeMatrix("VIDA: "+Integer.toString(pok2.Life),12,13,130,135+Integer.toString(pok2.Life).length());
    Tools.writeMatrix("ESTADO: "+pok2.State,13,14,130,137+pok2.State.length());
    
    Tools.writeMatrix("NOMBRE: "+pok3.Name,50,51,6,13+pok3.Name.length());
    Tools.writeMatrix("ATAQUE: "+Integer.toString(pok3.Attack),51,52,6,13+Integer.toString(pok3.Attack).length());
    Tools.writeMatrix("VIDA: "+Integer.toString(pok3.Life),52,53,6,11+Integer.toString(pok3.Life).length());
    Tools.writeMatrix("ESTADO: "+pok3.State,53,54,6,13+pok3.State.length());
    
    Tools.writeMatrix("NOMBRE: "+pok4.Name,50,51,130,137+pok4.Name.length());
    Tools.writeMatrix("ATAQUE: "+Integer.toString(pok4.Attack),51,52,130,137+Integer.toString(pok4.Attack).length());
    Tools.writeMatrix("VIDA: "+Integer.toString(pok4.Life),52,53,130,135+Integer.toString(pok4.Life).length());
    Tools.writeMatrix("ESTADO: "+pok4.State,53,54,130,137+pok4.State.length());
    
}

public static void mostUsed(Pokemon pok1,Pokemon pok2,Pokemon pok3,Pokemon pok4,Pokemon pok5,Pokemon pok6){
    
    //SE INTRODUCEN LOS "COUNTERS" DE CADA POKEMON Y ABAJO DE ESE DATO EL NUMERO DE POKEMON
    int [][] popularsPokemons= new int [2][6];
    
    popularsPokemons[0][0]=pok1.counter;
    popularsPokemons[1][0]=1;
    
    popularsPokemons[0][1]=pok2.counter;
    popularsPokemons[1][1]=2;
    
    popularsPokemons[0][2]=pok3.counter;
    popularsPokemons[1][2]=3;
    
    popularsPokemons[0][3]=pok4.counter;
    popularsPokemons[1][3]=4;
    
    popularsPokemons[0][4]=pok5.counter;
    popularsPokemons[1][4]=5;
    
    popularsPokemons[0][5]=pok6.counter;
    popularsPokemons[1][5]=6;
    
    popularsPokemons=Tools.burbujaDesc(popularsPokemons);
    
    for(int i=0; i<popularsPokemons[0].length;i++){
        
       switch(popularsPokemons[1][i]){
           case 1:
           Tools.writeMatrix("USADO: "+popularsPokemons[0][i]+" veces",20,21,75,87+Integer.toString(popularsPokemons[0][i]).length());
           Launcher.listPokemon(pok1,31);
           break;
           case 2:
           Tools.writeMatrix("USADO: "+popularsPokemons[0][i]+" veces",20,21,75,87+Integer.toString(popularsPokemons[0][i]).length());
           Launcher.listPokemon(pok2,20);
           break;
           case 3:
           Tools.writeMatrix("USADO: "+popularsPokemons[0][i]+" veces",20,21,75,87+Integer.toString(popularsPokemons[0][i]).length());
           Launcher.listPokemon(pok3,20);
           break;
           case 4:
           Tools.writeMatrix("USADO: "+popularsPokemons[0][i]+" veces",20,21,75,87+Integer.toString(popularsPokemons[0][i]).length());
           Launcher.listPokemon(pok4,22);
           break;
           case 5:
           Tools.writeMatrix("USADO: "+popularsPokemons[0][i]+" veces",20,21,75,87+Integer.toString(popularsPokemons[0][i]).length());
           Launcher.listPokemon(pok5,20);
           break;
           case 6:
           Tools.writeMatrix("USADO: "+popularsPokemons[0][i]+" veces",20,21,75,87+Integer.toString(popularsPokemons[0][i]).length());
           Launcher.listPokemon(pok6,18);
           break;
           
       } 
       
    }
       
}

public static void mostUnused(Pokemon pok1,Pokemon pok2,Pokemon pok3,Pokemon pok4,Pokemon pok5,Pokemon pok6){
    
    //SE INTRODUCEN LOS "COUNTERS" DE CADA POKEMON Y ABAJO DE ESE DATO EL NUMERO DE POKEMON
    int [][] UnpopularsPokemons= new int [2][6];
    
    UnpopularsPokemons[0][0]=pok1.counter;
    UnpopularsPokemons[1][0]=1;
    
    UnpopularsPokemons[0][1]=pok2.counter;
    UnpopularsPokemons[1][1]=2;
    
    UnpopularsPokemons[0][2]=pok3.counter;
    UnpopularsPokemons[1][2]=3;
    
    UnpopularsPokemons[0][3]=pok4.counter;
    UnpopularsPokemons[1][3]=4;
    
    UnpopularsPokemons[0][4]=pok5.counter;
    UnpopularsPokemons[1][4]=5;
    
    UnpopularsPokemons[0][5]=pok6.counter;
    UnpopularsPokemons[1][5]=6;
    
    UnpopularsPokemons=Tools.burbujaAsc(UnpopularsPokemons);
    
    for(int i=0; i<UnpopularsPokemons[0].length;i++){
        
       switch(UnpopularsPokemons[1][i]){
           case 1:
           Tools.writeMatrix("USADO: "+UnpopularsPokemons[0][i]+" veces",20,21,75,87+Integer.toString(UnpopularsPokemons[0][i]).length());
           Launcher.listPokemon(pok1,31);
           break;
           case 2:
           Tools.writeMatrix("USADO: "+UnpopularsPokemons[0][i]+" veces",20,21,75,87+Integer.toString(UnpopularsPokemons[0][i]).length());
           Launcher.listPokemon(pok2,20);
           break;
           case 3:
           Tools.writeMatrix("USADO: "+UnpopularsPokemons[0][i]+" veces",20,21,75,87+Integer.toString(UnpopularsPokemons[0][i]).length());
           Launcher.listPokemon(pok3,20);
           break;
           case 4:
           Tools.writeMatrix("USADO: "+UnpopularsPokemons[0][i]+" veces",20,21,75,87+Integer.toString(UnpopularsPokemons[0][i]).length());
           Launcher.listPokemon(pok4,22);
           break;
           case 5:
           Tools.writeMatrix("USADO: "+UnpopularsPokemons[0][i]+" veces",20,21,75,87+Integer.toString(UnpopularsPokemons[0][i]).length());
           Launcher.listPokemon(pok5,20);
           break;
           case 6:
           Tools.writeMatrix("USADO: "+UnpopularsPokemons[0][i]+" veces",20,21,75,87+Integer.toString(UnpopularsPokemons[0][i]).length());
           Launcher.listPokemon(pok6,18);
           break;
           
       } 
       
    }
       
}

public static void prueba(){
    int matrixP[][]= new int[2][6];
    
    matrixP[0][0]=0;
    matrixP[1][0]=1;
    
    matrixP[0][1]=5;
    matrixP[1][1]=2;
    
    matrixP[0][2]=1;
    matrixP[1][2]=3;
    
    matrixP[0][3]=6;
    matrixP[1][3]=4;
    
    matrixP[0][4]=2;
    matrixP[1][4]=5;
    
    matrixP[0][5]=1;
    matrixP[1][5]=6;
    
    matrixP=Tools.burbujaDesc(matrixP);
    
    for(int i=0;i<matrixP.length;i++){
        
        for(int j=0;j<matrixP[0].length;j++){
            System.out.print(matrixP[i][j]);
        }
        System.out.println("");
    }
}
 

//ICONOS DE POKEMONES EN FORMATO STRING
//39 CARACTERES
   
//31 LINEAS
static String torchicIco=
"                              ,.        " +
"                           (....        " +
"                         .......        " +
"                       (.......&        " +
"                 .%   .........         " +
"                (..  .........@    (... " +
"                .............. ....../  " +
"                ...&.*..............    " +
"                &...#,*@..........      " +
"         @.,.....,,******...,,&         " +
"     (,,,.......,,,,******@             " +
"   (,,,,.....,,,,,***********           " +
"  **,,,,,,,,,*****************&         " +
" #**,,,************************@        " +
"( **************& #/************        " +
"*** ..*******&& .&************(         " +
" ** ......@****%&((#************        " +
"  ******((*********************         " +
"    *************************/          " +
"      .********************,            " +
"   ......,,****,,****,,...&             " +
"   /.,....****....,.........            " +
"     ,,.,******..........,,,,           " +
"      *@*******(./,.,...,,&&            " +
"       ,,**********,**(.****#           " +
"        ,,****************(             " +
"          @,***********@                " +
"              ,, *,*,@,,,(              " +
"              .. @.,,,*&                " +
"       ....&.....,,@                    " +
"     (.,  ...@...  &                    " +
"         %.. ...                        ";

//22 LINEAS   
static String charmanderIco=
"        (,,,,,(                         " +
"     *,..,,,,,,**                       " +
"    ,,.,,,,,,,,,**                      " +
"    &,,,,,,,,,* @*#                     " +
"   % ,,,,,,,,,,&&%*                     " +
"   &&,,,,,,,,,,((#*&                    " +
"   ,,,,,,,,,,,,,***/                    " +
"   */*,,,,,,,*%%,//                *(   " +
"    .**#///*,,,%**.              ,///   " +
"        *//****/*(,              ,**.(  " +
"     .*,,**/.****,,,,,*.         ****., " +
" ,,,,,,,,#     .,,,,,,,,,,*,/  *.../.., " +
" /,,,,,*&        ,,,,,,,(#/,    ..,..// " +
"                  ,,*%           *.,,*  " +
"                   ,,,,            ,    " +
"                   (,,,,         .**    " +
"      ,,#      ..,,,.,,,,,     ////     " +
"    (..,,/......../..,,,,*////////      " +
"    ,,,****/......#,,,,,**#////,/       " +
"    (*******/%#,#/,&**********          " +
"   /#/**/**          ******             " +
"   ,(%                **%/.#.           ";
   
   //20 LINEAS
   static String squirtleIco=
"            /,,,,,,*                    " +
"         ,..,,,*,*,***                  " +
"         *,,,,,,*  #***#                " +
"       %(,,,,,,,@@&,*///*               " +
"       #,,,,,,,,///#////%               " +
"      %%,*/%#/***,*/////,               " +
"       ,///////////////&                " +
"         .**/////////#,&*               " +
"     %,,,*,****(#//,,///#/,             " +
" ,(,,,,,//...,***%..,,*/(//.            " +
" /,,,,,%.....%..#,,*,***&//*            " +
"/////%.....,..,*/****%,/**              " +
"       ........%#////%/, //*            " +
"       ....../%//*#,**/,.(/&   #,,,,/   " +
"      /*..........**/*,(,%(% /,,,,*///( " +
"     ,.,,,.....,***,,,,,,&(,////#////// " +
"     .,,,/%,***#*,,,,,,,,////////////// " +
"     ***////  #//%/,,,,,,///////%/////  " +
"   /@*/////        /****//. .%(//(/     " +
"                    //////*             ";

//20 LINEAS   
 static String mudkipIco=
"            %.,*%                       " +
"          (,******                      " +
"         *********&                     " +
"         ***(*****(                     " +
"         ***#**(**&                     " +
"         %*****#**/                     " +
"          *****(**                      " +
"          *****/*(                      " +
"       #**(**(*******                   " +
"     %,,,**/***********                 " +
"    /*******************         /..... " +
"   %**** ******#****/***&     (........ " +
"%**,*/*(%*****@@***,,,,,* ,#%....*...., " +
" (*,,************/*,,,*****&.........(  " +
"%***/**  .,%(**************.........    " +
"   **(//.........***********,,.....     " +
"         %......./((//&,///,,,,,,       " +
"         .*/(,,,,*/////////*,,,         " +
"          ****/ &*****/&///,*           " +
"          /*#(    ****((/#              ";

//20 LINEAS
 static String treeckoIco=
"             ,.*                        " +
"       ,..,*.....%                      " +
"       ,..,*......,                     " +
"       ,...(...%(..%                    " +
"       ,...,...  @.,                    " +
"       /,.....,..,.*#                   " +
" .#     ......../***#       ...#        " +
"./..,,  ......**//*(      *.#*#*.       " +
" /...*.  /.,**///*#.#......(**/         " +
"   *......,******,...*(                 " +
"             ,*****.                    " +
"            (******..                   " +
"            ,,*****.,                   " +
"            ******/**                   " +
"             #///(***********           " +
"             **#(***/******,,,,*   **(  " +
"            %..*((..%(************@**** " +
"           (..( .(,..(#(/************// " +
"      ....,/...   ....((((((/*********  " +
"       *,&***%  ...(,...&*   %#((#%     ";

//18 LINEAS
static String bulbasaurIco=
"                              #% #/     " +
"                     .,,  *%***#*(/%    " +
"                *,,,*************(/     " +
"     .        (/*****%*,*********//     " +
"    ,,,/,,,,,,,,*/,,,,*/********/(//    " +
"   /,,.,,,#((((,*,,**,*/******////(//   " +
"  %,,,,,&(((,,,,,*,,,,*///////////////  " +
" (*#,,(,*,,*,*/,*/@,,,**%&/////////&//# " +
"* #,*,,,,((,,(,* //(%*/**//&/////////// " +
", ( ,,,,,/#,,,,  (, (//////(((#//#///// " +
",,@(,,,*,**,**(  (//////////((((//////% " +
"&//*,,,,/,,,,,*,,***(//////////*//&/#   " +
"  .**#(((((((((((%///*//*,***///**//    " +
"    (,%//&%#&(////*@/,,,,,,*%%*%(*//%   " +
"     ,,#**//(//((///,,*/,,**&*/((////   " +
"     #//#***//%///(///,,,,*(***%%////   " +
"      ,,*****   */&((*,,**&,////////.   " +
"      /.&.*%      *,,,***    ./(/%/     ";


   
   

    
}
