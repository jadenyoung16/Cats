import java.util.Objects;

public class Cats extends PetShop {
    private final boolean indoorCat = true;
    private String breed;

    public Cats(String name, int age, String breed){
        super (name, age, breed);
        this.breed = breed;
    }

    public Cats(String[] tokens) {
        super(3);
    }

    public boolean isIndoorCat() {
        return indoorCat;
    }

    public String getBreed() {
        return breed;
    }
    public void setBreed(){
        this.breed = breed;
    }

    public void speak(){
        System.out.println("Meow");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cats)) return false;
        Cats cats = (Cats) o;
        return indoorCat == cats.indoorCat && Objects.equals(breed, cats.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(indoorCat, breed);
    }

    @Override
    public String toString() {
        return super.toString() + "Cats {" + "indoorCat =" + indoorCat + ", breed ='" + breed + '\'' + '}';
    }
}
