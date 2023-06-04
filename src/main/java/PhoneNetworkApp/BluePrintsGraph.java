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


package PhoneNetworkApp;

import GraphFramework.Edge;
import GraphFramework.Graph;
import GraphFramework.Vertex;

////this class is a subclass of Graph
public class BluePrintsGraph extends Graph{
   
    // ---------------------------------------------
    //            variables declaration 
    // ---------------------------------------------
    public BluePrintsGraph(boolean isDigraph, int veticesNo, int edgeNo) {
        super(isDigraph, veticesNo, edgeNo);
    }

    public BluePrintsGraph() {
        super();
    }

    
    // ---------------------------------------------
    //                   functions
    // ---------------------------------------------
    @Override
    public Edge createEdge(Vertex source, Vertex target, int weghit) {
        return new Line( (Office)source, (Office)target, weghit);
    }
    
    @Override
    public Vertex createVertex(String lable) {
        return new Office(lable); 
    }
}

