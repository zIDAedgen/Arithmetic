package javaLearning;

class Node<T> {
    private T  data;
    private Node next;

    public Node(T data) {
        this.data = data;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node getNext() {
        return this.next;
    }

    public T getData() {
        return this.data;
    }
}



public class TestLinkedList {
    public static void main(String args[]) {
        Node<String> nodeOne = new Node<>("A");
        Node<String> nodeTwo = new Node<>("B");
        Node<String> nodeThree = new Node<>("C");
        nodeOne.setNext(nodeTwo);
        nodeTwo.setNext(nodeThree);

        Node<String> currentNode = nodeOne;


        prints(currentNode);
        /**
        while (currentNode != null) {
             System.out.print(currentNode.getData() + " / ");
             currentNode = currentNode.getNext();
        */

        }

        public static void prints(Node currentNode) {
            if (currentNode == null) {
                return;
            }

            System.out.print(currentNode.getData() + " -> ");
            prints(currentNode.getNext());
    }
}
