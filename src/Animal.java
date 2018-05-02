public abstract class Animal {

    private String name;
    private int numberOfLegs;
    private boolean chasesMice;

    public Animal (String name, int numberOfLegs, boolean chasesMice) {
        this.name = name;
        this.numberOfLegs = numberOfLegs;
        this.chasesMice = chasesMice;
    }

    public String getName () {
        return name;
    }
}
