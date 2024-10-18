import java.util.*;
public class A_Pattern{
    @SuppressWarnings("resource")
    static public void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("How many rows : ");
        int row=sc.nextInt();
        System.out.print("How many columns : ");
        int column=sc.nextInt();
        if(column%2==0){
            System.out.println("Idhu EVEN number daa!");
        }
        else{
        for(int i=1;i<=row;i++){
            for(int j=1;j<=column;j++){
                if(i==1&&j==3 || i==2&&j==2 || i==2&&j==4 || i==3&&j==1 || i==3&&j==2 || i==3&& j==3
                   || i==3&&j==4 || i==3&&j==5 || i==4&j==1 || i==4&&j==5){
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
        return "A_Pattern []";
    }
}