
package GraphFramework;

public class LLnode {
    
    private Edge adjacencyVertex;
    private LLnode next;

    
    
    // ---------------------------------------------
    //               constructor
    // ---------------------------------------------
    public LLnode(Edge adjacencyVertex, LLnode next) {
        this.adjacencyVertex = adjacencyVertex;
        this.next = next;
    }

    public LLnode(Edge adjacencyVertex) {
        this.adjacencyVertex = adjacencyVertex;
    }   
    
    
    // ---------------------------------------------
    //            setters & getters 
    // ---------------------------------------------   

    public Edge getAdjacencyVertex() {
        return adjacencyVertex;
    }

    public void setAdjacencyVertex(Edge adjacencyVertex) {
        this.adjacencyVertex = adjacencyVertex;
    }

    public LLnode getNext() {
        return next;
    }

    public void setNext(LLnode next) {
        this.next = next;
    }




}
