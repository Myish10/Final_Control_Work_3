CREATE DATABASE IF NOT EXISTS Human_friends;
USE Human_friends;

DROP TABLE IF EXISTS Animals;
CREATE TABLE Animals(
	id INT PRIMARY KEY AUTO_INCREMENT,
    animal_groups VARCHAR(45)
);

TRUNCATE Animals;
INSERT INTO Animals (animal_groups)
VALUES
	("Pets"),
    ("Pack_animals");

DROP TABLE IF EXISTS Pets;
CREATE TABLE Pets(
	id INT PRIMARY KEY AUTO_INCREMENT,
    type VARCHAR(45),
	animal_groups_id INT,
    FOREIGN KEY (animal_groups_id) REFERENCES Animals(id)
    ON UPDATE CASCADE ON DELETE CASCADE
);

TRUNCATE Pets;
INSERT INTO Pets (type, animal_groups_id)
VALUES
	("Cat", 1),
    ("Dog", 1),
    ("Humster", 1);

DROP TABLE IF EXISTS Pack_animals;
CREATE TABLE Pack_animals(
	id INT PRIMARY KEY AUTO_INCREMENT,
    type VARCHAR(45),
	animal_groups_id INT,
    FOREIGN KEY (animal_groups_id) REFERENCES Animals(id)
    ON UPDATE CASCADE ON DELETE CASCADE
);

TRUNCATE Pack_animals;
INSERT INTO Pack_animals (type, animal_groups_id)
VALUES
	("Horse", 2),
    ("Camel", 2),
    ("Donkey", 2);

DROP TABLE IF EXISTS Cat;
CREATE TABLE Cat(
	id INT PRIMARY KEY AUTO_INCREMENT,
    name_ VARCHAR(45),
    color VARCHAR(45),
    birthday DATE,
    commands VARCHAR(45),
    type_id INT,
    FOREIGN KEY (type_id) REFERENCES Pets (id)
    ON UPDATE CASCADE ON DELETE CASCADE    
);

TRUNCATE Cat;
INSERT INTO Cat (name_, color, birthday, commands, type_id)
VALUES
	("Персик", "рыжий", "2017-04-13", "сидеть, мяукать", 1),
    ("Каспер", "черный", "2017-03-24", "сидеть, царапать, прыгать", 1),
    ("Мася", "белый", "2019-05-01", "сидеть, царапать", 1);

DROP TABLE IF EXISTS Dog;
CREATE TABLE Dog(
	id INT PRIMARY KEY AUTO_INCREMENT,
    name_ VARCHAR(45),
    color VARCHAR(45),
    birthday DATE,
    commands VARCHAR(45),
    type_id INT,
    FOREIGN KEY (type_id) REFERENCES Pets (id)
    ON UPDATE CASCADE ON DELETE CASCADE    
);

TRUNCATE Dog;
INSERT INTO Dog (name_, color, birthday, commands, type_id)
VALUES
	("Рекс", "коричневый", "2022-08-26", "голос, лапу", 2),
    ("Югра", "серый", "2017-04-20", "голос", 2),
    ("Палкан", "серый", "2023-01-13", "голос, приносить", 2);

DROP TABLE IF EXISTS Humster;
CREATE TABLE Humster(
	id INT PRIMARY KEY AUTO_INCREMENT,
    name_ VARCHAR(45),
    color VARCHAR(45),
    birthday DATE,
    commands VARCHAR(45),
    type_id INT,
    FOREIGN KEY (type_id) REFERENCES Pets (id)
    ON UPDATE CASCADE ON DELETE CASCADE    
);

TRUNCATE Humster;
INSERT INTO Humster (name_, color, birthday, commands, type_id)
VALUES
	("Хома", "белый", "2020-11-10", "прыгать", 3),
    ("Шустрик", "черный", "2021-09-09", "бегать", 3),
    ("Толстяк", "коричневый", "2023-02-11", "прятаться, бегать", 3);

DROP TABLE IF EXISTS Horse;
CREATE TABLE Horse(
	id INT PRIMARY KEY AUTO_INCREMENT,
    name_ VARCHAR(45),
    color VARCHAR(45),
    birthday DATE,
    commands VARCHAR(45),
    type_id INT,
    FOREIGN KEY (type_id) REFERENCES Pack_animals (id)
    ON UPDATE CASCADE ON DELETE CASCADE    
);

TRUNCATE Horse;
INSERT INTO Horse (name_, color, birthday, commands, type_id)
VALUES
	("Буран", "гнедая", "2011-06-24", "легкий галоп, галоп, прыжок", 1),
    ("Апполон", "гнедая", "2017-05-28", "галоп", 1),
    ("Эва", "белая", "2011-08-05", "галоп", 1);

