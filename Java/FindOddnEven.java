import java.util.ArrayList;
import java.util.Scanner;
class FindOddnEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < n; j++) {
            if (arr[j] % 2 == 0) {
                even.add(arr[j]);
            } else {
                odd.add(arr[j]);
            }
        }
        Integer[] evenArray = even.toArray(new Integer[0]);
        Integer[] oddArray = odd.toArray(new Integer[0]);
        System.out.print("Even numbers: ");
        for (Integer num : evenArray) {
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.print("Odd numbers: ");
        for (Integer num : oddArray) {
            System.out.print(num+" ");
        }
        sc.close();
    }
}
