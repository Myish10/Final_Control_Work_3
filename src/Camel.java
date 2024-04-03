import java.time.LocalDate;

public class Camel extends PackAnimal{


    public Camel(String name, String color, LocalDate birthday) {
        super(name, color, birthday);
    }


    @Override
    public String toString() {
        return String.format("ID-%d; Верблюд %s, цвет %s" , ID, name, color);
    }
}
