import java.util.Scanner;

public class Bt07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương N: ");
        int number = scanner.nextInt();

        System.out.println("Các số Happy từ 1 đến " + number + " là:");
        for (int i = 1; i <= number; i++) {
            int num = i, temp, sum;

            while (num != 1 && num != 4) { // 4 là dấu hiệu của vòng lặp vô hạn
                temp = num;
                sum = 0;
                while (temp > 0) {
                    int digit = temp % 10;
                    sum += digit * digit;
                    temp /= 10;
                }
                num = sum;
            }
            if (num == 1) System.out.print(i + " ");
        }
        scanner.close();
    }
}
