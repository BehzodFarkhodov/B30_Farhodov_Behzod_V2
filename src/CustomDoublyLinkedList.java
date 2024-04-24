import utils.Messages;

import java.util.Objects;

public class CustomDoublyLinkedList <T>{
    private Node head;
    private Node last;
    private int size = 0;

    private class Node {

        T value;
        Node next;
        Node prev;

        public Node(T value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

        public Node(T value) {
            this.value = value;
        }
    }

    public void add(T element){
        if(Objects.isNull(head)){
            head = new Node(element);
            last = head;
            size++;
        }

        last.next = new Node(element);
        last.next.prev = last;
        last = last.next;
        size++;
    }

    public T get(int index){
        if(index<0 || index > size){
            throw new IndexOutOfBoundsException(Messages.ERROR);
        }
        Node temp = head;
        for(int i = 0; i<index;i++){
            temp = temp.next;
        }
        return temp.value;
    }


    public int indexOf(T element){
        Node current = head;
        int i = 0;
        while(current != null){
            if(current.value.equals(element)){
                return i;
            }
            current = current.next;
            i++;
        }
        return -1;
    }



    public void remove(T element){
        if(Objects.equals(head.value, element)){
            head = head.next;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            if(temp.value.equals(element)){
                temp.prev = temp.next;
            }
        }
    }
    public boolean contains(T element){
        Node temp = head;
        while (head != null){
            if(temp.value.equals(element)){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    @Override
    public String toString() {
        return "CustomDoublyLinkedList{" +
                "head=" + head +
                ", last=" + last +
                ", size=" + size +
                '}';
    }
}
