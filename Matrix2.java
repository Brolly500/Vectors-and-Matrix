
import java.util.Scanner;

public class Matrix2 {
    public double a00, a01, a10, a11;
    static Scanner sc = new Scanner(System.in);

    public Matrix2() {
        System.out.println("Enter a00, a01, a10, a11");
        this.a00 = sc.nextDouble();
        this.a01 = sc.nextDouble();
        this.a10 = sc.nextDouble();
        this.a11 = sc.nextDouble();
    }
    public Matrix2(double a00, double a01, double a10, double a11){
        this.a00=a00;
        this.a01=a01;
        this.a10=a10;
        this.a11=a11;


        }

    public static void main(String[] args) {
        Matrix2 a = new Matrix2();
        Matrix2 b = new Matrix2();
        System.out.println("Enter number n");
        int n = sc.nextInt();
        print(sum(a,b));
        System.out.println(" ");
        print(minus(a,b));
        System.out.println(" ");
        print(mul(a,n));
        System.out.println(" ");
        print(matrixmult(a,b));
        System.out.println(" ");
        System.out.println(opred(a));
        System.out.println(" ");
        print(revers(a));


    }

    static void print(Matrix2 m) {
        System.out.println(m.a00 +"  " +m.a01);
        System.out.println(m.a10 +"  " +m.a11);
    }


     static Matrix2 sum(Matrix2 a, Matrix2 b) {
        Matrix2 c = new Matrix2(0,0,0,0);
        c.a00 = a.a00 + b.a00;
        c.a01 = a.a01 + b.a01;
        c.a10 = a.a10 + b.a10;
        c.a11 = a.a11 + b.a11;
        return c;
    }

     static Matrix2 minus(Matrix2 a, Matrix2 b) {
         Matrix2 c = new Matrix2(0,0,0,0);
         c.a00 = a.a00 - b.a00;
         c.a01 = a.a01 - b.a01;
         c.a10 = a.a10 - b.a10;
         c.a11 = a.a11 - b.a11;
         return c;
    }

     static Matrix2 mul(Matrix2 a, int n) {
        Matrix2 c = new Matrix2(0,0,0,0);
        c.a00 = a.a00*n;
        c.a01 = a.a01*n;
        c.a10 = a.a10*n;
        c.a11 = a.a11*n;
        return c;
    }

     static Matrix2 matrixmult(Matrix2 a, Matrix2 b) {
        Matrix2 c = new Matrix2(0,0,0,0);
        c.a00 = a.a00*b.a00 + a.a01*b.a11;
        c.a01 = a.a00*b.a01 + a.a01*b.a11;
        c.a10 = a.a10*b.a00 + a.a11*b.a10;
        c.a11 = a.a10*b.a01 + a.a11*b.a11;
        return c;
    }

     static double opred(Matrix2 a) {
         double c = a.a00 * a.a11 - a.a01 * a.a10;
        return c;
    }

     static Matrix2 revers(Matrix2 a) {
         Matrix2 c = new Matrix2(0,0,0,0);
         double d = opred(a);
            c.a00 = a.a11*d;
            c.a11 = a.a00*d;
            c.a01 = a.a01*d;
            c.a10 = a.a10*d;
            return c;
        }
    }

