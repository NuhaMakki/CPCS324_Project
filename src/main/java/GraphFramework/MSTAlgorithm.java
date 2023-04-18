
package GraphFramework;

import java.util.ArrayList;

/* this class is a superclass representing the general characteristics of an algorithm
for computing the minimum spanning tree. 
It has three subclasses: KruskalAlg and MHPrimAlg.*/
public class MSTAlgorithm {
    
    // ---------------------------------------------
    //            variables declaration 
    // ---------------------------------------------
    
    ArrayList<Edge> MSTResultList = new ArrayList<Edge>();   // It stores the parent of the vertex and the weight needed by the MST algorithm

       

    
    // ---------------------------------------------
    //                   functions 
    // ---------------------------------------------   
    
    
    public void displayResultingMST(){     
        /*
        displayResultingMST(): it is an abstract function that should be implemented by the subclasses’ 
        polymorphic functions.
        */ 
    }
}
