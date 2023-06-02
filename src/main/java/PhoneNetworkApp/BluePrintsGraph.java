
package PhoneNetworkApp;

import GraphFramework.Edge;
import GraphFramework.Graph;
import GraphFramework.Vertex;

////this class is a subclass of Vertex
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

