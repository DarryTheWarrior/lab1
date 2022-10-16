package org.example;

    /**
     * Node class
     */
public class Element {
    /**
    * value is a base of node class
    */
    int value;
    /**
     * previous is a previous element of list
     */
    Element previous;
    /**
    * next is a next element of list
    */
    Element next;
    public Element(int n,Element previous, Element next)
    {
        this.value = n;
        this.previous = previous;
        this.next = next;
    }
    /**
     * method returns value of node
     * @return value
     */
    public int getvalue()
    {
        return value;
    }
    /**
    * method returns previous node
    * @return previous node
    */
    public Element getprevios()
    {
        return previous;
    }
    /**
    * method returns next node
    * @return next node
    */
    public Element getnext()
    {
        return next;
    }
}
