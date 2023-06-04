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
