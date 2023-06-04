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

//this class represents a graph vertex
public class Vertex {
   
    // ---------------------------------------------
    //            variables declaration 
    // ---------------------------------------------
    String label;  //  a number that represents the vertex label
    boolean isVisited; // true ==> current vertex is visited within a certain operation.
    private LinkedList adjList = new LinkedList(); // a linked list represents the adjacency list of a vertex within a class


    // ---------------------------------------------
    //              setters & getters 
    // ---------------------------------------------  

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public boolean isIsVisited() {
        return isVisited;
    }

    public void setIsVisited(boolean isVisited) {
        this.isVisited = isVisited;
    }

    Vertex parent; //
    public Vertex getParent() {
        return parent;
    }

    public void setParent(Vertex parent) {
        this.parent = parent;
    }
    
    public LinkedList getAdjList() {
        return adjList;
    }

    public void setAdjList(LinkedList adjList) {
        this.adjList = adjList;
    }




    
    // ---------------------------------------------
    //                   functions 
    // ---------------------------------------------   
    
    
    public void displayInfo(){     
        System.out.printf("%-5s" , this.label);
    }


}
