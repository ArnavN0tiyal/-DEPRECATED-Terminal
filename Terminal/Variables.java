package Terminal;
import java.util.Scanner;
//* Stores variables
public class Variables {
    static String cmd;
    static int exit = 1;
    static int print = 1;
    static String username = "User";
    static String brand = "Dell";
    static Process proc;
    static final Scanner sc = new Scanner(System.in);
    static final Runtime run = Runtime.getRuntime();
    static int choice;
    static String default_brand = "Dell";
    static String default_username = "User";
    static String confirm;
    static int range = 10;
    static int guess;
    static int chance = (int)(1 + Math.random()* 1000);
    static int num;
    static int RPSCHOICE;
    static final String RESET = "\033[0m";  
    static final String BLACK = "\033[0;30m"; 
    static final String RED = "\033[0;31m";  
    static final String GREEN = "\033[0;34m"; 
    static final String BLUE = "\033[0;33m";
    static final String RED_BRIGHT = "\033[0;91m";    
    static final String GREEN_BRIGHT = "\033[0;92m"; 
    static int computer_choice = (int)(1 + Math.random()*3);
    static int chances;
}