package Data_and_Structure.Linked_List;

public class LL {
    // every linked list have head and a tail.......
    private Node head;
    private Node tail;
    private int size;
    public LL ()
    {
    this.size = 0;
    }

  public void insertFirst(int val){
        Node node = new Node(val);
        node.next= head;
        head=node;
        if (tail==null){
            tail=head;
        }
  }


  public void insrtLast(int val){
        if (tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next= node;
        tail=node;
  }

  public void insert(int val,int index){
        if (index==0){
            insertFirst(val);
            return;
        }
        if (index==size){
            insrtLast(val);
            return;
        }
        Node temp = head;
        for (int i=0;i<index;i++){
            temp=temp.next;
        }
        Node node = new Node(temp.next,val);
        temp.next=node;
  }
    public  void display(){
        Node temp = head;
        while (temp!= null){
            System.out.println(temp.value);

            temp= temp.next;
        }

    }


    private class Node{
        private Node next;
        private int value;

        public Node(Node next, int value) {
            this.next = next;
            this.value = value;
        }

        private Node(int value) {
            this.value = value;
        }
    }
}
