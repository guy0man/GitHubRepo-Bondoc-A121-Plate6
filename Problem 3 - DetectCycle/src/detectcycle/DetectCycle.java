
package detectcycle;

import java.util.*;


public class DetectCycle {

    public static void main(String[] args) {
        Scanner scanInput = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int verticesNum = scanInput.nextInt();
        Graph newGraph = new Graph(verticesNum);
        scanInput.nextLine();
        System.out.println("Enter edges with 0 as the first vertex (e.g. 1,2). Enter \"\\done\" once all edges are entered: ");
        while (true){           
            String[] edge = scanInput.nextLine().split(",");
            if (edge[0].equals("\\done")) break;
            newGraph.addEdge(Integer.parseInt(edge[0]), Integer.parseInt(edge[1]));      
        }
        if (newGraph.isCyclic())System.out.println("Graph contains cycle");
        else System.out.println("Graph doesn't contain cycle");
    }
    
}
