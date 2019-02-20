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
    
    
    
public static void main(String[] args) {
        
    Data DataCollector = new Data();
        
    //Objetos Pokemon
    Pokemon Charmander=new Pokemon(charmanderIco,"CHARMANDER");
    Pokemon Squirtle=new Pokemon(squirtleIco,"SQUIRTLE");
    Pokemon Bulbasaur=new Pokemon(bulbasaurIco,"BULBASAUR");
    Pokemon Torchic=new Pokemon(torchicIco,"TORCHIC");
    Pokemon Mudkip=new Pokemon(mudkipIco,"MUDKIP");
    Pokemon Treecko=new Pokemon(treeckoIco,"TREECKO"); 
      
        
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
            break;
    case 4:
        // SE PIDEN LOS DATOS DE LOS JUGADORES Y LOS POKEMONES A USAR
            System.out.println("Ingrese Nombre del jugador 1");
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
                    DataCollector.currentBattle[3]=menu;        
                }
                else{
                    System.err.println("OPCION INVALIDA");
                    break;
                }
    
            System.out.println("Ingrese Nombre del jugador 2");
            DataCollector.currentBattle[5]=S.next();
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
                    DataCollector.currentBattle[6]=menu;        
                }
                else{
                    System.err.println("OPCION INVALIDA");
                break;
                }
            System.out.print("\n Segundo Pokemon: ");
            menu=S.next();
                if(Tools.validaNum(menu,1,6)){
                    DataCollector.currentBattle[8]=menu;        
                }
                else{
                    System.err.println("OPCION INVALIDA");
                    break;
                }
        //Se clasifican los datos para mandarlos a la funcion de Battle
        Pokemon pok1=Torchic;
        Pokemon pok2=Torchic;
        Pokemon pok3=Torchic;
        Pokemon pok4=Torchic;
        
        //pok(n) es igual al un objeto pokemon segun la decision del usuario.
        switch(DataCollector.currentBattle[1]){
            case "1":
            pok1=Torchic;
            Tools.writeMatrix(torchicIco,3,34,31,69);
            break;
            case "2":
            pok1=Mudkip;
            Tools.writeMatrix(mudkipIco,3,23,31,69);
            break;
            case "3":
            pok1=Treecko;
            Tools.writeMatrix(treeckoIco,3,23,31,69);
            break;
            case "4":
            pok1=Charmander;
            Tools.writeMatrix(charmanderIco,3,25,31,69);
            break;
            case "5":
            pok1=Squirtle;
            Tools.writeMatrix(squirtleIco,3,23,31,69);
            break;
            case "6":
            pok1=Bulbasaur;
            Tools.writeMatrix(bulbasaurIco,3,21,31,69);
        }
        switch(DataCollector.currentBattle[3]){
            case "1":
            pok2=Torchic;
            Tools.writeMatrix(torchicIco,3,34,81,119);
            break;
            case "2":
            pok2=Mudkip;
            Tools.writeMatrix(mudkipIco,3,23,81,119);
            break;
            case "3":
            pok2=Treecko;
            Tools.writeMatrix(treeckoIco,3,23,81,119);
            break;
            case "4":
            pok2=Charmander;
            Tools.writeMatrix(charmanderIco,3,25,81,119);
            break;
            case "5":
            pok2=Squirtle;
            Tools.writeMatrix(squirtleIco,3,23,81,119);
            break;
            case "6":
            pok2=Bulbasaur;
            Tools.writeMatrix(bulbasaurIco,3,21,81,119);
        }
        switch(DataCollector.currentBattle[6]){
            case "1":
            pok3=Torchic;
            Tools.writeMatrix(torchicIco,43,74,31,69);
            break;
            case "2":
            pok3=Mudkip;
            Tools.writeMatrix(mudkipIco,43,63,31,69);
            break;
            case "3":
            pok3=Treecko;
            Tools.writeMatrix(treeckoIco,43,63,31,69);
            break;
            case "4":
            pok3=Charmander;
            Tools.writeMatrix(charmanderIco,43,65,31,69);
            break;
            case "5":
            pok3=Squirtle;
            Tools.writeMatrix(squirtleIco,43,63,31,69);
            break;
            case "6":
            pok3=Bulbasaur;
            Tools.writeMatrix(bulbasaurIco,43,61,31,69);
        }
        switch(DataCollector.currentBattle[8]){
            case "1":
            pok4=Torchic;
            Tools.writeMatrix(torchicIco,43,74,81,119);
            break;
            case "2":
            pok4=Mudkip;
            Tools.writeMatrix(mudkipIco,43,63,841,119);
            break;
            case "3":
            pok4=Treecko;
            Tools.writeMatrix(treeckoIco,43,63,81,119);
            break;
            case "4":
            pok4=Charmander;
            Tools.writeMatrix(charmanderIco,43,65,81,119);
            break;
            case "5":
            pok4=Squirtle;
            Tools.writeMatrix(squirtleIco,43,63,81,119);
            break;
            case "6":
            pok4=Bulbasaur;
            Tools.writeMatrix(bulbasaurIco,43,61,81,119);
        }
        Tools.writeMatrix("JUGADOR 1: "+DataCollector.currentBattle[1],1,2,70,DataCollector.currentBattle[0].length()+80);
        Tools.writeMatrix("JUGADOR 2: "+DataCollector.currentBattle[5],39,40,70,DataCollector.currentBattle[5].length()+80);
        Tools.printMatrix(0,74,0,159);
        //SE MANDAN DATOS A LA FUNCION BATTLE
        Launcher.Battle(DataCollector.currentBattle, pok1, pok2, pok3, pok4); 
        
            break;        
    case 5:
            break;
    case 6:
            break;
    case 7:
            runTime=false;
            break;
    default:
            System.err.println("OPCION NO VALIDA");
        }
    }
        
}
             
}
    
    
// Lista el pokemon recibido    
public static void listPokemon(Pokemon arg1,int lineas){
    
    Tools.writeMatrix(arg1.Icon,3,lineas+3,31,69);
    Tools.writeMatrix("NOMBRE: "+arg1.Name,10,11,6,13+arg1.Name.length());
    Tools.writeMatrix("ATAQUE: "+Integer.toString(arg1.Attack),11,12,6,13+Integer.toString(arg1.Attack).length());
    Tools.writeMatrix("VIDA: "+Integer.toString(arg1.Life),12,13,6,11+Integer.toString(arg1.Life).length());
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
    System.err.println("ES EL TURNO DEL JUGADOR "+turno);
    
    //SE IMPRIME MATRIZ Y SE IMPRIMEN LAS STATS
    
    while(control){
        
        // SI EL TURNO ES DEL JUGADOR 1
        if(turno==1){
        System.err.println("ES EL TURNO DEL JUGADOR "+turno);
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
        to=S.nextInt();
        
            if(Tools.validaNum(Integer.toString(from),1,2)&&Tools.validaNum(Integer.toString(to),1,2)){
                //Se aumenta el contador de numeros de ataques realizados por el pokemon
                BattleMatrix[2]=(from==1)?BattleMatrix[2]+1:BattleMatrix[2];
                BattleMatrix[4]=(from==2)?BattleMatrix[4]+1:BattleMatrix[4];
                
                //Se realiza las resta a la vida del pokemon segun las decisiones tomadas
                pok3.Life=(from==1&&to==1)?pok3.Life-pok1.Attack:pok3.Life;
                pok3.Life=(from==2&&to==1)?pok3.Life-pok2.Attack:pok3.Life;
                pok4.Life=(from==1&&to==2)?pok4.Life-pok1.Attack:pok4.Life;
                pok4.Life=(from==2&&to==2)?pok4.Life-pok2.Attack:pok4.Life;
                turno=2;
                System.out.println(pok3.Life);
                System.out.println(pok4.Life);
            }
            else{
                System.err.println("OPCIONES NO VALIDAS");
            }
            
        }
        
        // SI EL TURNO ES DEL JUGADOR 2
        else{
        System.err.println("ES EL TURNO DEL JUGADOR "+turno);
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
        to=S.nextInt();
        
            if(Tools.validaNum(Integer.toString(from),1,2)&&Tools.validaNum(Integer.toString(to),1,2)){
                //Se aumenta el contador de numeros de ataques realizados por el pokemon
                BattleMatrix[6]=(from==1)?BattleMatrix[6]+1:BattleMatrix[6];
                BattleMatrix[8]=(from==2)?BattleMatrix[8]+1:BattleMatrix[8];
                
                //Se realiza las resta a la vida del pokemon segun las decisiones tomadas
                pok1.Life=(from==1&&to==1)?pok1.Life-pok3.Attack:pok1.Life;
                pok1.Life=(from==2&&to==1)?pok1.Life-pok4.Attack:pok1.Life;
                pok2.Life=(from==1&&to==2)?pok2.Life-pok3.Attack:pok2.Life;
                pok2.Life=(from==2&&to==2)?pok2.Life-pok4.Attack:pok2.Life;
                turno=1;
                System.out.println(pok1.Life);
                System.out.println(pok2.Life);
            }
            else{
                System.err.println("OPCIONES NO VALIDAS");
            }
            
        }
        
        //SE IMPRIME MATRIZ Y STATS
        Launcher.showStats(pok1, pok2, pok3, pok4);
        Tools.printMatrix(0,74,0,159);
        
        //SE VERIFICA SI HAY UN GANADOR
        if(pok1.Life<=0 && pok2.Life<=0){
        System.out.println("EL GANADOR ES "+BattleMatrix[5]);
        BattleMatrix[10]=BattleMatrix[5];
        control=false;    
        }
        if(pok3.Life<=0 && pok4.Life<=0){
        System.out.println("EL GANADOR ES "+BattleMatrix[0]);
        BattleMatrix[10]=BattleMatrix[0];
        control=false;
        }
    }
    
    return BattleMatrix;
}

