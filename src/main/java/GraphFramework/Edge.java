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

//this class represents a graph edge
public class Edge {
    
    // ---------------------------------------------
    //            variables declaration 
    // ---------------------------------------------
    Vertex source;
    Vertex target;
    Vertex parent; //represents the parent of source vertex 
    int weight;  //holds the weight assigned to the edge connecting the source and target vertices
    
    
    // ---------------------------------------------
    //            setters & getters 
    // ---------------------------------------------   
    public Vertex getSource(){     
        return source;
    }

    public void setSource(Vertex source) {
        this.source = source;
    }

    public Vertex getTarget() {
        return target;
    }

    public void setTarget(Vertex target) {
        this.target = target;
    }

    public Vertex getParent() {
        return parent;
    }

    public void setParent(Vertex parent) {
        this.parent = parent;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    
    // ---------------------------------------------
    //                   functions
    // ---------------------------------------------
    public void displayInfo() {     
        System.out.printf("%-5s" , this.weight);

    }

    
}
