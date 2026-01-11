public class BadCode {

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divider cannot be zero");
        }
        return a / b;
    }

    public static String getPassword() {
        return System.getenv("APP_PASSWORD");
    }

    public static void main(String[] args) {
        System.out.println(divide(10, 2));
    }
}
