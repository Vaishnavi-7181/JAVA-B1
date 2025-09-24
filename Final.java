class Final {
    final void start() {
        System.out.println("Bike starts");
    }
}

class SportsBike extends Bike {
    // void start() { } // ❌ Error: Cannot override final method
}

public class FinalDemo {
    public static void main(String[] args) {
        SportsBike sb = new SportsBike();
        sb.start();
    }
}
