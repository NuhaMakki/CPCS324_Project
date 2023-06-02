
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
