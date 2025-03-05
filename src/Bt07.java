import java.util.Scanner;

public class Bt07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương N: ");
        int number = scanner.nextInt();

        System.out.println("Các số Happy từ 1 đến " + number + " là:");

        // Duyệt từng số từ 1 đến N để kiểm tra số Happy
        for (int i = 1; i <= number; i++) {
            int num = i;
            int slow = num, fast = num;

            do {
                // Tính tổng bình phương các chữ số của slow
                int temp = slow, sum = 0;
                while (temp > 0) {
                    int digit = temp % 10;
                    sum += digit * digit;
                    temp /= 10;
                }
                slow = sum; // Di chuyển 1 bước

                // Tính tổng bình phương các chữ số của fast (2 lần)
                for (int j = 0; j < 2; j++) {
                    int temp2 = fast, sum2 = 0;
                    while (temp2 > 0) {
                        int digit = temp2 % 10;
                        sum2 += digit * digit;
                        temp2 /= 10;
                    }
                    fast = sum2; // Di chuyển 2 bước
                }

                // Nếu fast đạt đến 1, là số Happy
                if (fast == 1) {
                    System.out.print(i + " ");
                    break;
                }
            } while (slow != fast); // Nếu gặp vòng lặp, dừng lại
        }

        scanner.close();
    }
}
