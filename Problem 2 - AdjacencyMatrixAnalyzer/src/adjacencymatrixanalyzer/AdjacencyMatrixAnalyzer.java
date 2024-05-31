
package adjacencymatrixanalyzer;

import java.util.*;

public class AdjacencyMatrixAnalyzer {

    public static void main(String[] args) {
        Scanner scanInput = new Scanner(System.in);
        int rowCount = 0;
        int vertices = 999;
        String[] verticeNames = {"A","B","C","D","E","F","G","H","I","J","K","L","M",
            "N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        ArrayList<String> edges = new ArrayList<String>();
        ArrayList<String> edgesNum = new ArrayList<String>();
        System.out.println("Input each row of the adjacency matrix (e.g. 1,0,0,1)");
        for (int a = 0; a < vertices; a++){
                System.out.println("Enter row "+ (rowCount+1) +": ");
                String[] row = scanInput.nextLine().split(",");
                vertices = row.length;
                for (int i = 0; i < row.length; i++){
                    if (Integer.parseInt(row[i]) > 0){
                        edges.add(verticeNames[rowCount] + verticeNames[i]);
                        edgesNum.add(row[i]);
                    }
                }
                rowCount++;
        }
        System.out.println("Edges = " + edges);
        System.out.println();
        for (int x = 0; x < edges.size(); x++){

            System.out.println("Edge "+ edges.get(x)+" appeared "+ edgesNum.get(x) +" time(s).");
        }                                      
    }
    
}
