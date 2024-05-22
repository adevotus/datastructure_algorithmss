public class LinkedList {

    private Node head;
    private Node tail;
    private int length;


    public LinkedList (int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length =    1;
    }

    public   Node Prepend(int value){

        Node newNode1 = new Node(value);

        if(length == 0){
            head = newNode1;
            tail = newNode1;
        }else {
            newNode1.next = head;
            head = newNode1;
        }
        length ++;
    }

    //remove the node  from the list
    public Node  removeFirst(int value){
        Node temp = head;
        head = head.next;
        temp.next = null;
        length --;
        if(length == 0){
            tail = null;
        }

     return temp;
    }

    public Node get(int index){
        if(index < 0 || index >= length) return  null;

        Node temp = head;

        for (int i=0; i< index; i++ ){
            temp =temp.next;
        }
        return  temp;
    }


    public boolean set(int index, int value) {
       Node temp = get(index);
       if(temp != null){
           temp.value = value;
           return  true;
       }
       return  false;
    }

    public boolean insert(int index, int value){
        if (index <0 || index > length){
            return  false;
        }
        if(index == 0){
            Prepend(value);
            return  true;
        }
        Node newNode = new Node(value);
        Node temp   = get(index -1);

        newNode.next = temp.next;
        temp.next = newNode;
        length ++;
        return  true;
    }

}
