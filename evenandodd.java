import java.util.*;
public class evenandodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        int e1 = 0;
        int e2 = 0;

        while (n != 0) {
            int rem = n % 10;  
            if (rem % 2 == 0) {
                e1 += 1;  
            } else {
                e2 += 1; 
            }
            n = n / 10;  
        }

        
        System.out.println("even " + e1);
        System.out.println("odd " + e2);
    }
}
