
package PhoneNetworkApp;

import GraphFramework.Vertex;

//this class is a subclass of Vertex
public class Office extends Vertex{
     /*
    setLabel() method (alternatively set the correct value within the relevant constructor) to store O1, 
    O2,… or O15 – starts with O followed by a unique number.
    */
    
    // ---------------------------------------------
    //            variables declaration 
    // ---------------------------------------------

    
    
    // ---------------------------------------------
    //               constructor
    // --------------------------------------------- 

    public Office(String label) {
        this.setLabel(label);
    }

    
    // ---------------------------------------------
    //                   functions 
    // ---------------------------------------------   
    
    @Override
     public void displayInfo(){     
        System.out.print("Office No. ");
        super.displayInfo();

    } 
}
