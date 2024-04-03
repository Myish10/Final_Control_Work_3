import java.time.LocalDate;

public class Hamster extends Pet{
    public Hamster(String name, String color, LocalDate birthday) {
        super(name, color, birthday);
    }


    @Override
    public String toString() {
        return String.format("ID-%d; Хомяк %s, цвет %s" , ID, name, color);
    }
}


