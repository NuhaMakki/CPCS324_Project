
package GraphFramework;

public class LinkedList {

    // head: reference variable to the first node of the list
    private LLnode head;

    // ---------------------------------------------
    //                  constructor
    // ---------------------------------------------    
    public LinkedList() {
        head = null;
    }

    public LLnode getHead() {
        return head;
    }

    
    // ---------------------------------------------
    //                  functions
    // ---------------------------------------------        
    
    public void insertNode(Edge edge){
        // insert first node
        if (head == null){
            head = new LLnode (edge);
        }
        
        //insert the node at the end of the linkedList
        else{
            LLnode hptr=head;
            while(hptr.getNext() != null){
                hptr=hptr.getNext();
            }
            hptr.setNext(new LLnode (edge));
        }
    }
    // ---------------------------------------------        

    
    
    
}
