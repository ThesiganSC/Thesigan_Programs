import java.util.*;
class LCM_Find{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a=sc.nextInt();
        System.out.print("Enter the second number : ");
        int b=sc.nextInt();
        int answer=(a>b)?a:b;
        while(true){
            if(answer%a==0&&answer%b==0){
                break;
            }
            answer++;
        }
        System.out.println("LCM of "+a+ " and "+b+ " is : "+answer);
        sc.close();
    }
}