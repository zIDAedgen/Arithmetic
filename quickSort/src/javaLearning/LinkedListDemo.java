package javaLearning;


//build a standard
interface ILink<T> {
    public void add(T data);
    public int size();
    public boolean isEmpty();
    public Object[] toArray();
    public T get(int index);
    public T set(int index, T newData);
    public boolean contains(T data);
    public void remove(T data);
    public void clear();
}

class LinkImpl<T> implements ILink<T> {
    private Node<T> root;
    private int counter;
    private int foot;
    private Object[] returnData;

    private class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }


        //Who calls this method at first time ? ==> LinkImpl.root
        public void addNode(Node<T> newNode) {
            if (this.next == null) {
                this.next = newNode;
            } else {
                this.next.addNode(newNode);
            }
        }

        public void toArrayNode() {
            LinkImpl.this.returnData[LinkImpl.this.foot++] = this.data;
            if (this.next != null) {
                this.next.toArrayNode();
            }
        }

        public T getNode(int index) {
            if (LinkImpl.this.foot ++ == index) {
                return this.data;
            } else {
                if (this.next != null) {
                    return this.next.getNode(index);
                } else {
                    return null;
                }
            }
        }

        public T setNode(int index, T newData) {
            if (LinkImpl.this.foot++ == index ) {
                T temp = this.data;
                this.data = newData;
                return temp;
            } else {
                if (this.next != null) {
                    return this.next.setNode(index, newData);
                } else {
                    return null;
                }
            }
        }

        public boolean containsNode(T input) {
            if (this.data.equals(input)) {
                return true;
            } else {
                if (this.next != null) {
                    return this.next.containsNode(input);
                } else {
                    return false;
                }
            }
        }

        public void removeNode(Node<T> previous, T data) {
            if (this.data.equals(data)) {
                previous.next = this.next;
            } else {
                if (this.next != null) {
                    this.next.removeNode(this, data);
                } else {
                    System.out.println("null");
                }
            }
        }


    }

    public void add(T data) {
        if (data == null) {
            System.out.println("Null");
        }

        Node<T> newNode = new Node<T>(data);
        if (this.root == null) {
            this.root = newNode;
        } else {
            this.root.addNode(newNode);
        }
        counter = counter + 1;
    }

    public int size() {
        return this.counter;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public Object[] toArray() {
        if (this.size() == 0) {
            return null;
        }
        this.foot = 0;
        this.returnData = new Object[this.size()];
        this.root.toArrayNode();
        return this.returnData;
    }

    public T get(int index) {
        if (index > this.size()) {
            return null;
        }

        foot = 0;
        return this.root.getNode(index);
    }

    public T set(int index, T newData) {
        if (index > this.size()) {
            return null;
        }

        this.foot = 0;
        return this.root.setNode(index, newData);
    }

    public boolean contains(T data) {
        if (this.size() == 0 || data == null) {
            return false;
        } else {
            return this.root.containsNode(data);
        }
    }

    public void remove(T data) {
        if (this.size() == 0 || data == null) {
            return;
        }

        if (this.root.data.equals(data)) {
            this.root = this.root.next;
        } else {
            if (this.root.next != null) {
                this.root.next.removeNode(this.root, data);
            }
        }
        this.counter --;
    }

    public void clear() {
        this.root = null;
        this.counter = 0;
    }

}




public class LinkedListDemo {
    public static void main(String[] args) {
        ILink<String> link = new LinkImpl<String>();
        System.out.println(link.size());
        System.out.println(link.isEmpty());
        link.add("H");
        link.add("e");
        link.add("l");
        link.add("l");
        link.add("o");
        System.out.println(link.size());
        System.out.println(link.isEmpty());

        Object[] result = link.toArray();
        int timer = 0;

        for (Object temp : result) {
            if (timer == result.length - 1) {
                break;
            }
            System.out.print(temp + "->");
            timer++;

        }
        System.out.println(result[result.length - 1]);

        System.out.println(link.get(0));
        System.out.println(link.get(1));
        System.out.println(link.get(6));
        System.out.println(link.set(0, "h"));
        System.out.println(link.get(0));
        System.out.println(link.contains("d"));
        link.remove("l");
        link.remove("h");
        System.out.println(link.get(0));






    }

}
