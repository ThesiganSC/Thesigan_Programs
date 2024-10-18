import java.util.*;
class L_Pattern{
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("How many rows : ");
        int row=sc.nextInt();
        System.out.print("How many column : ");
        int column=sc.nextInt();
        for(int i=0;i<=row;i++){
            for(int j=0;j<=column;j++){
                if(j==0 || i==row){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}