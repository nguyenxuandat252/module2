package ss10_arraylist.thuc_hanh.bai2;

public class MyLinkedList {
    private int numNodes;
    private Node head;
    private class Node{
        private Node next;
        private Object data;
        public Node(Object data){
            this.data=data;
        }
        public Object getData() {
            return data;
        }
    }
}
