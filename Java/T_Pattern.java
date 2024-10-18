import java.util.*;
class T_Pattern{
    @SuppressWarnings("resource")
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of ODD : ");
        int n=sc.nextInt();
        if(n%2==0 || n==1){
            System.out.println("Invalid Number");
        }
        else{
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i==0 || j==n/2){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}