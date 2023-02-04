// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class LinkListNode {
    int data;
    LinkListNode next;
    LinkListNode(int data) {
        this.data = data;
    }
}
class LinkList {
    LinkListNode head;
    void printlist() {
        LinkListNode temp= head;
        while(temp!=null) {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }
    void reverseList() {
        if(head == null || head.next == null) {
            return;
        }
        LinkListNode prev = null, cur=head;
        while(cur!=null) {
            LinkListNode temp=cur;
            cur=cur.next;
            temp.next=prev;
            prev=temp;
        }
        head=prev;
    }
}
class HelloWorld {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.head = new LinkListNode(1);
        list.head.next = new LinkListNode(2);
        // list.head.next.next = new LinkListNode(3);
        // list.head.next.next.next = new LinkListNode(4);
        list.reverseList();
        list.printlist();
    }
}
