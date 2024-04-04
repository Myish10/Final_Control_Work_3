import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {

    private static Random random = new Random();
    private static Scanner console = new Scanner(System.in);


    public static void main(String[] args) {

        ArrayList<Animal> animals = getAnimals(10);
        userInterface(animals);

    }


    public static ArrayList<Animal> getAnimals(int count) {
        ArrayList<Animal> animals = new ArrayList<>();
        int rand;
        for (int i = 0; i < count; i++) {
            rand = random.nextInt(6);
            if (rand == 0) {
                animals.add(AnimalsFactory.generateCat());
            } else if (rand == 1) {
                animals.add(AnimalsFactory.generateDog());
            } else if (rand == 2) {
                animals.add(AnimalsFactory.generateHamster());
            } else if (rand == 3) {
                animals.add(AnimalsFactory.generateHorse());
            } else if (rand == 4) {
                animals.add(AnimalsFactory.generateCamel());
            } else {
                animals.add(AnimalsFactory.generateDonkey());
            }
        }
        return animals;
    }

    public static void userInterface(ArrayList<Animal> animals) {
        System.out.println("Введите цифры от 1 до 5:\n " +
                "1 - вывести список животных\n " +
                "2 - вывести список команд, которые умеет выполнять животное\n " +
                "3 - создать новое животное\n " +
                "4 - обучить животное новой команде\n " +
                "5 - выход");
        try {
            int num = console.nextInt();
            while (num < 1 || num > 5) {
                System.out.println(num + "-Такой команды нет");
                System.out.println("Введите цифры от 1 до 5:\n " +
                        "1 - вывести список животных\n " +
                        "2 - вывести список команд, которые умеет выполнять животное\n " +
                        "3 - добавить новое животное\n " +
                        "4 - обучить животное новой команде\n " +
                        "5 - выход");
                num = console.nextInt();
            }
            if (num == 1) {
                showAnimals(animals);
                userInterface(animals);
            } else if (num == 2) {
                showCommands(animals);
            } else if (num == 3) {
                addAnimal(animals);
                userInterface(animals);
            } else if (num == 4) {
                addNewCommands(animals);
            } else {
                System.out.println("До новых встреч!)))");
            }
        } catch (Exception e) {
            System.out.println("Неверный формат данных. Перезапустите программу!");
        }
    }


    public static void showAnimals(ArrayList<Animal> animals) {
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i));
            System.out.println(animals.get(i).getBirthday());
            System.out.println("Возраст: " + Animal.getAge(animals.get(i).birthday));
            System.out.println();
        }
    }

    public static void showCommands(ArrayList<Animal> animals) {
        showAnimals(animals);
        System.out.println("Ведите ID животного, команды которого хотите посмотреть:");
        try {
            int numID = console.nextInt();
            int id = 0;
            for (int i = 0; i < animals.size(); i++) {
                if (animals.get(i).getID() == numID) {
                    id = i;
                    System.out.println(animals.get(i));
                    System.out.println("Умеет выполнять команды: " + animals.get(i).commands);
                    break;
                }
            }
            System.out.println();
            userInterface(animals);
            if (id == 0) {
                System.out.println("Животного с таким номером нет");
                System.out.println();
                userInterface(animals);
            }

        } catch (Exception e) {
            System.out.println("Неверный формат данных. Перезапустите программу!");
        }
    }

    public static ArrayList<Animal> addAnimal(ArrayList<Animal> animals) {
        System.out.println("Какое животное хотите добавить?\n" +
                " 1 - Кот\n" +
                " 2 - Собака\n" +
                " 3 - Хомяк\n" +
                " 4 - Лошадь\n" +
                " 5 - Верблюд\n" +
                " 6 - Осел");
        try {
            int number = console.nextInt();
            while (number < 1 || number > 6) {
                System.out.println();
                System.out.println(number + "-Такой команды нет");
                System.out.println("Какое животное хотите добавить?\n" +
                        " 1 - Кот\n" +
                        " 2 - Собака\n" +
                        " 3 - Хомяк\n" +
                        " 4 - Лошадь\n" +
                        " 5 - Верблюд\n" +
                        " 6 - Осел");
                number = console.nextInt();
            }
            if (number >= 1 && number <= 6) {
                System.out.println("Ведите имя животного");
                String name = console.next();
                System.out.println("Ведите цвет животного");
                String color = console.next();
                System.out.println("Ведите год рождения животного (4-х значное положительное число)");
                int year = console.nextInt();
                while (year < 1980 || year > 2024)
                {
                    System.out.println("Введите корректный год рождения (4-х значное положительное число)");
                    year = console.nextInt();
                }
                System.out.println("Ведите месяц рождения животного (число от 1 до 12)");
                int month = console.nextInt();
                while (month < 1 || month > 12){
                    System.out.println("Введите корректный месяц рождения (число от 1 до 12)");
                    month = console.nextInt();
                }
                System.out.println("Ведите день рождения животного (число от 1 до 31)");
                int day = console.nextInt();
                while (day < 0 || day > 31){
                    System.out.println("Введите корректную дату (число от 1 до 31)");
                    day = console.nextInt();
                }
                if (number == 1) {
                    Cat cat = new Cat(name, color, LocalDate.of(year, month, day));
                    animals.add(cat);
                } else if (number == 2) {
                    Dog dog = new Dog(name, color, LocalDate.of(year, month, day));
                    animals.add(dog);
                } else if (number == 3) {
                    Hamster hamster = new Hamster(name, color, LocalDate.of(year, month, day));
                    animals.add(hamster);
                } else if (number == 4) {
                    Horse horse = new Horse(name, color, LocalDate.of(year, month, day));
                    animals.add(horse);
                } else if (number == 5) {
                    Camel camel = new Camel(name, color, LocalDate.of(year, month, day));
                    animals.add(camel);
                } else {
                    Donkey donkey = new Donkey(name, color, LocalDate.of(year, month, day));
                    animals.add(donkey);
                }
            }
            int i = animals.size() - 1;
            System.out.println("Вы добавили:\n" + animals.get(i));
            System.out.println();
        } catch (Exception e) {
            System.out.println("Неверный формат данных. Перезапустите программу!");
        }
        return animals;
    }

    public static ArrayList<Animal> addNewCommands(ArrayList<Animal> animals) {
        showAnimals(animals);
        try {
            System.out.println("Какое животное будем обучать? Введите ID:");
            int numID = console.nextInt();
            System.out.println("Введите команнду, которой хотите обучить животное (одно слово):");
            String command = console.next();
            int id = 0;
            for (int i = 0; i < animals.size(); i++) {
                if (animals.get(i).getID() == numID) {
                    id = i;
                    Animal.addCommands(animals.get(i).getCommands(), command);
                    System.out.println("Комманда " + command + " добавлена успешно");
                    break;
                }
            }
            System.out.println();
            userInterface(animals);
            if (id == 0) {
                System.out.println("Животного с таким номером нет");
                System.out.println();
                userInterface(animals);
            }
        } catch (Exception e) {
            System.out.println("Неверный формат данных. Перезапустите программу!");
        }
        return animals;
    }

}


