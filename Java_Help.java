import java.util.Scanner;
public class Java_Help {
  static int exit = 1;
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    do {
        System.out.print("Java Help\n0) Exit\n1) Math Functions\n2) ArrayList\n3) LinkedList\n4) Hashmap\n5) Hashset\n6) Wrapper Classes\n7) Projects to do\nType your choice: ");
        int input = sc.nextInt();
        if (input == 0) {
            exit = 0;
            sc.close();
        }
        if (input == 1) {
            System.out.println("\nMath Functions:\n1) abs(x)\n2) acos(x)\n3) asin(x)\n4) atan(x)\n5) atan2(y,x)\n6) coordinates(x, y)\n7) brt(x)\n8) ceil(x)\n9) copySign(x, y)\n10) cos(x)\n11) cosh(x)\n12) exp(x)\n13) expm1(x)\n14) floor(x)\n15) getExponent(x)\n16) hypot(x, y)\n17) IEEEremainder(x, y)\n18) log(x)\n19) log10(x)\n20) log1p(x)\n21) doublemax(x, y)\n22) min(x, y)\n23) extAfter(x, y)\n24) nextUp(x)\n25) pow(x, y)\n26) random()\n27) round(x)\n28) rint(x)\n29) signum(x)\n30) sin(x)\n31) sinh(x)\ns32) qrt(x)\n33) tan(x)\n34) tanh(x)\n35) toDegrees(x)\n36) toRadians(x)\n37) ulp(x)\n"); 
        } else if (input == 2) {
            System.out.println("\nArrayLists:\n\nFormat - ArrayList<VarType> myArrayListName = new ArrayList<VarType>();\n\nFunctions:\n1) arraylist.add(\"Hello World\");\n2) arraylist.remove(0);\n3) arraylist.clear();\n4) arraylist.size();\n5) arraylist.get(0);\n6) arraylist.set(0, \"Hello World\")\n\nHow to loop through a array:\nfor (int i = 0; i < arraylist.size(); i++) {\n System.out.println(arraylist.get(i));\n}\n\nor\n\n for (String i : arraylist) {\n System.out.println(arraylist)\n}\n");
        } else if (input == 3) {
            System.out.println("\nLinked List is the same as arraylists but with extra functions. They're:\n\n1) addFirst();\n2) addLast();\n3) removeFirst();\n4) removeLast();\n5) getFirst();\n6) getLast();\n\n");
        } else if (input == 4) {
            System.out.println("\nHashmap:\n\nFormat - Hashmap<VarType, VarType> myhashmapname = new Hashmap<VarType, VarType>();\n\nFunctions\n1) hashmap.put(\"Hello World\");\n2) hashmap.get(0);\n3) hashmap.remove(0);\n4) hashmap.clear();\n5) hashmap.size();\n\nHow to loop through hashmaps *Keys*:\nfor (String i : hashmap.keys()) {\n System.out.println(i)\n}\n\nValues:\nfor (String i : hashmap.values()) {\n System.out.println(i)\n}\n");
        } else if (input == 5) {
            System.out.println("\nHashset:\n\nFormat is same as arraylists or linkedlists\n\nFunctions:\n1) hashset.add(\"Hello World\");\n2) hashset.contains(\"Hello World\");\n3) hashset.remove(0);\n4) hashset.clear();\n5) hashset.size();\n\nLooping through a hashmap is also the same as arraylists and linkedlists\n\n");
        } else if (input == 6) {
            System.out.println("\nWrapper Classes:\n\nWe can't do ArrayList<int> array = new ArrayList<int>(); etc with any list type, instead, we use wrapper classes, like: Integer x = 10;, ArrayList<Boolean> array = new ArrayList<Boolean>(); etc. The types are:\n\n1) int to Integer\n2) float to Float\n3) double to Double\n4) boolean to Boolean\n5) char to Character\n\nWe can also get certain information about variables, Here are some functions which get certain information about variables:\n\n1) intvalue()\n2) byteValue()\n3) shortValue()\n4) longValue()\n5) floatValue()\n6) doubleValue()\n7) charValue()\n8) booleanValue()\n\n");
        } else if (input == 7) {
            System.out.println("\nProjects:\n\n1) Number Guessing Game\n2) Temperature Converter\n3) Simple Chat Application\n4) Guess the Word Game\n5) Rock, Paper, Scissors Game\n6) Basic ATM Simulator\n\n");
        }
    } while(exit != 0);
 }
}