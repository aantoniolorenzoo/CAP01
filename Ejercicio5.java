public class Ejercicio5 {
    public static void main(String[] args){
        System.out.printf("%-27s%-16s%-18s%-18s%-15s\n",RED_BRIGHT+"Lunes","Martes","Miércoles","Jueves","Viernes");
        System.out.println("=======================================================================================\n");
        System.out.printf("%-25s%-25s%-25s%-25s%-25s\n",PURPLE_BRIGHT+"Programación",BLUE_BRIGHT+"Leng Marcas",BLUE_BRIGHT+"Leng Marcas",PURPLE_BRIGHT+"Programación",RESET+"FOL");
        System.out.printf("%-25s%-25s%-25s%-25s%-25s\n",PURPLE_BRIGHT+"Programación",BLUE_BRIGHT+"Leng Marcas",BLUE_BRIGHT+"Leng Marcas",PURPLE_BRIGHT+"Programación",RESET+"FOL");
        System.out.printf("%-25s%-25s%-25s%-25s%-25s\n",PURPLE_BRIGHT+"Programación",GREEN_BRIGHT+"Bases de Datos",PURPLE_BRIGHT+"Programación",PURPLE_BRIGHT+"Programación",RESET+"FOL");
        System.out.printf("%-25s%-25s%-25s%-25s%-25s\n",YELLOW_BRIGHT+"Sist.Inf",GREEN_BRIGHT+"Base de Datos",PURPLE_BRIGHT+"Programación",GREEN_BRIGHT+"Bases de Datos",YELLOW_BRIGHT+"Sist.Inf");
        System.out.printf("%-25s%-25s%-25s%-25s%-25s\n",YELLOW_BRIGHT+"Sist.Inf",CYAN_BRIGHT+"Ent.Desa",GREEN_BRIGHT+"Bases de Datos",GREEN_BRIGHT+"Bases de Datos",YELLOW_BRIGHT+"Sist.Inf");
        System.out.printf("%-25s%-25s%-25s%-25s%-25s\n",YELLOW_BRIGHT+"Sist.Inf",CYAN_BRIGHT+"Ent.Desa",GREEN_BRIGHT+"Bases de Datos",CYAN_BRIGHT+"Ent.Desa",YELLOW_BRIGHT+"Sist.Inf");

    }  
//PROGRAMACION = PURPLE , BASE DE DATOS = VERDE, LENGUAJES DE PROGRAMACION=AZUL, ENTORNOS DE DESARROLLO AMARILLO, SISTEMAS INFORMATICOS=Cyan, Fol= White
    public static final String RESET = "\033[0m";  // Text Reset
    public static final String BLACK_BRIGHT = "\033[0;90m";  // BLACK
    public static final String RED_BRIGHT = "\033[0;91m";    // RED
    public static final String GREEN_BRIGHT = "\033[0;92m";  // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String BLUE_BRIGHT = "\033[0;94m";   // BLUE
    public static final String PURPLE_BRIGHT = "\033[0;95m"; // PURPLE
    public static final String CYAN_BRIGHT = "\033[0;96m";   // CYAN
    public static final String WHITE_BRIGHT = "\033[0;97m";  // WHITE
}