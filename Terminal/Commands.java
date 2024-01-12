package Terminal;
import java.io.IOException;
import java.time.LocalTime;
import java.util.ArrayList;
//* List of commands and their functions
//* Don't remove or else the main executor can't recognize the functions
public class Commands extends Colours {
    public static void help() {
    System.out.println("ECHO         Prints a string on the console or turns on or off command echoing\nVERIFY       Verifies if that the files are correctly written to the Devops disk\nTIME         Shows the time\nEXIT         Exits the terminal\nADD          Adds two numbers\nSUB          Subtracts two numbers\nMUL          Multiplies two numbers\nDIV          Divides two numbers\nUSERNAME     Sets your username\nBRANDTYPE    Sets the user's computer brand\nOPEN         Opens a program. To see the list of programs that work, type \"programs\" in the command line\nSHUTDOWN     Allows proper and local shutdown of the computer\nJLIST        Gives a bit of help about java lists\nJPROJECT     Gives some projects to do in java\nTODOGER      Runs a todo manager\nASCV         Gives the ascii value of characters\nCOLOUR       Same as \"Colour /?\" which gives a list of colours usable\nNumGuess     Plays a number guessing game *Range of guessing numbers is custamizable*\nRPS          Plays rock paper scissors *Player or computer*\nCLEAR        Clears the terminal\n");
}

public static void echo() {
    System.out.print("Type the sentence you want to print: ");
    String line = sc.nextLine();
    System.out.println(line + "\n");
}

public static void echo_on() {
    print = 1;
}

public static void echo_off() {
    print = 0;
}

public static void verify() {
        int chance = (int)(1 + Math.random()* 1000);
        System.out.println(chance);
        if (chance >= 1) {
            System.out.println("Files are correctly written to the disk.\n");
        } else if (chance == 1000) {
            System.out.println("Files aren't written correctly to the disk. Please restart the terminal.\n");
            sc.close();
        }
}

public static void showtime() {
    LocalTime time = LocalTime.now();
    System.out.println("The current time is: " + time + "\n");
}

public static void exit() {
    exit = 0;
    sc.close();
}

public static void addition() {
    System.out.print("Type the first addend: ");
    double addend1 = sc.nextDouble();
    System.out.print("Type the second addend: ");
    double addend2 = sc.nextDouble();
    double sum = addend1 + addend2;
    System.out.println("The sum of " + addend1 + " and " + addend2 + " is " + sum + ".\n");
}

public static void subtraction() {
    System.out.print("Type the mineund: ");
    double mineund = sc.nextDouble();
    System.out.print("Type the subtrahend: ");
    double subtrahend = sc.nextDouble();
    double difference = mineund - subtrahend;
    System.out.println("The difference of " + mineund + " and " + subtrahend + " is " + difference + ".\n");
}

public static void multiplication() {
    System.out.print("Type the multiplier: ");
    double multiplier = sc.nextDouble();
    System.out.print("Type the multiplicand: ");
    double multiplicand = sc.nextDouble();
    double product = multiplier*multiplicand;
    System.out.println("The product of " + multiplier + " and " + multiplicand + " is " + product + ".\n");
}

public static void division() {
    System.out.print("Type the dividend: ");
    double dividend = sc.nextDouble();
    System.out.print("Type the divisor: ");
    double divisor = sc.nextDouble();
    if (divisor != 0) {
    double quotient = dividend/divisor;
    double remainder = dividend % divisor;
    System.out.println("The quotient of " + dividend + " and " + divisor + " is " + quotient + " and the remainder is " + remainder + ".\n");
} else {
    System.out.println("Can't divide by zero.\n");
 }
}

public static void username() {
    System.out.print("Type the username you want it to be: ");
    username = sc.nextLine();
    System.out.println("Successfully set the username to: " + username + ".\n");
}

public static void brandtype() {
    System.out.print("Type your laptop brand: ");
    brand = sc.nextLine();
    System.out.println("Successfully changed the laptop brand to: " + brand + ".\n");
}

public static void applications() {
    final Runtime run = Runtime.getRuntime();
    System.out.print("Type the program you want to open: ");
    String program = sc.nextLine();
    try {
    switch(program) {
        case "edge","Edge","EDGE":
        proc = run.exec(new String[]{"C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe"});
        break;
        case "command prompt","Command prompt","Command Prompt","COMMAND PROMPT","cmd","Cmd","CMD":
        proc = run.exec(new String[]{"cmd","/C","Start","Nevertx Promopt"});
        break;
        case "calculator","CALCULATOR","calc","CALC":
        proc = run.exec(new String[]{"calc","/C","Start"});
        break;
        case "vscode","Vscode","VSCODE","visual studio code","Visual studio code","Visual Studio Code","VISUAL STUDIO CODE","code","Code","CODE":
        proc = run.exec(new String[]{"cmd","/K","code"});
        break;
        default:
        System.out.println("Unknown Program. Type a vaild program name.\n");
        break;
     }
    }
    catch(Exception ex) {
        System.out.println("Failed to execute.\n");
    }
}

public static void programs() {
    System.out.println("1) EDGE\n2) EXPLORER\n3) VSCODE\n4) CALCULATOR\n");
}

public static void shutdown_help() {
    System.out.println("How to use: shutdown /i, /l, /s, /sg, /r, /g, /a, /p, /h\nNo args    This is the same as doing /?\n/i         Shows the graphical user interface\n/?         Gives the type of shutdown the user can do\n/l         Logs off the computer\n/s         Complete shutdown of the computer\n/sg        Shutdowns the computer. Then on the next boot, if automatic sign in is enabled then it will automaticly sign in to the user's computer\n/r         Shutdowns then restarts\n/g         Shutdowns and restarts. After the system is rebooted, if automatic sign in is enabled, the user will automaticly sign in\n/a         Abort a system shutdown *Can only be used in time out period*\n/p         Turns off the computer without any warning or time out\n/h         Hibernate the local computer\n");
}
public static void shutdown_1() throws IOException {
    System.out.print("Are you sure?\nType yes or no: ");
    confirm = sc.nextLine();
    if (confirm.equalsIgnoreCase("yes")) {
        proc = run.exec(new String[]{"cmd","/C","Start","shutdown", "/i"});
    } else {
        System.out.print("\n");
    }
}

public static void shutdown_2() throws IOException {
      System.out.print("Are you sure?\nType yes or no: ");
      confirm = sc.nextLine();
      if (confirm.equalsIgnoreCase("yes")) {
        proc = run.exec(new String[]{"cmd","/C","Start","shutdown", "/l"});
    } else {
        System.out.print("\n");
    }
}

public static void shutdown_3() throws IOException {
      System.out.print("Are you sure?\nType yes or no: ");
      confirm = sc.nextLine();
      if (confirm.equalsIgnoreCase("yes")) {
        proc = run.exec(new String[]{"cmd","/C","Start","shutdown", "/s"});
    } else {
        System.out.print("\n");
    }
}

public static void shutdown_4() throws IOException {
     System.out.print("Are you sure?\nType yes or no: ");
     confirm = sc.nextLine();
     if (confirm.equalsIgnoreCase("yes")) {
        proc = run.exec(new String[]{"cmd","/C","Start","shutdown", "/sg"});
    } else {
        System.out.print("\n");
    }
}

public static void shutdown_5() throws IOException {
      System.out.print("Are you sure?\nType yes or no: ");
      confirm = sc.nextLine();
      if (confirm.equalsIgnoreCase("yes")) {
        proc = run.exec(new String[]{"cmd","/C","Start","shutdown", "/r"});
    } else {
        System.out.print("\n");
    }
}

public static void shutdown_6() throws IOException {
      System.out.print("Are you sure?\nType yes or no: ");
      confirm = sc.nextLine();
      if (confirm.equalsIgnoreCase("yes")) {
        proc = run.exec(new String[]{"cmd","/C","Start","shutdown", "/g"});
    } else {
        System.out.print("\n");
    }
}

public static void shutdown_7() throws IOException {
     System.out.print("Are you sure?\nType yes or no: ");
     confirm = sc.nextLine();
     if (confirm.equalsIgnoreCase("yes")) {
        proc = run.exec(new String[]{"cmd","/C","Start","shutdown", "/a"});
    } else {
        System.out.print("\n");
    }
}

public static void shutdown_8() throws IOException {
      System.out.print("Are you sure?\nType yes or no: ");
      confirm = sc.nextLine();
      if (confirm.equalsIgnoreCase("yes")) {
        proc = run.exec(new String[]{"cmd","/C","Start","shutdown", "/p"});
    } else {
        System.out.print("\n");
    }
}

public static void shutdown_9() throws IOException {
      System.out.print("Are you sure?\nType yes or no: ");
      confirm = sc.nextLine();
      if (confirm.equalsIgnoreCase("yes")) {
        proc = run.exec(new String[]{"cmd","/C","Start","shutdown", "/h"});
    } else {
        System.out.print("\n");
    }
 }

public static void java_list() {
        System.out.println("Math Functions:\n1) abs(x)\n2) acos(x)\n3) asin(x)\n4) atan(x)\n5) atan2(y,x)\n6) coordinates(x, y)\n7) brt(x)\n8) ceil(x)\n9) copySign(x, y)\n10) cos(x)\n11) cosh(x)\n12) exp(x)\n13) expm1(x)\n14) floor(x)\n15) getExponent(x)\n16) hypot(x, y)\n17) IEEEremainder(x, y)\n18) log(x)\n19) log10(x)\n20) log1p(x)\n21) doublemax(x, y)\n22) min(x, y)\n23) extAfter(x, y)\n24) nextUp(x)\n25) pow(x, y)\n26) random()\n27) round(x)\n28) rint(x)\n29) signum(x)\n30) sin(x)\n31) sinh(x)\n32) sqrt(x)\n33) tan(x)\n34) tanh(x)\n35) toDegrees(x)\n36) toRadians(x)\n37) ulp(x)"); 
        System.out.println("ArrayLists:\nFormat - ArrayList<VarType> myArrayListName = new ArrayList<VarType>();\nFunctions:\n1) arraylist.add(\"Hello World\");\n2) arraylist.remove(0);\n3) arraylist.clear();\n4) arraylist.size();\n5) arraylist.get(0);\n6) arraylist.set(0, \"Hello World\")\nHow to loop through a arraylist:\nfor (int i = 0; i < arraylist.size(); i++) {\n System.out.println(arraylist.get(i));\n}\nor\nfor (String i : arraylist) {\n System.out.println(arraylist)\n}");
        System.out.println("Linked List is the same as arraylists but with extra functions. They're:\n1) addFirst();\n2) addLast();\n3) removeFirst();\n4) removeLast();\n5) getFirst();\n6) getLast();");
        System.out.println("Hashmap:\nFormat - Hashmap<VarType, VarType> myhashmapname = new Hashmap<VarType, VarType>();\nFunctions\n1) hashmap.put(\"Hello World\");\n2) hashmap.get(0);\n3) hashmap.remove(0);\n4) hashmap.clear();\n5) hashmap.size();\nHow to loop through hashmaps *Keys*:\nfor (String i : hashmap.keys()) {\n System.out.println(i)\n}\nValues:\nfor (String i : hashmap.values()) {\n System.out.println(i)\n}");
        System.out.println("Hashset:\nFormat is same as arraylists or linkedlists\nFunctions:\n1) hashset.add(\"Hello World\");\n2) hashset.contains(\"Hello World\");\n3) hashset.remove(0);\n4) hashset.clear();\n5) hashset.size();\nLooping through a hashmap is also the same as arraylists and linkedlists");
        System.out.println("Wrapper Classes:\nWe can't do ArrayList<int> array = new ArrayList<int>(); etc with any list type, instead, we use wrapper classes, like: Integer x = 10;, ArrayList<Boolean> array = new ArrayList<Boolean>(); etc. The types are:\n1) int to Integer\n2) float to Float\n3) double to Double\n4) boolean to Boolean\n5) char to Character\nWe can also get certain information about variables, Here are some functions which get certain information about variables:\n1) intvalue()\n2) byteValue()\n3) shortValue()\n4) longValue()\n5) floatValue()\n6) doubleValue()\n7) charValue()\n8) booleanValue()\n");
 }
public static void java_project() {
    System.out.println("Projects: 1) Number Guessing Game 2) Temperature Converter 3) Simple Chat Application 4) Guess the Word Game 5) Rock, Paper, Scissors Game 6) Basic ATM Simulator\n");
 }
public static void todo_Manager() {
    ArrayList<String> Tasks = new ArrayList<String>();
    Tasks.add("Tasks:");
    System.out.println("Welcome to your todo manager");
    do {
        System.out.print("0) Exit\n1) View tasks\n2) Add task\n3) Remove task\nType the index number of the function you want to use: ");
        choice = sc.nextInt();
        switch(choice) {
        case 0:
        choice = 0;
        break;
        case 1:
        if (Tasks.size() == 1) {
          System.out.println("No tasks");
        } else {
         for (String i : Tasks) {
           System.out.println(i);
         }
        }
        break;
        case 2:
        String line = sc.nextLine();
        System.out.print("Type your task: ");
        line = sc.nextLine();
        Tasks.add(Tasks.size() + ". " + line);
        System.out.println("Succesfully added the task: " + line);
        break;
        case 3:
        if (Tasks.size() == 1) {
          System.out.println("No task to remove");
        } else { 
            for (String i : Tasks) {
                System.out.println(i);
            }
        System.out.print("Type the index number of the task you want to remove: ");
        int remove = sc.nextInt();
        System.out.println("Successfully removed the task: " + Tasks.get(remove));
        Tasks.remove(remove);
        }
        break;
        default:
        System.out.println("Type a vaild choice number");
      }
    } while(choice != 0);
 }

