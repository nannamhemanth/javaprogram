import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        int reverse=0;
        while (n != 0) {
            int rem = n % 10;  
            reverse=reverse*10+rem;
            n = n / 10;  
        }
        if(reverse!=n)
        {
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
