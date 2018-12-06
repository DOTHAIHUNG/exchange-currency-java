import java.util.Scanner;

public class exchangeCurrency {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap so tien USD: ");
        usd = sc.nextDouble();
        double quydoi = usd * vnd;
        System.out.println("Gia tri VND: " + quydoi + " dong");
    }
}
