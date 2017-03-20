package ksu.cs5000.spring17.Mar15;


public class Stack {

    static class StackNode {
        int data;
        StackNode next;
    }

    StackNode head;

    void push(int n) {
        StackNode node = new StackNode();
        node.data=n;
        node.next = head;
        head = node;
    }

    void pop(){
        if(head!=null) {
            head = head.next;
        }
    }
    int top() {
        if(head==null)
            return 0;
        return head.data;
    }

    public static String toString(StackNode node) {
        if(node==null)
            return "";
        return node.data+","+toString(node.next);
    }

    void printAll() {
        System.out.println(toString(head));
    }

    @Override
    public String toString() {
        return toString(head);
    }
}
