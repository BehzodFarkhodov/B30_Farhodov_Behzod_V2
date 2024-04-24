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

    public T get(int index){ // birinchi usul
        if(index<0 || index > size){
            throw new IndexOutOfBoundsException(Messages.ERROR);
        }
        Node temp = head;
        for(int i = 0; i<index;i++){
            temp = temp.next;
        }
        return temp.value;
    }
    public T get2(int index){      // ikkinchi usul
        int c = size - 1;
        for (Node x = head; x != null; x = x.next){
            if (c == index){
                return x.value;
            }
            c--;
        }

        return null;
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



    public void remove(int index){
        if (index == 0){
            head = head.next;
            size--;
            return;
        }

        if (index == size - 1){
            last.prev.next = null;
            size--;
            return;
        }

        int c = size - 1;
        for (Node x = head; x != null; x = x.next){
            if (c == index){
                x.prev.next = x.next;
                return;
            }
            c--;
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
