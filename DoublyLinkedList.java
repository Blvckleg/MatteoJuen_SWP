public class DoublyLinkedList {
    private Node head;

    public void add(int val){
        Node sp = new Node(val);
        if (head == null) {
            head = sp;
            return;
        }

        Node e2;
        e2 = head;

        while (e2.hasNext()) {
            e2 = e2.next();
        }

        e2.setNext(sp);
        sp.setLast(e2);
    }


    public static void main(String[] args){

    }
}