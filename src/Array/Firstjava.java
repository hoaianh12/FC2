package Array;

import java.util.Scanner;

public class Firstjava {
    int a[];
    void input(){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = kb.nextInt();
        a = new int[n];
        for(int i =0; i < n; i++){
            a[i] = (int)(Math.random()*10);
        }
    }
    void output(){
        System.out.println("Information array...");
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]+"");
        }
    }
    void insert(int x, int k){
        int n = a.length;
        if(k < 0 || k > n){
            System.out.println("No position insert");
        }else{
            int []b;
            b = new int[n+1];
            for(int i =0; i < k; i++){
                b[i] = a[i];
            }
            for(int i = n; i > k; i--){
                b[i] = a[i-1];
            }
            b[k] = x;
            a=b;
        }
    }
    void findmax(){
        int max = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] > max)
                max =a[i];
        }
        System.out.println("Value max: " + max);
    }
    void find2max(){
        int max = 0;
        int i;
        for( i = 0; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }
        int max1 = 0;
        for( i = 0; i < a.length; i++)
            if(max1 < a[i]  && a[i] != max)
            max1 = a[i];
           //st = i+1;
        System.out.println("MAx1: "+max1);
        }


    void plate(){
         int i = 0, j = a.length-1;
         while(i < j){
             int temp = a[i];
             a[i++] = a[j];
             a[j--] = temp;
         }

    }
    void deletesound(){
        int k = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] >=0)
                k++;
        }
        int []b= new int[k];
        int j = 0;
        for(int i = 0; i < a.length; i++)
            if(a[i] >=0)
                b[j++] = a[i];
        a=b;
    }
    public static void main(String[] args){
        Firstjava p = new Firstjava();
        p.input();
        p.output();
        int x = 22;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter position: ");
        int k = kb.nextInt();
        p.insert(x, k);
        p.output();
        p.findmax();
        p.find2max();
        System.out.println("\n\tAFTER PLATE ISLAND");
        p.plate();
        p.output();
        p.deletesound();
    }
}
