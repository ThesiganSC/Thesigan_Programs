import java.util.*;
class PyramidPattern{
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        for(int i=0;i<size;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<size-i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}