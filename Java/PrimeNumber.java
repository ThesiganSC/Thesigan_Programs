import java.util.*;
class PrimeNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n/2;
        int flag=0;
        for(int i=2;i<=m;i++){
            if(n%i==0){
                System.out.println(n+" is not a Prime Number");
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println(n+" is a Prime Number");
        }
        sc.close();
    }
}