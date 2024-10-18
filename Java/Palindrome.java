import java.util.*;
class Palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int sum=0;
        int temp;
        int remainder;
        temp=number;
        while(number>0){
            remainder=number%10;
            sum=(sum*10)+remainder;
            number=number/10;
        }
        if(temp==number){
            System.out.println(temp+" is a Palindrome number.");
        }
        else{
            System.out.println(temp+" is not a Palindrome number");
        }
        sc.close();
    }
}