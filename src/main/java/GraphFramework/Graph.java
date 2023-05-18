
package GraphFramework;

import java.util.ArrayList;

//this class defines the structure of a graph
public class Graph {
    
    // ---------------------------------------------
    //            variables declaration 
    // ---------------------------------------------
    int veticesNo;  // number of vertices of the graph
    int edgeNo; // number of edges of the graph
    boolean isDigraph; // true ==> directed graph   ||   false ==> undirected graph    
    ArrayList<Vertex> vertices = new ArrayList<Vertex>();  //represents the list of vertices of a graph
   
    
    
    
    
    // ---------------------------------------------
    //                   functions 
    // ---------------------------------------------   
    
    
    public void makeGraph() {     
        /*
        makeGraph(): this function takes as parameters the number of vertices and the number of edges. It is 
        responsible for creating a graph object with the specified parameters and randomly initializes the vertices’ 
        labels, creating edges that connects the created vertices randomly and assigning them random weights. 
        Make sure that the resulting graph is connected. 
        */ 
    }

    
    public void readGraphFromFile() {     
        /*
        readGraphFromFile(fileName) reads the edges and vertices from the text file whose name is 
        specified by the parameter filename and place data in a Graph object. In this project, you need to 
        create a text file that contains the graph presented in requirement 1. The file format is shown in Appendix 
        II. It is responsible for doing some preprocessing then call the addEdge() method to determine the 
        position of the Edge.
        */ 
    }    
    

    public void addEdge() {     
        /*
        addEdge(v,u,w): is a function that creates an edge object and passes the source vertex v, the target 
        vertex and w the vertex weight as parameters, assigns the target vertex to the adjacent list of the source 
        vertex and if the graph is undirected then it will add the source vertex to the adjacent list of the target
        vertex. It increments the EdgeNo by one in case it is a directed graph and by two if it is an undirected 
        graph.
        */ 
    }     
    
    
    public void createEdge() {
        
    }
    
    public void createVertex() {
        
    }
    
}
