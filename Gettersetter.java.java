public class Gettersetter{
    private String name; // private variable

    // Setter
    public void setName(String newName) {
        name = newName;
    }

    // Getter
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Amit");
        System.out.println("Name: " + p.getName());
    }
}
