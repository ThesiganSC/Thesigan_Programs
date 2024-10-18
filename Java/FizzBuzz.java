import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class FizzBuzz{
    static List<String> fizzBuzz(int n){
      List<String> result = new ArrayList<>();
        for (int i=1;i<=n;++i){
            if (i%3==0 && i%5==0){
                result.add("FizzBuzz");
            }
            else if (i%3==0){
                result.add("Fizz");
            }
            else if (i%5==0){
                result.add("Buzz");
            }
            else{
                result.add(Integer.toString(i));
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<String> result = fizzBuzz(n);
        for (String s:result) {
            System.out.print(s + " ");
        }
        sc.close();
    }
}