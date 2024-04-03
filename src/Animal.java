import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;


public abstract class Animal {

    protected String name;

    protected String color;

    protected LocalDate birthday;

    protected ArrayList<String> commands;

    private static int count = 0;

    protected int ID;

    public Animal(String name, String color, LocalDate birthday) {
        this.name = name;
        this.color = color;
        this.birthday = birthday;
        commands = new ArrayList<>();
        ID = ++count;
    }

    public int getID() {
        return ID;
    }

    public int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }


    public String getColor() {
        return color;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public ArrayList<String> getCommands() {
        return commands;
    }


    public static String getAge(LocalDate birthday){
        LocalDate now = LocalDate.now();
        long year = ChronoUnit.YEARS.between(birthday, now);
        long month = ChronoUnit.MONTHS.between(birthday, now) - year * 12;
        return year + " лет/год(а) и " + month + " месяц(а/ев)";
    }

    public static ArrayList<String> addCommands(ArrayList<String> commands, String command){
        commands.add(command);
        return commands;
    }


    @Override
    public String toString() {
        return String.format("Животное %s, цвет %s, умеет выполнять команды: %s" , name, color, commands);
    }
}
