
package isomophismchecker;

import java.util.*;

public class IsomophismChecker {


    public static void main(String[] args) {
        
        Scanner scanInput = new Scanner(System.in);
        System.out.print("Enter vertices of the first Graph: ");
        int verticesA = scanInput.nextInt();
        scanInput.nextLine();
        System.out.print("Enter vertices of the second Graph: ");
        int verticesB = scanInput.nextInt();
        
        Graph A = new Graph(verticesA);
        Graph B = new Graph(verticesB);
        
        scanInput.nextLine();       
        System.out.println("Enter edges of the first Graph (e.g A,B).");
        System.out.println("Enter \"\\done\" once all edges are entered (Use the capitalized alphaber e.g. A, B, C, D, ... Z): ");
        while (true){           
            String[] edge = scanInput.nextLine().split(",");
            if (edge[0].equals("\\done")) break;
            A.AddEdge(edge[0], edge[1]);
        }
        System.out.println("Enter edges of the second Graph (e.g A,B).");
        System.out.println("Enter \"\\done\" once all edges are entered (Use the capitalized alphaber e.g. A, B, C, D, ... Z): ");
        while (true){           
            String[] edge = scanInput.nextLine().split(",");
            if (edge[0].equals("\\done")) break;
            B.AddEdge(edge[0], edge[1]);
        }
        System.out.println();
        if (CheckIsomorphism(A,B)) System.out.println("The given graphs are isomorphic!");
        else System.out.println("The given graphs are not isomorphic...");
    }
    
    public static boolean CheckIsomorphism(Graph A, Graph B){       
        boolean result = true;
        if(A.vCount != B.vCount){
            result = false; 
            return result;
        }      
        if(A.eCount() != B.eCount()){
            result = false;
            return result;
        }
        for (int i = 0; i < A.vCount; i++){
            if (A.vertices.get(i).Degree != B.vertices.get(i).Degree){
                result = false;
                return result;
            }       
        }      
        return result;                    
    }
    
}
