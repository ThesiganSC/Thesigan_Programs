import java.util.*;
class Ari_Method{
    void addition(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
    void subtract(int a,int b){
        int c=a-b;
        System.out.println(c);
    }
    void multiply(int a,int b){
        int c=a*b;
        System.out.println(c);
    }
    void division(int a,int b){
        int c=a/b;
        System.out.println(c);
    }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Ari_Method am=new Ari_Method();
        am.addition(a, b);
        am.subtract(a, b);
        am.multiply(a, b);
        am.division(a, b);
    }
}