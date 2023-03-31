package BTVN;



import java.util.Scanner;

class node {
    int data;
    node L;
    node next;
    node(int x){
        data = x;
        next = null;
    }
    node(int x, node t){
        data = x;
        next = t;
    }
public String toString() {
        return data + "-->";
    }



}
public class BT1<p> {
    static node head;
    int size = 0;
    BT1(){
        head = null;
    }
    void create() {
        int x;
        node cuoi = null;
        head = null;
        while(true) {
            Scanner kb = new Scanner(System.in);
            System.out.println("\nNhap x: ");
            x = kb.nextInt();
            if(x==0)
                break;
            node t = new node(x);
            if(this.head == null)
                head = cuoi = t;
            else
                cuoi.next = t; cuoi = t;
            size++;
        }
    }

    void in() {
        System.out.print("Noi dung danh sach: ==>");
        node p = head;
        while(p!=null) {
            System.out.print(p);
            p= p.next;
        }
        System.out.println("null");
    }

    void reverse()
    {
        node prev = null;
        node current = head;
        node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
    static boolean kt() {
        if(head == null)
            return false;
        else {
            for (node i = head; i.next != null; i = i.next)
                if (i.data > i.next.data)
                    return false;
            return true;
        }
    }
    void sort() {
        for (node i = head; i != null; i = i.next) {
            node mind = i;
            for (node j = i.next; j != null; j = j.next) {
                if (mind.data > j.data) {
                    mind = j;
                }
            }
            int temp = mind.data;
            mind.data = i.data;
            i.data = temp;
        }
    }

    void remove(){
        node buf=head;
        node prev=null;
        if(buf==null)
        {
            System.out.println("Hi:"+buf);
        }

        if(buf.next==null)
        {
            if(buf.data%2!=0)
            {
                System.out.println("Noooo");

            }
        }


        while(buf!=null)
        {
            if(buf.data%2!=0)
            {
                if(prev==null)
                {
                    head=head.next;
                    buf=head;
                }
                else
                {
                    prev.next=buf.next;
                    buf=buf.next;
                }

            }
            else {
                prev=buf;
                buf=buf.next;
            }
        }
    }
    void insertIncreaseList(node x) {
        if(!kt()) {
            System.out.println("Danh sach chua tang dan!");
        } else {
            node t;
            if (head == null || head.data >= x.data) {
                x.next = head;
                head = x;
            } else {
                t = head;
                while (t.next != null && t.next.data < x.data) {
                    t = t.next;
                }
                x.next = t.next;
                t.next = x;
            }
        }
    }
        void findNode()
{
    if(head== null)
    {
        return;
    }
    node slow = head;
    node fast = head;
    while(fast != null && fast.next != null)
    {
        fast = fast.next.next;
        slow = slow.next;
    }
    System.out.println("Gia tri giua la: " + slow.data);
}

    public static void main(String[] args){
        BT1 l = new BT1();
        node new_node;
        l.create();
        l.in();
        System.out.println("SAU KHI DAO");
        l.reverse();
        l.in();
        if(kt() == true){
            System.out.println("Day Tang dan");
        }else{
            System.out.println("Day Ko tang dan");
        }
        System.out.println("SAU KHI XOA");
        l.remove();
        l.in();
        System.out.println("SAU KHI Chen");
        l.insertIncreaseList(new node (4));
        l.in();
        System.out.println("SAU KHI SORT");
        l.sort();
        l.in();
        l.findNode();
    }
}
