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
            DataCollector.currentBattle[6]=S.next();
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
                    DataCollector.currentBattle[5]=menu;        
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
                
                
            
            
            break;
    case 4:
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
            objPok.Life=newValue;
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

public static String[] Battle(){
    
    String currentBattle[];
    currentBattle = new String[15];
    
    
    
    
    return currentBattle;
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

public static void showStats(int pok1,int pok2,int pok3,int pok4){
    
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
