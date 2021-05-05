import java.util.*;


class Node{
    int data;
    Node next;
    
    
}



class Link{
    Node head = null;
    public void insert(int data){
        
     Node n = new Node();
     n.data=data;
     n.next=null;
        if(head==null){
            
            
            head=n;
        }
        else{
            
            Node temp = head;
            while(temp.next!=null){
                
                
                temp=temp.next;
                
            }
            temp.next=n;
        }
        
    }
    Node v=head;
    public void dis(){
       
        while(v!=null){
            System.out.println(Integer.toString(v.data));
            v=v.next;
        }
    }
    
}


public class HelloWorld{

     public static void main(String []args){
        
        
        Link l =new  Link();
        l.insert(7);
        l.insert(10);
        l.insert(190);
        l.dis();
      //  System.out.println(Integer.toString(l.head.next.data));
        
        
     }
}
