import java.util.*;
class Factorial{
    @SuppressWarnings("resource")
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int fact=1;
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            fact=fact*i;
            System.out.println(fact);
        }
    }
}