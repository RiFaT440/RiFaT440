import java.util.*;

public class namota {
    public static void main(String[] args) {
        System.out.println("which Multiplication table you want to see:");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int p=1;
        for (int a = 1; a <= 10; a++) {
           p=b*a;
           System.out.println(b+"*"+a+"="+p);
        }
    }

}
