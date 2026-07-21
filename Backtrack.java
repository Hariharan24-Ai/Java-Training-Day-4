public class Backtrack {

    static void generate(String str, int n) {
        if (str.length() == n) {
            System.out.println(str);
            return;
        }

        generate(str + "0", n); // Choose 0
        generate(str + "1", n); // Choose 1
    }

    public static void main(String[] args) {
        int n = 3;
        generate("", n);
    }
}