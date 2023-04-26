package de.neuefische;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        linkedList ll = new linkedList(new listElement("test"));
        ll.addElement(new listElement("test2"));
        ll.printAllElements();
    }
}