 public static void ascii_value() throws IOException {
    System.out.print("Type the character you want to get the ascii value of: ");
    int ascii_value = System.in.read();
    sc.nextLine();
    System.out.println(ascii_value + "\n");
 }
 public static void colour() {
   System.out.println("-1 = Reset\n0 = Black\n1 = Red\n2 = Green\n3 = Blue\n1B = Red bright\n2B = Green bright\n");

 }
 public static void number_guessing__game() {
    System.out.print("Type the range from you want to guess the number: ");
    range = sc.nextInt();
    System.out.print("Type the number of chances allowed: ");
    chance = sc.nextInt();
    num = (int)(1 + Math.random()* range);
    do {
        System.out.println("Chances - " + chance);
        System.out.print("Type your number guess 1 - " + range + ": ");
        guess = sc.nextInt();
        if (chance != 0) {
            chance--;
        } else;
        System.out.println(chance);
        if (guess > num) {
            System.out.println("Lower!");
        } else if (guess < num) {
            System.out.println("Higher!");
        } else if (chance == 0) {
            System.out.println("You used all the chances!\n");
        } else {
            System.out.println("You won!\n");
            sc.nextLine();
        }
    } while (guess != num || chance == 0);
 }

 public static void RPS() {
    do {
        int RPSCHOICE;
        System.out.print("0) Exit\n1) 1v1\n2) Computer\nType your choice: ");
        RPSCHOICE = sc.nextInt();
        switch(RPSCHOICE) {
          case 0: break;
          case 1:
          sc.nextLine();
          System.out.print("Type the username of player 1: ");
          String pl1username = sc.nextLine();
          System.out.print("Type the username of player 2: ");
          String pl2username = sc.nextLine();
          System.out.print(pl1username + ": Rock paper scissors - Choose one: ");
          String pl1choice = sc.nextLine();
          if (pl1choice.equalsIgnoreCase("Rock") || pl1choice.equalsIgnoreCase("Paper") || pl1choice.equalsIgnoreCase("Scissors")) {
            clear();
            System.out.print(pl2username + ": Rock paper scissors - Choose one: ");
            String pl2choice = sc.nextLine();
            if(pl2choice.equalsIgnoreCase("Rock") || pl2choice.equalsIgnoreCase("Paper") || pl2choice.equalsIgnoreCase("Scissors")) {
                clear();
                  if  (pl1choice.equalsIgnoreCase("Paper") && pl2choice.equalsIgnoreCase("Rock") || pl1choice.equalsIgnoreCase("Scissors") && pl2choice.equalsIgnoreCase("Paper") || pl1choice.equalsIgnoreCase("Rock") && pl2choice.equalsIgnoreCase("Scissors")) {
                    System.out.println(pl1username + " has won!");
                   } else if (pl2choice.equalsIgnoreCase("Paper") && pl1choice.equalsIgnoreCase("Rock") || pl2choice.equalsIgnoreCase("Scissors") && pl1choice.equalsIgnoreCase("Paper") || pl2choice.equalsIgnoreCase("Rock") && pl1choice.equalsIgnoreCase("Scissors")){
                      System.out.println(pl2username + " has won!");
                   } else if(pl1choice.equalsIgnoreCase(pl2choice)) {
                      System.out.println("It's a tie!");
                   }
          } else {
            System.out.println("Invalid Input");
          }
        } else {
            System.out.println("Invalid Input");
        }
        break;
        case 2:
        sc.nextLine();
        int computer_choice = (int)(1 + Math.random()*3);
        System.out.print("Rock paper scissors - Choose one: ");
        pl1choice = sc.nextLine();
        if (pl1choice.equalsIgnoreCase("Rock") || pl1choice.equalsIgnoreCase("Paper") || pl1choice.equalsIgnoreCase("Scissors")) {
               if (pl1choice.equalsIgnoreCase("Rock") && computer_choice == 1) {
                System.out.println("The computer won since it chose paper!");
               } else if (pl1choice.equalsIgnoreCase("Rock") && computer_choice == 2) {
                System.out.println("You have won since the computer chose scissors!");
               } else if (pl1choice.equalsIgnoreCase("Rock") && computer_choice == 3) {
                System.out.println("Its a tie since the computer and you both chose rock!");
               } else if (pl1choice.equalsIgnoreCase("Paper") && computer_choice == 1) {
                System.out.println("The computer won since it chose scissors!");
               } else if (pl1choice.equalsIgnoreCase("Paper") && computer_choice == 2) {
                System.out.println("You won since the computer chose rock!");
               } else if (pl1choice.equalsIgnoreCase("Paper") && computer_choice == 3) {
                System.out.println("Its a tie since the computer and you both chose paper!");
               } else if (pl1choice.equalsIgnoreCase("Scissors") && computer_choice == 1) {
                System.out.println("The computer won since it chose rock!");
               } else if (pl1choice.equalsIgnoreCase("Scissors") && computer_choice == 2) {
                System.out.println("You won since the computer chose paper!");
               } else if (pl1choice.equalsIgnoreCase("Scissors") && computer_choice == 3) {
                System.out.println("Its a tie since the computer and you both chose scissors!");
               } else {
                System.out.println("Invalid Input");
               }
        }
        break;
        default:
        System.out.println("Invaild choice");
        break;
      }
    } while (RPSCHOICE != 0);
 }
 public static void clear() {
    System.out.print("\033[H\033[2J"); 
    System.out.flush();  
 }
}