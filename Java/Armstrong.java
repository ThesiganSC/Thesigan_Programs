import java.util.*;
class Armstrong{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int remainder,originalNumber,result=0;
        originalNumber=number;
        while(originalNumber!=0){
            remainder=originalNumber%10;
            result+=Math.pow(remainder, 3);
            originalNumber/=10;
        }
        if(result==number){
            System.out.println(result+" is a Armstrong number");
        }
        else{
            System.out.println(result+" is not a Armstrong number");
        }
        sc.close();
    }
}