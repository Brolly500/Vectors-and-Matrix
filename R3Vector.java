import java.util.Scanner;

public class R3Vector {
    private float x,y,z;

    public R3Vector() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1,y1,z1");
        this.x = sc.nextFloat();
        this.y = sc.nextFloat();
        this.z = sc.nextFloat();



    }
    public R3Vector(float x1, float y1, float z1){
        this.x = x1;
        this.y = y1;
        this.z = z1;

    }

    public static void main(String[] args) {
        R3Vector v1 = new R3Vector();
        R3Vector v2 = new R3Vector();

        print(sum(v1,v2));
        print(dif(v1,v2));
        print(mul(v1));
        print(scMul(v1,v2));
        System.out.println(vMul(v1,v2));
        System.out.println(sMul(v1,v2));



    }
    public static R3Vector sum(R3Vector v1,R3Vector v2){
        R3Vector v3 = new R3Vector(v1.x+v2.x, v1.y+v2.y, v1.z+v2.z);
        return v3;
    }
    public static void print(R3Vector v){
        System.out.print("( " + v.x +" ; " +v.y+ "; "+v.z + ")");
        System.out.println(" ");

    }
    public static R3Vector dif(R3Vector v1, R3Vector v2){
        R3Vector v3 = new R3Vector(v1.x-v2.x, v1.y-v2.y, v1.z-v2.z);
        return v3;
    }
    public static R3Vector mul(R3Vector v1){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number");
        float num = sc.nextFloat();
        R3Vector v3 = new R3Vector(v1.x*num,v1.y*num,v1.z*num);
        return v3;
    }
    public static R3Vector scMul(R3Vector v1, R3Vector v2){
        R3Vector v3 = new R3Vector(v1.x*v2.x,v1.y*v2.y,v1.z*v2.z);
        return v3;
    }
    public static float vMul(R3Vector v1, R3Vector v2){
        int i=1;
        int j=1;
        int k=1;
        float c = (v1.y*v2.z - v1.z*v2.y)*i - (v1.z*v2.x - v1.x*v2.z)*j + (v1.x*v2.y - v1.y*v2.x)*k;
        return c;
    }
    public static float sMul(R3Vector v1, R3Vector v2){
        Scanner sc = new Scanner(System.in);
        float b = sc.nextFloat();
        float d = sc.nextFloat();
        float f = sc.nextFloat();
        float s = (v1.y*v2.z - v1.z*v2.y)*b - (v1.z*v2.x - v1.x*v2.z)*d + (v1.x*v2.y - v1.y*v2.x)*f;
        return s;
    }
}

