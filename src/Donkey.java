import java.time.LocalDate;

public class Donkey extends PackAnimal{
    public Donkey(String name, String color, LocalDate birthday) {
        super(name, color, birthday);
    }

    @Override
    public String toString() {
        return String.format("ID-%d; Осел %s, цвет %s" , ID, name, color);
    }
}
