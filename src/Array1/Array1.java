package Array1;

import java.util.Scanner;

public class Array1 {
    int a[];
    void input() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu: ");
        int n = kb.nextInt();
        a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = (int)(Math.random()*10001);
    }
    void output(){
        System.out.println("\nNoi dung mang");
        for(int i =0; i < a.length; i++)
            System.out.println(a[i]+ " ");
    }
    void xoay(int k) {
        int n = a.length;
        for(int i = 0; i < k; i++) {
            int x = a[0];
            for(int j = 0; j < n-1; j++)
                a[j] = a[j+1];
            a[n-1] = x;
        }
    }
    void dao(int ll, int rr) {
        int i = ll, j = rr;
        while(i < j) {
            int t  = a[i];
            a[i] = a[j];
            a[j] = t;
            i++;
            j--;
        }

    }
    public static void main(String[] args){
        Array1 p = new Array1();
        p.input();
        p.output();
        p.dao(1,5);
        p.output();
        p.xoay(431);
        p.output();

        }
    }

