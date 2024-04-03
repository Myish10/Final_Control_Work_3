import java.time.LocalDate;

public class Cat extends Pet{
    public Cat(String name, String color, LocalDate birthday) {
        super(name, color, birthday);
    }

    @Override
    public String toString() {
        return String.format("ID-%d; Кот %s, цвет %s" ,ID, name, color);
    }
}
