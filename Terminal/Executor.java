package Terminal;
import java.io.IOException;
//* Executes the command
//* Very important. If removed, the terminal will not work.
public class Executor extends Commands {
    public static void main(String[] args) throws IOException {
    System.out.println("Nevertx NeVerox[Version 1.2.2095.21095]\n(c) Nevertx. All rights unreserved.\n");
    do {
        if (print == 1) {
            System.out.print("C:\\" + username + "\\" + brand + ">");
        } else;
        cmd = sc.nextLine();
        executeCmd(cmd);
    } while (exit != 0);
  }
public static void executeCmd(String cmd) throws IOException {
          if (cmd.startsWith("echo")) {
              echo();
            } else {
                switch(cmd) {
                    case "help","Help","HELP":
                    help();
                    break;
                    case "echo on","Echo on","Echo On","ECHO ON":
                    echo_on();
                    break;
                    case "echo off","Echo off","Echo Off","ECHO OFF":
                    echo_off();
                    break;
                    case "verify","Verify","VERIFY":
                    verify();
                    break;
                    case "time","Time","TIME":
                    showtime();
                    break;
                    case "exit","Exit","EXIT":
                    exit();
                    break;
                    case "add","Add","ADD":
                    addition();
                    break;
                    case "sub","Sub","SUB":
                    subtraction();
                    break;
                    case "mul","Mul","MUL":
                    multiplication();
                    break;
                    case "div","Div","DIV":
                    division();
                    break;
                    case "username","Username","USERNAME":
                    username();
                    break;
                    case "brandtype","Brandtype","BrandType","BRANDTYPE":
                    brandtype();
                    break;
                    case "open","Open","OPEN":
                    applications();
                    break;
                    case "programs","Programs","PROGRAMS":
                    programs();
                    break;
                    case "shutdown /?","Shutdown /?","SHUTDOWN /?","shutdown","Shutdown","SHUTDOWN":
                    shutdown_help();
                    break;
                    case "shutdown /i","Shutdown /i","SHUTDOWN /i":
                    shutdown_1();
                    break;
                    case "shutdown /l","Shutdown /l","SHUTDOWN /l":
                    shutdown_2();
                    break;
                    case "shutdown /s","Shutdown /s","SHUTDOWN /s":
                    shutdown_3();
                    break;
                    case "shutdown /sg","Shutdown /sg","SHUTDOWN /sg":
                    shutdown_4();
                    break;
                    case "shutdown /r","Shutdown /r","SHUTDOWN /r":
                    shutdown_5();
                    break;
                    case "shutdown /g","Shutdown /g","SHUTDOWN /g":
                    shutdown_6();
                    break;
                    case "shutdown /a","Shutdown /a","SHUTDOWN /a":
                    shutdown_7();
                    break;
                    case "shutdown /p","Shutdown /p","SHUTDOWN /p":
                    shutdown_8();
                    break;
                    case "shutdown /h","Shutdown /h","SHUTDOWN /h":
                    shutdown_9();
                    case "jlist","Jlist","JList","JLIST":
                    java_list();
                    break;
                    case "jproject","Jproject","JProject","JPROJECT":
                    java_project();
                    break;
                    case "todoger","Todoger","TODOGER":
                    todo_Manager();
                    break;
                    case "ascv","Ascv","ASCV":
                    ascii_value();
                    break;
                    case "colour","Colour","COLOUR","colour /?","Colour /?","COLOUR /?":
                    colour();
                    break;
                    case "colour -1","Colour -1","COLOUR -1":
                    System.out.println(RESET);
                    break;
                    case "colour 0","Colour 0","COLOUR 0":
                    System.out.println(BLACK);
                    break;
                    case "colour 1","Colour 1","COLOUR 1":
                    System.out.println(RED);
                    break;
                    case "colour 2","Colour 2","COLOUR 2":
                    System.out.println(GREEN);
                    break;
                    case "colour 3","Colour 3","COLOUR 3":
                    System.out.println(BLUE);
                    break;
                    case "colour 1B","Colour 1B","COLOUR 1B":
                    System.out.println(RED_BRIGHT);
                    break;
                    case "colour 2B","Colour 2B","COLOUR 2B":
                    System.out.println(GREEN_BRIGHT);
                    break;
                    case "numguess", "Numguess", "NumGuess", "NUMGUESS":
                    number_guessing__game();
                    break;
                    case "clear","Clear","CLEAR":
                    clear();
                    break;
                    case "rps","Rps","RPS":
                    RPS();
                    break;
                    case "dir","Dir","DIR":
                    dir();
                    break;
                    default:
                    if (!cmd.isEmpty()) {
                        System.out.println("\'" + cmd + "\'" + " is not recognized as a internal or external command.\n");
                    } else;
                    break;
            }
    
        }
    }
} 
