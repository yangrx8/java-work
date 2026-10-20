import java.util.Scanner;

public class weiguang {
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个年份");
        while (!scanner.hasNextInt()) {
            System.out.println("请重新输入");
            scanner.next();
        }
        int year = scanner.nextInt();
        System.out.println(isLeapYear(year));
        scanner.close();
    }
}
