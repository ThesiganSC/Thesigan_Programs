import java.util.Scanner;
class PrintingElementsByUser{
    @SuppressWarnings("resource")
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("How many elements do you want :");
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("These are the elements presented!");
        for(int j=0;j<n;j++){
            System.out.print(array[j]+" ");
        }
    }
}