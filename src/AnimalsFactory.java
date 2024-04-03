import java.time.LocalDate;
import java.util.Random;

public class AnimalsFactory {

    private static Random random = new Random();

    public static Cat generateCat() {
        String[] catNames = new String[]{"Пушок", "Рыжик", "Персик", "Васька", "Каспер", "Мася"};
        String[] catColor = new String[]{"серый", "белый", "черный", "трехцветный", "коричневый", "рыжий"};
        String[] catCommands = new String[]{"сидеть", "атаковать", "царапать", "мяукать", "прыгать"};
        Cat cat = new Cat(
                catNames[random.nextInt(catNames.length)],
                catColor[random.nextInt(catColor.length)],
                LocalDate.of(random.nextInt(2015, 2024), random.nextInt(1, 13),
                        random.nextInt(1, 29))

        );
        int count = random.nextInt(3);
        String newCommand;
        if (count == 0) {
            Animal.addCommands(cat.getCommands(), catCommands[random.nextInt(catCommands.length)]);
        } else if (count == 1) {
            for (int i = 0; i < 2; i++) {
                newCommand = catCommands[random.nextInt(catCommands.length)];
                if (!cat.getCommands().contains(newCommand)) {
                    Animal.addCommands(cat.getCommands(), newCommand);
                }
            }
        } else {
            for (int i = 0; i < 3; i++) {
                newCommand = catCommands[random.nextInt(catCommands.length)];
                if (!cat.getCommands().contains(newCommand)) {
                    Animal.addCommands(cat.getCommands(), newCommand);
                }
            }
        }
        return cat;
    }

    public static Dog generateDog() {
        String[] dogNames = new String[]{"Шарик", "Тузик", "Палкан", "Рагна", "Югра", "Рекс"};
        String[] dogColor = new String[]{"серый", "белый", "черный", "трехцветный", "коричневый", "рыжий"};
        String[] dogCommands = new String[]{"сидеть", "приносить", "стоять", "голос", "крутиться", "лапу"};
        Dog dog = new Dog(
                dogNames[random.nextInt(dogNames.length)],
                dogColor[random.nextInt(dogColor.length)],
                LocalDate.of(random.nextInt(2015, 2024), random.nextInt(1, 13),
                        random.nextInt(1, 29))

        );
        int count = random.nextInt(3);
        String newCommand;
        if (count == 0) {
            Animal.addCommands(dog.getCommands(), dogCommands[random.nextInt(dogCommands.length)]);
        } else if (count == 1) {
            for (int i = 0; i < 2; i++) {
                newCommand = dogCommands[random.nextInt(dogCommands.length)];
                if (!dog.getCommands().contains(newCommand)) {
                    Animal.addCommands(dog.getCommands(), newCommand);
                }
            }
        } else {
            for (int i = 0; i < 3; i++) {
                newCommand = dogCommands[random.nextInt(dogCommands.length)];
                if (!dog.getCommands().contains(newCommand)) {
                    Animal.addCommands(dog.getCommands(), newCommand);
                }
            }
        }
        return dog;

    }

    public static Hamster generateHamster() {
        String[] hamsterNames = new String[]{"Хома", "Толстяк", "Шустрик", "Лилу", "Мэгги", "Рапунцель"};
        String[] hamsterColor = new String[]{"серый", "белый", "черный", "трехцветный", "коричневый", "рыжий"};
        String[] hamsterCommands = new String[]{"крутиться", "прятаться", "прыгать", "бегать"};
        Hamster hamster = new Hamster(
                hamsterNames[random.nextInt(hamsterNames.length)],
                hamsterColor[random.nextInt(hamsterColor.length)],
                LocalDate.of(random.nextInt(2020, 2024), random.nextInt(1, 13),
                        random.nextInt(1, 29))

        );
        int count = random.nextInt(3);
        String newCommand;
        if (count == 0) {
            Animal.addCommands(hamster.getCommands(), hamsterCommands[random.nextInt(hamsterCommands.length)]);
        } else if (count == 1) {
            for (int i = 0; i < 2; i++) {
                newCommand = hamsterCommands[random.nextInt(hamsterCommands.length)];
                if (!hamster.getCommands().contains(newCommand)) {
                    Animal.addCommands(hamster.getCommands(), newCommand);
                }
            }
        } else {
            for (int i = 0; i < 3; i++) {
                newCommand = hamsterCommands[random.nextInt(hamsterCommands.length)];
                if (!hamster.getCommands().contains(newCommand)) {
                    Animal.addCommands(hamster.getCommands(), newCommand);
                }
            }
        }
        return hamster;
    }

