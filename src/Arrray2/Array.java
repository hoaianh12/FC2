package Arrray2;

import java.util.Random;
import java.util.Scanner;

public class Array {
    int [][]a;
    int m,n;// m la so hang, n la so cot
    void input(){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter line: ");
        m = kb.nextInt();
        System.out.println("Enter column: ");
        n = kb.nextInt();
        a = new int[m][n];
        Random rd = new Random();
        for(int i =0; i < m; i++)
            for(int j = 0; j < n; j++)
                a[i][j] = rd.nextInt()%100;

    }
    void output(){
        for(int i = 0; i < m; i++){
            System.out.println("");
            for(int j = 0; j < n; j++)
                System.out.format("%5d", a[i][j]);
        }
    }
    void max_line(){
        for(int i = 0; i < m; i++){
            int max = a[i][0];
            for(int j = 0;j < n; j++){
                if(a[i][j] > max)
                    max = a[i][j];
            }
            System.out.println("Max dong "+i+": "+ max);
        }
    }
    void average_le(){
        //duyet tuan tu tung cot j cua mang
        double d = 0, s=0;
        for(int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++)
                if (a[i][j] % 2 != 0) {
                    d++;
                    s += a[i][j];
                }
            if(d==0){
                System.out.println("0");
            }else {
                System.out.println("TB " + (j+1)+": " +(s/d));
            }
        }
    }
    void roate_line(){
        for(int i =0; i < m; i++){
            int left = 0, right = n-1;
            while(left < right){
                int[] t = a[left];
                a[left] = a[right];
                a[right] = t;
                left++;
                right--;
            }
        }
    }
    void roate(){
        int b[][] = new int[n][m];
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                b[i][j] = a[m-1-j][i];
        a=b;
        int t= m;
        m=n;
        n=t;

    }
    public static void main(String[] args){
        Array p = new Array();
        p.input();
        p.output();
        System.out.println("\nIN xong!!");
        System.out.println("\nMAX LINE\n");
        p.max_line();
        p.average_le();
        p.roate_line();
        p.output();
        System.out.println("\nSAU KHI XOAY");
        p.roate();
        p.output();
    }
}
