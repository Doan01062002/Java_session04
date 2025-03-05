import java.util.Scanner;

public class Bt05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vui lòng nhập một số nguyên");
        int number = Integer.parseInt(scanner.nextLine());

        if (number <= 1){
            System.out.println("không có số hoàn hảo nào nhỏ hơn 1");
        }else {
            System.out.println("Các số hoàn hảo nhỏ hơn " + number + " là: ");

            for (int i=2; i < number; i++){
                int sum = 0;
                for (int j=1; j<= i/2; j++){
                    if (i%j == 0){
                        sum += j;
                    }
                }
                if (sum == i){
                    System.out.println(i + ", ");
                }
            }
        }
    }
}
