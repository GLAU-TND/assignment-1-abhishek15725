package defination;
import adt.ContactListADT;
import java.util.ArrayList;

public class ContactList<Person> implements ContactListADT<Person> {
        ArrayList arrayOfNames = new ArrayList<String>();
        ArrayList arrayOfFirstName = new ArrayList<String>();
        private Node<Person> head;
        private int size = 0;
        private int counter = 0;

        private void addFirst(Person personData) {
            head = new Node<>(personData, head);
            size++;
        }
    private void addAfter(Node<Person> personNode, Person personData) {
        personNode.next = new Node<>(personData, personNode.next);
        size++;
    }

    public int getSize() {
        return size;
    }
    public void add(int index, Person personData) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        } else if (size == 0) {
            addFirst(personData);
        } else {
            Node<Person> temp = getNode(index - 1);
            addAfter(temp, personData);
        }
    }
}
