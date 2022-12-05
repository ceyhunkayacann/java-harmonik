import java.util.Scanner;

public class Harmonik {
    public static void main(String[] args) {
        int number;
        double result = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        number = input.nextInt();

        for (double i = 1; i <= number; i++) {
            result += 1 / i;
        }
        System.out.println(result);
    }
}
