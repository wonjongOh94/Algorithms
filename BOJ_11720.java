import java.util.Scanner;

public class BOJ_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        String[] arr = sc.next().split("");
        for(int i=0; i<N; i++) {
            sum += Integer.parseInt(arr[i]);
        }
        System.out.println(sum);
    }
}
