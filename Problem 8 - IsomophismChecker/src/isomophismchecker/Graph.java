
package isomophismchecker;

import java.util.*;

public class Graph {
    
     public int vCount;
     public ArrayList<Node> vertices = new ArrayList();    
     
     public Graph(int VCount){
         
         vCount = VCount;
         char alphabet = 'A';
         for (int i = 0; i < vCount; i++){
             vertices.add(new Node(String.valueOf(alphabet)));
             alphabet++;
         }       
     }    
     public void AddEdge(String a, String b){        
         Node A = null;
         Node B = null;        
         for (Node v: vertices){
             if (v.Name.equals(a)) A = v;
             if (v.Name.equals(b)) B = v;            
         }
         for (Node v: vertices){
             if (v.Name.equals(a)) v.AddNeighbor(B);
             if (v.Name.equals(b)) v.AddNeighbor(A);            
         }      
     }  
     public int eCount(){
         return vertices.size();
     }
}
