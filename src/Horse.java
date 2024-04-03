import java.time.LocalDate;

public class Horse extends PackAnimal{
    public Horse(String name, String color, LocalDate birthday) {
        super(name, color, birthday);
    }

    @Override
    public String toString() {
        return String.format("ID-%d, Лошадь %s, масть %s" , ID,  name, color);
    }
}
