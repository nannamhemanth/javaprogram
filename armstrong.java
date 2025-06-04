import java.util.*;

public class armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        int count = 0;
        int m = n;
        int org = n;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        while (m != 0) {
            int rem = m % 10;
            sum += Math.pow(rem, count);
            m = m / 10;
        }
        if (org == (int)sum) {
            System.out.println("armstrong");
        } else {
            System.out.println("not armstrong");
        }
    }
}