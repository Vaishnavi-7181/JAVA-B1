public class Accessspecifier {
    public int publicVar = 1;
    private int privateVar = 2;
    protected int protectedVar = 3;
    int defaultVar = 4; // package-private

    public void showAccess() {
        System.out.println("Public: " + publicVar);
        System.out.println("Private: " + privateVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Default: " + defaultVar);
    }

    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();
        obj.showAccess();
    }
}
