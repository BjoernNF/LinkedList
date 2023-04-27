package de.neuefische;

public class listElement<T> {
    private T value;
    listElement next;

    public void addElement(listElement newElement)
    {
        listElement old = next;
        newElement.next = old;
        next = newElement;
    }

    public listElement(T value)
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

    public T getValue()
    {
        return value;
    }

    public void setValue(T value)
    {
        this.value = value;
    }
}
