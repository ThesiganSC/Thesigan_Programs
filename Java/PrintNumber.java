import java.util.*;
class PrintNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        for(int i=1;i<=number;i++){
            System.out.println(i);
        }
        sc.close();
    }
}