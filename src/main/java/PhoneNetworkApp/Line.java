
package PhoneNetworkApp;

import GraphFramework.Edge;

//this class is a subclass of Edge
public class Line extends Edge{
    // ---------------------------------------------
    //            variables declaration 
    // ---------------------------------------------
    private int lLength; // represents the line length and it is 5 times the weight of the corresponding edge


    // ---------------------------------------------
    //               constructor
    // --------------------------------------------- 

    public Line(Office source, Office target, int weghit ) {
        this.setSource(source);
        this.setTarget(target);
        this.setWeight(weghit);
        this.lLength = weghit*5;
    }

    
    
    
    
    // ---------------------------------------------
    //                   functions 
    // ---------------------------------------------   
    
    @Override
     public void displayInfo(){     
        System.out.print("line length: ");
        super.displayInfo();
    }
    
}
