
package generateadjacencylist;

import java.util.*;


public class GenerateAdjacencyList {


    public static void main(String[] args) {
        Scanner scanInput = new Scanner(System.in);
        System.out.print("Enter edges (e.g AB,AC,DB,AD): ");
        String[] edges = scanInput.nextLine().split(",");
        Character[] verticeNames = {'A','B','C','D','E','F','G','H','I','J','K','L','M',
            'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};        
        int highestIndex = 0;
        for (String e : edges){
            for (char c: e.toCharArray()){
                int charIndex = Arrays.asList(verticeNames).indexOf(c);
                if (charIndex > highestIndex) highestIndex = charIndex;
            }                                 
        }
        System.out.println();
        System.out.println();
        Character[] visited = Arrays.copyOfRange(verticeNames, 0, highestIndex+1);
        for (char V: visited){
            Integer[] row = new Integer[visited.length];
            int indexPointer = 0;
            for (char v: visited){
                int edgeCount = 0;
                for (String e: edges){
                    if (e.toCharArray()[0] == V && e.toCharArray()[1] == v) edgeCount++;               
                }
                row[indexPointer] = edgeCount;
                indexPointer++;
            }           
            System.out.println(Arrays.toString(row));
            indexPointer = 0;       
        }
    }
    
}
