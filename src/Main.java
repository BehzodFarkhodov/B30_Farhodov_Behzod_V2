
public class Main {
    public static void main(String[] args) {

    CustomDoublyLinkedList <Integer>  customDoublyLinkedList = new CustomDoublyLinkedList<Integer>();
    customDoublyLinkedList.add(12);
    customDoublyLinkedList.add(2);
    customDoublyLinkedList.add(3);
    customDoublyLinkedList.add(5);
    System.out.println(customDoublyLinkedList.toString());

    customDoublyLinkedList.remove(2);
    System.out.println(customDoublyLinkedList.toString());

    customDoublyLinkedList.get(3);
    System.out.println(customDoublyLinkedList.toString());

    customDoublyLinkedList.contains(7);
    System.out.println(customDoublyLinkedList);
    }



}