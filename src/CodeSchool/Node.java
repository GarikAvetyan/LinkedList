package CodeSchool;

public class Node {
    private String string;
    Node prev;
    Node next;

    //Constructor
    public Node(String value) {
        this.string = value;
        this.next = null;
        this.prev = null;
    }

    //get
    public String getString() {
        return string;
    }

    //set
    public void setString(String string) {
        this.string = string;
    }
}
