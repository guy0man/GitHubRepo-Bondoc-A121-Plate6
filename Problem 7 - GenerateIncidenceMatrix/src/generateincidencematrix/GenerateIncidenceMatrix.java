
package generateincidencematrix;

import java.util.*;

public class GenerateIncidenceMatrix {
   
    public static void main(String[] args) {
        
        Scanner scanInput = new Scanner(System.in);
        System.out.println("Enter edges and the number of times each edge appears (e.g. AB 1,BA 1): ");
        String[] input = scanInput.nextLine().split(",");
        input = removeSameValues(input);
        System.out.println(Arrays.toString(input));
        Character[] verticeNames = {'A','B','C','D','E','F','G','H','I','J','K','L','M',
            'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};        
        int highestIndex = 0;
        for (String e : input){
            String[] pointer = e.split(" ");
            for (char c: pointer[0].toCharArray()){
                int charIndex = Arrays.asList(verticeNames).indexOf(c);
                if (charIndex > highestIndex) highestIndex = charIndex;
            }                                 
        }
        System.out.println();
        System.out.println("Incidence Matrix: ");
        Character[] visited = Arrays.copyOfRange(verticeNames, 0, highestIndex+1);
        PrintEdges(input);
        for (char A : visited){
            
            Integer[] row = new Integer[visited.length];
            Arrays.fill(row,0);
            int indexPointer = 0;
            for (String e: input){
                    String[] pointer = e.split(" ");
                    if (pointer[0].contains(String.valueOf(A))) row[indexPointer] = Integer.valueOf(pointer[1]);
                    indexPointer++;
            }
            System.out.print(A);
            System.out.println(Arrays.toString(row));
            indexPointer = 0;
        }                       
    }
    static String[] removeSameValues(String [] vals){
        
        List<String> values = Arrays.asList(vals);
        ArrayList<String> newVList = new ArrayList();
        ArrayList<String> Wanted = new ArrayList();
        for (String v : values){
            if (Wanted.contains(v)) continue;
            String[] pointer = v.split(" ");
            String newWanted = "" + pointer[0].toCharArray()[1]+ pointer[0].toCharArray()[0]+ " " + pointer[1];
            Wanted.add(newWanted);
            newVList.add(v);
        }
        return newVList.toArray(new String[newVList.size()]);
    }
    static void PrintEdges (String [] vals){
        String result = "  ";
        for (String A: vals){
            String[] pointer = A.split(" ");
            result += pointer[0] + " ";                      
        }
        System.out.println(result);    
    }
    
}