DROP TABLE IF EXISTS Camel;
CREATE TABLE Camel(
	id INT PRIMARY KEY AUTO_INCREMENT,
    name_ VARCHAR(45),
    color VARCHAR(45),
    birthday DATE,
    commands VARCHAR(45),
    type_id INT,
    FOREIGN KEY (type_id) REFERENCES Pack_animals (id)
    ON UPDATE CASCADE ON DELETE CASCADE    
);

TRUNCATE Camel;
INSERT INTO Camel (name_, color, birthday, commands, type_id)
VALUES
	("Бо", "бежевый", "2001-05-28", "нести", 2),
    ("Рокфор", "белый", "2020-03-12", "бежать, кричать", 2),
    ("Финбар", "рыжевато-коричневый", "2013-05-16", "кричать, нести", 2);

DROP TABLE IF EXISTS Donkey;
CREATE TABLE Donkey(
	id INT PRIMARY KEY AUTO_INCREMENT,
    name_ VARCHAR(45),
    color VARCHAR(45),
    birthday DATE,
    commands VARCHAR(45),
    type_id INT,
    FOREIGN KEY (type_id) REFERENCES Pack_animals (id)
    ON UPDATE CASCADE ON DELETE CASCADE    
);

TRUNCATE Donkey;
INSERT INTO Donkey (name_, color, birthday, commands, type_id)
VALUES
	("Чупа", "серый", "2016-02-28", "кричать, идти", 3),
    ("Вудди", "светло-серый", "2009-08-21", "кричать, нести", 3),
    ("Гектор", "серый", "2015-06-11", "идти, стоять, нести", 3);

DELETE FROM Camel;

SELECT * FROM Horse
UNION ALL
SELECT * FROM Donkey;

DROP TABLE IF EXISTS Young_Animals;
CREATE TABLE Young_Animals AS
SELECT *, 
TIMESTAMPDIFF(MONTH, birthday, CURDATE()) AS age_month
FROM (
SELECT * FROM Cat
UNION ALL
SELECT * FROM Dog
UNION ALL
SELECT * FROM Humster
UNION ALL
SELECT * FROM Horse
UNION All
SELECT * FROM Camel
UNION ALL
SELECT * FROM Donkey
) AS animals
WHERE TIMESTAMPDIFF(YEAR, birthday, CURDATE()) BETWEEN 1 AND 3;
SELECT * FROM Young_Animals;

DROP TABLE IF EXISTS ALL_AMIMALS;
CREATE TABLE ALL_AMIMALS AS
SELECT 
	Cat.id,
    Cat.name_,
    Cat.color,
    Cat.birthday,
    Cat.commands,
    Pets.type,
    Animals.animal_groups 
FROM Cat
JOIN Pets ON Cat.type_id = Pets.id
Join Animals ON Pets.animal_groups_id = Animals.id

UNION ALL

SELECT 
	Dog.id,
    Dog.name_,
    Dog.color,
    Dog.birthday,
    Dog.commands,
    Pets.type,
    Animals.animal_groups 
FROM Dog
JOIN Pets ON Dog.type_id = Pets.id
Join Animals ON Pets.animal_groups_id = Animals.id

UNION ALL

SELECT 
	Humster.id,
    Humster.name_,
    Humster.color,
    Humster.birthday,
    Humster.commands,
    Pets.type,
    Animals.animal_groups 
FROM Humster
JOIN Pets ON Humster.type_id = Pets.id
Join Animals ON Pets.animal_groups_id = Animals.id
 
UNION ALL

SELECT 
	Horse.id,
    Horse.name_,
    Horse.color,
    Horse.birthday,
    Horse.commands,
    Pack_animals.type,
    Animals.animal_groups 
FROM Horse
JOIN Pack_animals ON Horse.type_id = Pack_animals.id
Join Animals ON Pack_animals.animal_groups_id = Animals.id

UNION All

SELECT 
	Camel.id,
    Camel.name_,
    Camel.color,
    Camel.birthday,
    Camel.commands,
    Pack_animals.type,
    Animals.animal_groups 
FROM Camel
JOIN Pack_animals ON Camel.type_id = Pack_animals.id
Join Animals ON Pack_animals.animal_groups_id = Animals.id

UNION ALL

SELECT 
	Donkey.id,
    Donkey.name_,
    Donkey.color,
    Donkey.birthday,
    Donkey.commands,
    Pack_animals.type,
    Animals.animal_groups 
FROM Donkey
JOIN Pack_animals ON Donkey.type_id = Pack_animals.id
Join Animals ON Pack_animals.animal_groups_id = Animals.id;

SELECT * FROM ALL_AMIMALS;



