public class Dog extends Animal {
    private String name;
    private int numberOfLegs;
    private boolean chasesMice;

    public Dog (String name, int numberOfLegs, boolean chasesMice) {
        super(name, numberOfLegs, chasesMice);
    }

    public void bark() {
        System.out.println("Woof!");
    }
}
