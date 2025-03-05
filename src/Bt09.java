import java.util.Scanner;

public class Bt09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;

        while (true) {
            System.out.print("Nhập số nguyên dương N: ");
            if (scanner.hasNextInt()) {
                N = scanner.nextInt();
                if (N > 0) break;
            } else {
                scanner.next(); // Xóa giá trị nhập sai
            }
            System.out.println("Số nhập vào không hợp lệ. Vui lòng nhập lại!");
        }

        System.out.println("Các số Palindrome từ 1 đến " + N + " là:");

        for (int i = 1; i <= N; i++) {
            int num = i, reversed = 0, temp = num;

            // Đảo ngược số
            while (temp > 0) {
                int digit = temp % 10;
                reversed = reversed * 10 + digit;
                temp /= 10;
            }

            // Nếu số gốc bằng số đảo ngược, in ra kết quả
            if (num == reversed) {
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }
}
