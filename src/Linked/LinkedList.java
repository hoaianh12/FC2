package Linked;

import java.util.Scanner;
class node {
    int data;
    node next;
    node(int x){
        data = x;
        next = null;
    }
    node(int x, node t) {
        data = x;
        next = t;
    }
    public String toString(){
        return data + "-->";
    }

}
public class LinkedList {
    node head;

    LinkedList() {
        head = null;
    }

    void add(int x) {
        head = new node(x, head);
    }

    void in() {
        System.out.print("noi dung danh sach: ===>");
        node p = head;
        while (p != null) {
            System.out.println(p);
            p = p.next;
        }
        System.out.print(" null");
    }
    int dem(){
        int k =0;
        node p = head;
        while (p != null) {
            k++;
            p=p.next;
        }
        return k;
    }
    int tong() {
        int k = 0;
        node p = head;
        while (p != null) {
            k = k + p.data;
            p = p.next;
        }
        return k;
    }
    int demle(){
        int k = 0;
        node p = head;
        while(p!=null){
            if(p.data%2!=0)
                k++;
            p=p.next;
        }
        return k;
    }
    int max(){
        int max =0;
        node p = head;
        while (p != null) {
            if(p.data > max)
                max =p.data;
            p=p.next;
        }
        return max;
    }

    void taods(){
        int x;
        node cuoi = null;
        head = null;
        while(true){
            Scanner kb = new Scanner(System.in);
            System.out.println("\nNhap x: ");
            x = kb.nextInt();
            if(x==0)
                break;
            node t = new node(x);
            if(this.head==null)
                head = cuoi = t;
            else
                cuoi.next = t; cuoi = t;
        }

    }
    void append(int x) {
        node t = new node(x);
        if(head==null)
            head = t;
        else{
            node p = head;
            while(p.next!=null)
                p=p.next; p.next = t;
        }
    }



    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.taods();
        l.in();
        System.out.println("Dem: " + l.dem());
        System.out.println("Tong cac node: " + l.tong());
        System.out.println("Dem le: " + l.demle());
        System.out.println("Max: " + l.max());
        l.append(8);
        l.in();
    }
    }
