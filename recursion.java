public class recursion {
    public static void main(String[] args) {
        int n = 5; // You can change this value to compute the factorial of a different number
        int fact = factorial(n);
        System.out.println("Factorial = " + fact);
    }
    
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
