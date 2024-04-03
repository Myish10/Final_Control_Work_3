import java.time.LocalDate;

public class Dog extends Pet{
    public Dog(String name, String color, LocalDate birthday) {
        super(name, color, birthday);
    }

    @Override
    public String toString() {
        return String.format("ID-%d; Собака %s, цвет %s" , ID, name, color);
    }
}
