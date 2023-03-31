package VD;




import java.util.Scanner;
class Node {
    int data;
    Node next;
    Node (int x) {
        data = x;
        next = null;
    }
    Node (int x, Node t) {
        data = x;
        next = t;
    }
    public String toString() {
        String t = "" + data + " -> ";
        return t;
    }
}
public class Linked {
    Node head;
    int size = 0;
    Linked(){
        head = null;
    }
    void taods() {
        int x;
        Node cuoi = null;
        head = null;
        while(true) {
            Scanner kb = new Scanner(System.in);
            System.out.println("\nNhap x: ");
            x = kb.nextInt();
            if(x==0)
                break;
            Node t = new Node(x);
            if(this.head == null)
                head = cuoi = t;
            else
                cuoi.next = t; cuoi = t;
            size++;
        }
    }

    void in() {
        System.out.print("Noi dung danh sach: ==>");
        Node p = head;
        while(p!=null) {
            System.out.print(p);
            p= p.next;
        }
        System.out.println("null");
    }
    void min() {
        Node p = head;
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
        Node t = new Node(x);
        if(head == null)
            head = t;
        else {
            Node p = head;
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
            head = new Node(x, head);
        else {
            int vt = 1;
            Node p = head;
            while(p!=null && vt<k-1) {
                vt++;
                p=p.next;
            }
            if(p==null) {
                System.out.println("position error");
            }else {
                Node t = new Node(x, p.next);
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
                Node p = head;
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
    void reverse() {
        if (head == null) System.out.println("Khong the dao mang");
        else {
            Node current = head, p = null;
            while (current != null) {
                Node temp = current.next;
                current.next = p;
                p = current;
                current = temp;
            }
            while (p != null) {
                System.out.print(p);
                p = p.next;
            }
            System.out.print("null\n");
        }
    }
    boolean checkIncrease() {
        if (head == null) {
            return true;
        }
        for (Node p = head; p.next != null; p = p.next) {
            if (p.data > p.next.data) {
                return false;
            }
        }
        return true;
    }
    void deleteOddElement() {
        if (head == null) System.out.println("Khong the xoa");
        else {
            while (head != null && head.data % 2 == 1) {
                head = head.next;
            }
            Node p = head;
            while (p != null && p.next != null) {
                if (p.next.data % 2 == 1) {
                    p.next = p.next.next;
                } else {
                    p = p.next;
                }
            }
        }
    }
    void remove(){
        Node buf=head;
        Node prev=null;
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
    void sortList() {
        Node p = head, t = null;
        int temp;
        if (head == null) {
            System.out.println("Khong the sap xep duoc");
        } else {
            while (p != null) {
                t = p.next;
                while (t != null) {
                    if (p.data > t.data) {
                        temp = p.data;
                        p.data = t.data;
                        t.data = temp;
                    }
                    t = t.next;
                }
                p = p.next;
            }
        }
    }
    void insertIncreaseList(Node x) {
        if(!checkIncrease()) {
            System.out.println("Danh sach chua tang dan!");
        } else {
            Node t;
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
    void printMidleNode() {
        if (head == null) System.out.println("Mang rong khong the thuc hien!");
        else {
            int count = 0;
            Node mid = head;
            while (head != null) {
                if ((count % 2) == 1) mid = mid.next;
                ++count;
                head = head.next;
            }
            if (mid != null) {
                System.out.println("Middle Node: " + mid.data);
            }
        }
    }
    public static void main(String[] args) {
        Linked l = new Linked();
        l.taods();
        l.in();
//        System.out.println("MIN: ");
//        l.min();
//        System.out.println("\nADD x into end DS");
//        l.append(10);
//        l.in();
//        System.out.println("\nAFTER INSERT ");
//        l.insert(9, 4);
//        l.in();
//        System.out.println("AFTER REMOVE HEAD");
//        l.removeHead();
//        l.in();
//        System.out.println("AFTER REMOVE END");
//        l.removeEnd();
//        l.in();
//        System.out.println("REMOVE postion in DS");
//        l.removek(3);
//        l.in();
        System.out.println("AFTER REVERSE");
        l.reverse();

        System.out.println("AFTER DELETEODD");
        l.deleteOddElement();
        if (l.checkIncrease()) {
            System.out.println("Tang");
        } else {
            System.out.println("Khong tang");
        }
        l.in();
//          l.remove();
//          l.in();
//        System.out.println("SORT");
//        l.sortList();
//        l.in();
//        System.out.println("AFTER INSERTSORT");
//        l.insertIncreaseList(new Node(4));
//        l.in();
//        l.printMidleNode();
    }
}
