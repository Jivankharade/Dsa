class MyLinkedList {
    Node head;
    Node tail;
    int size;
    class Node{
        int data;
        Node prev;
        Node next;
            Node(int data){
        this.data = data;
    }
    }


    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
        
    }
    
    public int get(int index) {
    Node current = head;
     if(index<0||index>=size){
        return -1;
    }
    for(int i = 0;i<index;i++){
        current = current.next;
    }
    return current.data;
   
        
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        if(head==null){
            head = newNode;
            tail = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        size++;
        
    }
    
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if(head==null){
            head = newNode;
            tail = newNode;
            size ++;
            return;
        }
        newNode.prev = tail;
        tail.next = newNode;
        tail =  newNode;
        size++; 
    }
    
   
        public void addAtIndex(int index, int val) {

    if (index < 0 || index > size) {
        return;
    }

    if (index == 0) {
        addAtHead(val);
        return;
    }

    if (index == size) {
        addAtTail(val);
        return;
    }

    Node newNode = new Node(val);
    Node current = head;

    for (int i = 0; i < index; i++) {
        current = current.next;
    }

    newNode.prev = current.prev;
    newNode.next = current;

    current.prev.next = newNode;
    current.prev = newNode;

    size++;
}
        
        
    
    

 public void deleteAtIndex(int index) {

    // Invalid index
    if (index < 0 || index >= size) {
        return;
    }

    // Only one node
    if (size == 1) {
        head = null;
        tail = null;
        size--;
        return;
    }

    // Delete first node
    if (index == 0) {
        head = head.next;
        head.prev = null;
        size--;
        return;
    }

    // Delete last node
    if (index == size - 1) {
        tail = tail.prev;
        tail.next = null;
        size--;
        return;
    }

    // Delete middle node
    Node current = head;

    for (int i = 0; i < index; i++) {
        current = current.next;
    }

    current.prev.next = current.next;
    current.next.prev = current.prev;

    size--;
}
    }



/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */