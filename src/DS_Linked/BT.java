package DS_Linked;
import java.util.Scanner;
import java.util.Scanner;

class node {
    int data;
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
public class BT {
    node head;
    int size = 0;
    BT(){
        head = null;
    }
    void taods() {
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
    void min() {
        node p = head;
        int min;
        if(head == null) {
            System.out.println("DS ong");
        }else {
            min = head.data;
            while(p != null) {
                if(min > p.data) {
                    min = p.data;
                }
                p = p.next;
            }
            System.out.println("Gia tri nho nhat: " + min);
        }
    }
    void append(int x) {
        node t = new node(x);
        if(head == null)
            head = t;
        else {
            node p = head;
            while(p.next!=null)
                p=p.next;
            p.next=t;
        }
    }
    void insert(int x, int k) {
        if(k < 1)
            System.out.println("Position error");
        else
        if(k==1)
            head = new node(x, head);
        else {
            int vt = 1;
            node p = head;
            while(p!=null && vt<k-1) {
                vt++;
                p=p.next;
            }
            if(p==null) {
                System.out.println("position error");
            }else {
                node t = new node(x, p.next);
                p.next=t;
            }
        }
    }

    void removeHead() {
        if(head == null) {
            System.out.println("DS NULL");
        }else {
            head = head.next;
        }
    }
    void removeEnd() {
        removek(size);
    }
    void removek(int k) {
        if(k<1 || head == null) {
            System.out.println("No remove?");
        }else {
            if(k==1) {
                removeHead();
            }else {
                int vt = 1;
                node p = head;
                while(p!=null && vt<k-1) {
                    vt++;
                    p=p.next;
                }
                if(p==null|| p.next== null) {
                    System.out.println("Ko xoa dc");
                }else {
                    p.next = p.next.next;
                }
            }
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        BT l = new BT();
        l.taods();
        l.in();
        System.out.println("MIN: ");
        l.min();
        System.out.println("\nADD x into end DS");
        l.append(10);
        l.in();
        System.out.println("\nAFTER INSERT ");
        l.insert(9, 4);
        l.in();
        System.out.println("AFTER REMOVE HEAD");
        l.removeHead();
        l.in();
        System.out.println("AFTER REMOVE END");
        l.removeEnd();
        l.in();
        System.out.println("REMOVE postion in DS");
        l.removek(3);
        l.in();
    }

}

