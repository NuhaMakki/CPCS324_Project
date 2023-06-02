
package GraphFramework;

import java.util.ArrayList;

// this class is a superclass representing the general characteristics of an algorithm for computing the minimum spanning tree. 
// It has 2 subclasses: KruskalAlg and MHPrimAlg.
public abstract class MSTAlgorithm {
    
    // ---------------------------------------------
    //            variables declaration 
    // ---------------------------------------------
    
    ArrayList<Edge> MSTResultList = new ArrayList<Edge>();   // It stores the parent of the vertex and the weight needed by the MST algorithm

       

    
    // ---------------------------------------------
    //                   functions 
    // ---------------------------------------------   
    
    // this method tois an abstract function to display Resulting MST
    // has been overridden in Office class
    public abstract void displayResultingMST();    
    // End Vertex method
    // --------------------------------------------- 
    
}