    public static Horse generateHorse() {
        String[] horseNames = new String[]{"Апполон", "Буран", "Енисей", "Жак", "Егерь", "Афина"};
        String[] horseColor = new String[]{"гнедая", "рыжая", "вороная", "серая", "белая"};
        String[] horseCommands = new String[]{"рысь", "легкий галоп", "галоп", "прыжок"};
        Horse horse = new Horse(
                horseNames[random.nextInt(horseNames.length)],
                horseColor[random.nextInt(horseColor.length)],
                LocalDate.of(random.nextInt(2010, 2024), random.nextInt(1, 13),
                        random.nextInt(1, 29))

        );
        int count = random.nextInt(3);
        String newCommand;
        if (count == 0) {
            Animal.addCommands(horse.getCommands(), horseCommands[random.nextInt(horseCommands.length)]);
        } else if (count == 1) {
            for (int i = 0; i < 2; i++) {
                newCommand = horseCommands[random.nextInt(horseCommands.length)];
                if (!horse.getCommands().contains(newCommand)) {
                    Animal.addCommands(horse.getCommands(), newCommand);
                }
            }
        } else {
            for (int i = 0; i < 3; i++) {
                newCommand = horseCommands[random.nextInt(horseCommands.length)];
                if (!horse.getCommands().contains(newCommand)) {
                    Animal.addCommands(horse.getCommands(), newCommand);
                }
            }
        }
        return horse;
    }

    public static Camel generateCamel() {
        String[] camelNames = new String[]{"Лила", "Жетем", "Бо", "Хлоя", "Рокфор", "Финбар"};
        String[] camelColor = new String[]{"белый", "бежевый", "рыжевато-коричневый"};
        String[] camelCommands = new String[]{"сидеть", "нести", "идти", "кричать", "бежать"};
        Camel camel = new Camel(
                camelNames[random.nextInt(camelNames.length)],
                camelColor[random.nextInt(camelColor.length)],
                LocalDate.of(random.nextInt(2000, 2024), random.nextInt(1, 13),
                        random.nextInt(1, 29))

        );
        int count = random.nextInt(3);
        String newCommand;
        if (count == 0) {
            Animal.addCommands(camel.getCommands(), camelCommands[random.nextInt(camelCommands.length)]);
        } else if (count == 1) {
            for (int i = 0; i < 2; i++) {
                newCommand = camelCommands[random.nextInt(camelCommands.length)];
                if (!camel.getCommands().contains(newCommand)) {
                    Animal.addCommands(camel.getCommands(), newCommand);
                }
            }
        } else {
            for (int i = 0; i < 3; i++) {
                newCommand = camelCommands[random.nextInt(camelCommands.length)];
                if (!camel.getCommands().contains(newCommand)) {
                    Animal.addCommands(camel.getCommands(), newCommand);
                }
            }
        }
        return camel;
    }

    public static Donkey generateDonkey() {
        String[] donkeyNames = new String[]{"Рих", "Гектор", "Чупа", "Вудди", "Марфик", "Эва"};
        String[] donkeyColor = new String[]{"темно-каштановый", "серый", "светло-серый", "темно-бурый"};
        String[] donkeyCommands = new String[]{"идти", "нести", "стоять", "кричать", "пинать"};
        Donkey donkey = new Donkey(
                donkeyNames[random.nextInt(donkeyNames.length)],
                donkeyColor[random.nextInt(donkeyColor.length)],
                LocalDate.of(random.nextInt(2005, 2024), random.nextInt(1, 13),
                        random.nextInt(1, 29))

        );
        int count = random.nextInt(3);
        String newCommand;
        if (count == 0) {
            Animal.addCommands(donkey.getCommands(), donkeyCommands[random.nextInt(donkeyCommands.length)]);
        } else if (count == 1) {
            for (int i = 0; i < 2; i++) {
                newCommand = donkeyCommands[random.nextInt(donkeyCommands.length)];
                if (!donkey.getCommands().contains(newCommand)) {
                    Animal.addCommands(donkey.getCommands(), newCommand);
                }
            }
        } else {
            for (int i = 0; i < 3; i++) {
                newCommand = donkeyCommands[random.nextInt(donkeyCommands.length)];
                if (!donkey.getCommands().contains(newCommand)) {
                    Animal.addCommands(donkey.getCommands(), newCommand);
                }
            }
        }
        return donkey;
    }

}
