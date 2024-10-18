import java.util.*;
class GreatestTwoTernary{
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a=sc.nextInt();
        System.out.print("Enter the second number : ");
        int b=sc.nextInt();
        int result;
        if(a==b){
            System.out.println("Same Number Vroooooo!");
        }
        else{   
            result=(a>b)?a:b;
            System.out.println(result);
        }
        sc.close();
    }
}