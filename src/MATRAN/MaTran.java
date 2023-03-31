package MATRAN;
import java.util.Scanner;
import java.util.Random;
public class MaTran {
    int a[][];
    int m,n;
    void input() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter m: ");
        m = kb.nextInt();
        System.out.println("Enter n: ");
        n = kb.nextInt();
        a = new int[m][n];
        Random rd = new Random();
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                a[i][j] = rd.nextInt()%100;
    }
    void output() {
        for(int i  =0; i < m; i++) {
            System.out.println("\n");
            for(int j = 0; j < n; j++)
                System.out.format("%5d ", a[i][j]);
        }
    }
    MaTran Nhan(MaTran B){
        if(this.n!=B.m) {
            System.out.println("Ko nhan duoc hai MT nay!");
            return new MaTran();
        }else {
            MaTran C = new MaTran();
            C.a = new int[m][B.n];
            C.m = m;
            C.n = B.n;
            for(int i = 0; i < m; i++)
                for(int j = 0; j < B.n; j++) {
                    int t = 0;
                    for(int k = 0; k < n; k++)
                        t = t+a[i][k]*B.a[k][j];
                    C.a[i][j] = t;
                }

            return C;
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MaTran A,B,C;
        A = new MaTran();
        B = new MaTran();
        C = new MaTran();
        A.input();
        B.input();
        C = A.Nhan(B);
        System.out.println("\nMA TRAN A");
        A.output();
        System.out.println("\nMA TRAN B");
        B.output();
        System.out.println("\nMA TRAN C");
        C.output();
    }

}

