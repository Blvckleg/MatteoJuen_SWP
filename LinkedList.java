public class LinkedList {

    public void add(int value) {
    	private Node head;
        Node tmp = new Node(value);

        if (head == null) {
            head = tmp;
            return;
        }

        Node it;
        it = head;

        while (it.hasNext()) {
            it = it.next();
        }

        it.setNext(tmp);
    }

    public void delete(int pos) {
        int index = 1;
        if(pos == 0){
            head = head.next();
            return;
        }
        Node delete = head;
            while(index < pos){
                delete = delete.next();
                index++; 
            }
            if(delete.next().hasNext()){
                delete.setNext(delete.next().next());
                return;
            }
            else{
                delete.setNext(null);
            }
        }
    
    @Override
    public String toString() {
        String ret = "";

        Node it = head;
        while (it.hasNext()) {
            ret += "" + it.getValue() + " ";
            it = it.next();
        }
        ret += "" + it.getValue() + " ";
        return ret;
    }

    
    
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(9);
        ll.add(2);
        ll.add(6);
        ll.add(10);
        ll.add(87);
        ll.add(21);
        ll.add(62);
        ll.add(7);
        ll.add(34);
        System.out.println(ll);
        ll.delete(-1);
        ll.delete(0);
        ll.delete(4);
        System.out.println(ll);
    }
}