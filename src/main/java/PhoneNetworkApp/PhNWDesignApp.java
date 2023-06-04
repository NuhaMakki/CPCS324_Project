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

// this class is the starting point of the program and contains the main function
import GraphFramework.KruskalAlg;
import GraphFramework.MHPrimAlg;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PhNWDesignApp {
  
    public static void main(String[] args) throws FileNotFoundException {
        
        
    // ---------------------------------------------
    //               requirement 1
    // ---------------------------------------------
        
        //--------------------------------------------------
        //creating File opjects for readGraphFromFile method
        File input = new File("‏‏graphFile1.txt");
        
        // check if files exist
        if (!input.exists()){
            System.out.println("File not found");
            System.exit(0);
        }// end if
        
        // create scanner to read from file
        Scanner read = new Scanner(input);
        //--------------------------------------------------
        
        
        //--------------------------------------------------       
        //reading from file
        String str = read.next();
        if (str.equalsIgnoreCase("digraph")){
            int isDig = read.nextInt();
            boolean isDigraph = (isDig != 0);            
            int veticesNo = read.nextInt();
            int edgeNo = read.nextInt();
            
            //creating new garhph
            BluePrintsGraph graph = new BluePrintsGraph(isDigraph, veticesNo, edgeNo );
            
            // invoking readGraphFromFile method
            graph.readGraphFromFile(read);
            
            //printing header
            printHeader1();
            
            
            // creating KruskalAlg object, invoking method & displaying ResultingMST
            KruskalAlg kruskal = new KruskalAlg(graph);
            kruskal.kruskal();
            kruskal.displayResultingMST();
 
            
            // creating MHPrimAlg object, invoking method & displaying ResultingMST
            MHPrimAlg mHPrimAlg = new MHPrimAlg(graph);
            mHPrimAlg.prim();
            mHPrimAlg.displayResultingMST();
                
        } //end if
         
       

        
    // ---------------------------------------------
    //               requirement 2
    // --------------------------------------------- 
    
        //printing header
        printHeader2();


        // this is 2D array to store 7 different casses of graphs
        int GraphsCases [][] = { {1000, 10000}, {1000, 15000}, {1000,  25000},
                                 {5000, 15000}, {5000, 25000}, {10000, 15000}, {10000,25000} };


        for (int i = 0; i < GraphsCases.length; i++) {
        
            //making new garhph
            BluePrintsGraph graph = new BluePrintsGraph();    
            // invoking readGraphFromFile method
            graph.makeGraph(GraphsCases[i][0], GraphsCases[i][1]);              

            // creating KruskalAlg object, invoking method & displaying ResultingMST        
            KruskalAlg kruskal = new KruskalAlg(graph);
            kruskal.kruskal();
            kruskal.displayTimeWeight();
            
            // creating KruskalAlg object, invoking method & displaying ResultingMST
            MHPrimAlg mHPrimAlg = new MHPrimAlg(graph);
            mHPrimAlg.prim();
            mHPrimAlg.displayTimeWeight();

        }

    }    // End main method
    // ----------------------------------------------------------------------------------------------------------------------------
    
    
    
    
    //printing method
    public static void printHeader1(){
         System.out.println("""
                            ***********************************************************************************************************
                            *****************************************      requirement 1      *****************************************
                            ***********************************************************************************************************
                            """);       
    } 
    // --------------------------------------------- 

    public static void printHeader2(){
         System.out.println("""
                            ***********************************************************************************************************
                            *****************************************      requirement 2      *****************************************
                            ***********************************************************************************************************
                            """);       
    
        System.out.println("----------------------------------------------------------------------------------");
        System.out.printf("%-7s|%-7s|        %-25s|         %-25s\n", "Office", "line", "Kruskal's Algorithm" , "prim's Algorithm");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.printf("%-7s|%-7s|%-15s|  %-15s|   %-15s|  %-15s\n", "n", "m", "Total runtime" , "cost", "Total runtime" , "cost");
    }    
    // --------------------------------------------- 

}// class End


/*
Extra Specifications:
    *  Visual Studio Code
    * GitHab
    * hardware configuration (for the device used in copmuting the rinTime):
        - Hardware type: Asus ZenBook Flip 13 UX363EA
        - Processor: 11th Gen Intel(R) Core(TM) i7-1165G7 @ 2.80GHz 2.80 GHz
        - RAM: 16.0 GB (15.7 GB usable)
        - System Type: 64-bit operating system, x64-based processor
    * operating system: Windows
        - Edition: Windows 11 Home
        - Version: 21H2
        - OS build: 22000.1574
*/