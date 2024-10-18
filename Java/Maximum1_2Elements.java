import java.util.*;
class Maximum1_2Elements{
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("How many elements do you want :");
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int maximum=Integer.MIN_VALUE;
        int secondmaximum=Integer.MIN_VALUE;
        for(int j=1;j<n;j++){
            if(array[j]>maximum){
                secondmaximum=maximum;
                maximum=array[j];
            }
            else if (array[j] > secondmaximum && array[j] != maximum) {
                secondmaximum = array[j];
            }
        }
        System.out.println("First Maximum : "+maximum);
        System.out.println("Second Maximum : "+secondmaximum);
    }
}