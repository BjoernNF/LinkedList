package de.neuefische;

public class listElement {
    String value;

    listElement next;

    public void addElement(listElement newElement)
    {
        listElement old = next;
        newElement.next = old;
        next = newElement;
    }

    public listElement(String value)
    {
        this.value = value;
        next = null;
    }

    public listElement next()
    {
        return next;
    }

    public void setNext(listElement element)
    {
        this.next = element;
    }
}
