package ss10_arraylist.thuc_hanh.bai1;

import java.util.Arrays;

public class MyList<E> {
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    private Node head;
    private int numNode = 0;

    public MyList() {
    }

    public void addFirst(E element) {
        Node temp = head;
        head = new Node(element);
        head.next = temp;
        numNode++;
    }

    public void addLast(E element) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(element);
        numNode++;
    }

    public void addLast(int index, E element) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNode++;
    }

    public Object get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }
    public int size(){
        return numNode;
    }

    public E remove(int index) throws IllegalAccessException {
        if(index<0||index>numNode){
            throw new IllegalAccessException("Error index: "+index);
        }
        Node temp=head;
        Object data;
        if(index==0){
            data=temp.data;
            head=head.next;
            numNode--;
        }else {
            for(int i=0;i<index-1&&temp.next!=null;i++){
                temp= temp.next;
            }
            data=temp.next.data;
            temp.next=temp.next.next;
            numNode--;
        }
        return (E) data;
    }
    public boolean remove(E element)throws IllegalAccessException{
        if(head.data.equals(element)){
            remove(0);
            return true;
        }else {
            Node temp=head;
            while (temp.next!=null){
                if(temp.next.data.equals(element)){
                    temp.next=temp.next.next;
                    numNode--;
                    return true;
                }
                temp=temp.next;
            }
        }
        return false;
    }

    public MyList<E> clone(){
        if(numNode==0){
            throw  new NullPointerException("Null");
        }
        MyList<E> returnLinkedList= new MyList<>();
        Node temp=head;
        returnLinkedList.addFirst((E) temp);
        temp=temp.next;
        while (temp!=null){
            returnLinkedList.addLast((E) temp.data);
            temp=temp.next;
        }
        return returnLinkedList;
    }

    public boolean constrains(E element){
        Node temp=head;
        while (temp.next!=null){
            if (temp.data.equals(element)){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }

    public int indexOf(E element){
        Node temp=head;
        for(int i=0;i<numNode;i++){
            if(temp.getData().equals(element)){
                return i;
            }
            temp=temp.next;
        }
        return -1;
    }
}
