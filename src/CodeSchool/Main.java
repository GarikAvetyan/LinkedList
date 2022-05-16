package CodeSchool;

public class Main {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        for (int i = 0; i < 10; i++) {
            list.addEnding("garik" + i);
        }

        for (int i = 0; i < 10; i++) {
            list.addBeginning("garik" + i);
        }

        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.getElement(i));
        }
        System.out.println(list.getSize());
        list.remove(5);
        list.remove(6);
        list.remove(9);


        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.getElement(i));
        }
        System.out.println(list.getSize());
    }
}
