import java.util.*;
class Addition{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number 1 : ");
        int number1=sc.nextInt();
        System.out.print("Enter the number 2 : ");
        int number2=sc.nextInt();
        int total=number1+number2;
        System.out.println("Total : "+total);
        sc.close();
    }
}