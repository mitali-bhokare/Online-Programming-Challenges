/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    
    /*HashSet<Node> hset = new HashSet<>();
    Node temp = head;
    hset.add(temp);
       
    while(temp!=null)
    {
        System.out.println("Data: "+temp.data);
        if(hset.contains(temp))
        {
            return true;
        }
        
        //Add it to hashset
        
        hset.add(temp);
        temp = temp.next;
    }
    
    return false;*/
    Node slow = head;
    Node fast = head;
    
    while(slow!=null && fast!=null && fast.next !=null)
    {
        slow= slow.next;
        fast = fast.next.next;
        if(fast == slow)
        {
            return true;
        }
       
    }
    return false;  
    

}
