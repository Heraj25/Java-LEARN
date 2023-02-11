package Linked_List;


class Node{
    int data;
    Node next;
}

public class Listnode {

    Node head;

    public void insert(int data){
        Node node = new Node();
        node.data = data;
        if(head == null){
            head = node;
        }
        else{
            Node n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show(){
        Node node = head;
        while(node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);  
    }
}

class Runner{
    public static void main(String[] args) {
        
        Listnode list = new Listnode();
        list.insert(5);
        list.insert(45);
        list.insert(90);
        list.insert(3);

        list.show();
        

    }
}
