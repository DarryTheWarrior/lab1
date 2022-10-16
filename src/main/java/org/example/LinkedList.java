package org.example;

    /**
     * Container class
     */
public class LinkedList {
    /**
     * the base of an double linked list container
     */
    private Element head;
    private Element tail;

    /**
     * The function of adding an element to the container
     * @param ne item to add
     */

    public void add(int ne)
    {
        if (this.head == null)
        {
            this.head = new Element(ne, null, null);
            this.tail = this.head;
        }
        else
        {
            this.tail.next = new Element(ne, this.tail, null);
            this.tail = this.tail.next;
        }
    }
    /**
     * Method for getting the element value
     * @param ind index of the element to get the value
     * @return node of the element with the given index
     */
    public Element get(int ind)
    {
        int i = 0;
        Element resElement = this.head ;
        while (i<ind && resElement!=null) {
            resElement = resElement.next;
            i++;
        }
        if (i != ind)
            resElement = null;
        return resElement;
    }
    /**
     * *Method of deleting an element
     * @param ind index of the item to delete
     * @return removed element
     */
    public Element remove(int ind)
    {
        int i = 0;
        Element resElement = this.head ;
        while (i<ind && resElement!=null) {
            resElement = resElement.next;
            i++;
        }
        if (i == ind && resElement!=null)
        {
            if (i!=0)
            {
                resElement.previous.next = resElement.next;
                if (resElement.next!= null)
                    resElement.next.previous = resElement.previous;
            }
            else
            {
                this.head = this.head.next;
                this.head.previous = null;
            }
            resElement.next = null;
            resElement.previous = null;
        }
        else
        {
            resElement = null;
        }
        return resElement;
    }
    /**
      * * Method for getting the element value
      * printing list of all elements
      */
    public void printLinkedList ()
    {
        Element idElement = this.head;
        while(idElement!= null)
        {
            System.out.print(idElement.value);
            idElement=idElement.next;
        }
    }
}