public static void showPokemon(int pok1,int pok2,int pok3,int pok4){
    
    for(int i=1;i<=4;i++){
    switch(i){
        case 1:
        break;
        case 2:
        break;
        case 3:
        break;
        case 4:
        break;
    }
    }
}

public static void showStats(Pokemon pok1,Pokemon pok2,Pokemon pok3,Pokemon pok4){
   
    Tools.writeMatrix("NOMBRE: "+pok1.Name,10,11,6,13+pok1.Name.length());
    Tools.writeMatrix("ATAQUE: "+Integer.toString(pok1.Attack),11,12,6,13+Integer.toString(pok1.Attack).length());
    Tools.writeMatrix("VIDA: "+Integer.toString(pok1.Life),12,13,6,11+Integer.toString(pok1.Life).length());
    
    Tools.writeMatrix("NOMBRE: "+pok2.Name,10,11,130,13+pok2.Name.length());
    Tools.writeMatrix("ATAQUE: "+Integer.toString(pok2.Attack),11,12,6,13+Integer.toString(pok2.Attack).length());
    Tools.writeMatrix("VIDA: "+Integer.toString(pok2.Life),12,13,6,11+Integer.toString(pok2.Life).length());
    
    Tools.writeMatrix("NOMBRE: "+pok3.Name,50,51,6,13+pok3.Name.length());
    Tools.writeMatrix("ATAQUE: "+Integer.toString(pok3.Attack),11,12,6,13+Integer.toString(pok3.Attack).length());
    Tools.writeMatrix("VIDA: "+Integer.toString(pok3.Life),12,13,6,11+Integer.toString(pok3.Life).length());
    
    Tools.writeMatrix("NOMBRE: "+pok4.Name,50,51,130,13+pok4.Name.length());
    Tools.writeMatrix("ATAQUE: "+Integer.toString(pok4.Attack),11,12,6,13+Integer.toString(pok4.Attack).length());
    Tools.writeMatrix("VIDA: "+Integer.toString(pok4.Life),12,13,6,11+Integer.toString(pok4.Life).length());
    
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
