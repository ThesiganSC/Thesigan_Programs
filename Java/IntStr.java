import java.util.*;
class IntStr{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the integer : ");
        int number=sc.nextInt();
        String str;
        str=Integer.toString(number);
        System.out.println("This is int to str : "+str);
        sc.close();
        String result=str+" World";
        System.out.println(result);
    } 
}