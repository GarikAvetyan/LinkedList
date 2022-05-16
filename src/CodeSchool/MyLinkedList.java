package CodeSchool;

public class MyLinkedList {
    private Node value;
    private int count;

    //Default Constructor
    public MyLinkedList() {
        count = 0;
        value = null;
    }

    //Cuyca talis size-y
    public int getSize() {
        return count;
    }

    //Gtnuma elelemnt indexov
    public String getElement(int index) {
        if (index < 0 || index >= this.count) {
            return "Not value";
        }

        int counter = 0;
        Node newNode = value;

        while (counter != index) {
            newNode = newNode.next;
            counter++;
        }

        return newNode.getString();
    }


    //Lcnuma arjeq skzbic
    public void addBeginning(String string) {
        Node newNode = new Node(string);

        if (count == 0) {
            newNode.next = this.value;
            this.value = newNode;
        } else {

            newNode.next = this.value;
            this.value = newNode;
            this.value.next.prev = newNode;

        }

        this.count++;
    }


    //Lcnuma arjeq verjic
    public void addEnding(String string) {

        if (count == 0) {
            addBeginning(string);
        } else {
            Node newNode = new Node(string);
            Node temp = value;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
            newNode.prev = temp;
            newNode.next = null;

            this.count++;
        }

    }

    //Jnjuma element
    public void remove(int index) {
        if (index < 0 || index >= count) {
            System.out.println("No Exits");
        } else {
            int i = 0;
            Node node = value;

            while (i < index) {
                i++;
                node = node.next;
            }

            Node next = node.next.next;
            next.prev = node;
            node.next = next;
            count--;
        }
    }


}
