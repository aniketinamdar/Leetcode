package com.company;

public class DLL {
    private Node head ;
    private Node tail ;
    public void insertFirst(int val)
    {
        Node node = new Node(val);
        node.next=head;
        node.prev = null;
        if (head!=null){
        head.prev = node;}
        head = node;
    }
    public void display()
    {
        Node node = head ;
        while(node!=null) {
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.print("NULL");
    }
    public void displayReverse()
    {
        Node node = head ;
        Node last = null;
        System.out.println();
        while(node!=null) {
            System.out.print(node.value + " -> ");
            last=node;
            node = node.next;
        }
        System.out.print("NULL");
        System.out.println();

        while(last!=null)
        {
            System.out.print(last.value+" -> ");
            last = last.prev;
        }
        System.out.println("Start");
    }
    public void insertLast(int val)
    {
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        if (head==null)
        {
            node.prev=null;
            head = node;
            return;
        }
        while(last.next!=null)
        {
            last = last.next;
        }
        last.next= node;
        node.prev = last;
    }
    public void insertAfterValue(int after_value , int val)
    {
        Node p = find(after_value);
        if (p==null)
        {
            System.out.println("does not exist");
            return;
        }
        Node node = new Node(val);
        node.next= p.next;
        p.next= node;
        node.prev=p;
        node.next.prev = node;
    }
    public Node find(int val)
    {
        Node node = head;
        while (node!=null)
        {
            if (node.value==val)
            {
                return node;
            }
            node=node.next;
        }
        return null;
    }
    private class Node
    {
        int value;
        Node next ;
        Node prev;
        public Node(int value)
        {
            this.value = value;
        }
        public Node(int value , Node next , Node prev)
        {
            this.value=value;
            this.next=next;
            this.prev=prev;
        }
    }
}
