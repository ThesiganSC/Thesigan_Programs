import java.util.*;
class StrInt{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=sc.nextLine();
        int number;
        number=Integer.parseInt(str);
        System.out.println("This is the result : "+number);
        sc.close();
        int result=number+65;
        System.out.println(result);
    }
}