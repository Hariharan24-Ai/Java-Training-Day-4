
public class factwhile {
    public static void main(String[] args) {
        int n = 5; // You can change this value to compute the factorial of a different number
        int fact = 1;
        int i = 1;
        while (i <= n) {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial = " + fact);
    }
}