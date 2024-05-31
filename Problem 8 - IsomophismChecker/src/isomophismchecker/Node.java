
package isomophismchecker;

import java.util.*;

public class Node {
    
    public String Name;
    public ArrayList<Node> Neighbors = new ArrayList();
    public int Degree;
    
    public Node(String name){
        Name = name;        
    }
    
    public void AddNeighbor(Node n){
        if (Neighbors.contains(n)) return;
        Neighbors.add(n);
        Degree = Neighbors.size();       
    }        
}
