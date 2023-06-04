/*
Department of Computer Science
CPCS 324: Algorithms and Data Structures (II) 
Spring 2023 Group Project – Part I
Implement KruskalAlgorithm and Prim Algorithm, and using them to compute the minmum sppaning tree problem

---------------------------------------
Name           | ID         | Section
---------------------------------------
Nuha Makki     | 2024579    | B8	   
Rawan Algamdi  | 2005446    | B8		   
Rawan Aljedani | 1906454    | B0B	
Joud Alahmadi  | 2006214    | B0B		   
---------------------------------------

project link on GitHub:
https://github.com/NuhaMakki/CPCS324_Project.git


*/


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
