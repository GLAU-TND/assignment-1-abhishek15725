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
}
