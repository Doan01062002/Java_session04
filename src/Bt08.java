import java.util.Scanner;

public class Bt08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        while (true) {
            System.out.print("Nhập số nguyên dương N: ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n > 0) break;
            } else {
                scanner.next(); // Xóa giá trị nhập sai
            }
            System.out.println("Số nhập vào không hợp lệ. Vui lòng nhập lại!");
        }

        System.out.println("Các số Armstrong từ 1 đến " + n + " là:");

        for (int i = 1; i <= n; i++) {
            int num = i, count = 0, sum = 0, temp = num;

            // Đếm số chữ số (k)
            while (temp > 0) {
                count++;
                temp /= 10;
            }

            // Tính tổng lũy thừa bậc k của từng chữ số
            temp = num;
            while (temp > 0) {
                int digit = temp % 10;
                int power = 1;
                for (int j = 0; j < count; j++) {
                    power *= digit; // Tính lũy thừa bậc count
                }
                sum += power;
                temp /= 10;
            }

            // Nếu tổng bằng chính số đó, in ra kết quả
            if (sum == num) {
                System.out.print(num + " ");
            }
        }
        scanner.close();
    }
}
