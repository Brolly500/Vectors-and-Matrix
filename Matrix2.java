import java.util.Scanner;

public class Matrix2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        a[0][0] = sc.nextInt();
        a[0][1] = sc.nextInt();
        a[1][0] = sc.nextInt();
        a[1][1] = sc.nextInt();

        b[0][0] = sc.nextInt();
        b[0][1] = sc.nextInt();
        b[1][0] = sc.nextInt();
        b[1][1] = sc.nextInt();


        print(sum(a, b));
        print(minus(a, b));
        print(mul(a, 7));
        print(matrixmult(a, b));
        System.out.println(opred(a));
        print(revers(a));
        print(sum(a,sum(a,sum(a,sum(a,a)))));

    }

    static void print(int[][] mas) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(mas[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }


     static int[][] sum(int[][] a, int[][] b) {
        int[][] c = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

     static int[][] minus(int[][] a, int[][] b) {
        int[][] c = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = a[i][j] - b[i][j];
            }
        }
        return c;
    }

     static int[][] mul(int[][] a, int n) {
        int[][] c = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = a[i][j] * n;
            }
        }
        return c;
    }

     static int[][] matrixmult(int[][] a, int[][] b) {
        int[][] c = new int[2][2];
        c[0][0] = a[0][0] * b[0][0] + a[0][1] * b[1][0];
        c[0][1] = a[0][0] * b[0][1] + a[0][1] * b[1][1];
        c[1][0] = a[1][0] * b[0][0] + a[1][1] * b[1][0];
        c[1][1] = a[1][0] * b[0][1] + a[1][1] * b[1][1];
        return c;
    }

     static int opred(int[][] a) {
        int c = a[0][0] * a[1][1] - a[0][1] * a[1][0];
        return c;
    }

     static int[][] revers(int[][] a) {
            int[][] c = new int[2][2];
            c[0][0] = a[1][1];
            c[1][1] = a[0][0];
            c[0][1] = a[0][1];
            c[1][0] = a[1][0];
            return c;
        }
    }

