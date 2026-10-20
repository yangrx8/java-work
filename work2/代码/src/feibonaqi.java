import java.util.Scanner;
public class feibonaqi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n) {

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        int a = 0;
        int b = 1;


        for (int i = 1; i < n; i++) {
            int next = a + b;
            a = b;
            b = next;
        }
        return b;
    }
}
