package de.neuefische;

public class linkedList {
    listElement root;

    public linkedList(listElement element)
    {
        root = element;
    }

    public int countElements()
    {
        listElement temp = root;
        int counter = 0;

        while (temp != null)
        {
            temp = temp.next();
            counter++;
        }
        return counter;
    }

    public void addElement(listElement newElement)
    {
        lastElement().next = newElement;
    }

    public listElement elementAt(int pos)
    {
        listElement temp = root;
        int counter = 0;
        while (temp != null)
        {
            temp = temp.next();
            counter++;
            if (counter == pos)
            {
                return temp;
            }
        }
        return null;
    }

    public listElement firstElement()
    {
        return root;
    }

    public listElement lastElement()
    {
        listElement temp = root;
        listElement lastElement = temp;

        while (temp != null)
        {
            lastElement = temp;
            temp = temp.next();
        }
        return lastElement;
    }

    public void printAllElements()
    {
        listElement temp = root;

        while (temp != null)
        {
            System.out.println("Value: " + temp.value);
            temp = temp.next();
        }
    }
}
