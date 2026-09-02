public class Divisible {
    public static void main(String[] args) {
        int n = 221;

        if (n % 13 == 0 && n % 17 == 0)
            System.out.println("Divisible by both 13 and 17");
        else
            System.out.println("Not divisible by both");
    }
}