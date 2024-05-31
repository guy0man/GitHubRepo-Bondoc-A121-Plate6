
package degreecalculator;

import java.util.*;

public class DegreeCalculator {

    public static void main(String[] args) {
        Scanner scanInput = new Scanner(System.in);
        System.out.print("Enter edges (e.g AB,AC,DB,AD): ");
        String[] edges = scanInput.nextLine().split(",");
        ArrayList<Character> visited = new ArrayList<Character>();
        System.out.println();
        for (String e : edges){
            char Pointer = e.toCharArray()[0];
            if (visited.contains(Pointer)) continue;
            visited.add(Pointer);
            int degree = 0;
            for (String i : edges){
                if (Pointer == i.toCharArray()[0]) degree++;                          
            }
            System.out.println("deg("+Pointer+") = "+degree);                      
        }             
    }
    
}
