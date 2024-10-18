import java.util.*;
public class BoxPattern{
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("How many rows : ");
        int row=sc.nextInt();
        System.out.print("How many columns : ");
        int column=sc.nextInt();
        if(column%2==0){
            System.out.println("Idhu EVEN number daa!");
        }
        else{
            int z=(column/2)+1;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=column;j++){
                if(i==1 || i==row || j==1 || j==column || j==z){
					System.out.print("*"); 
				}
				else{
					System.out.print(" "); 
				}
			}
			System.out.println(); 
        }}
    }

    @Override
    public String toString() {
        return "BoxPattern []";
    }
}