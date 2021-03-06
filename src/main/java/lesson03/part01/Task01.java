package lesson03.part01;

/**
 * Создать класс Cat. У кота должно быть имя (name, String), возраст (age, int),
 * вес (weight, int), сила (strength, int).
 *
 * Требования:
 * 1.	Программа не должна считывать данные с клавиатуры.
 * 2.	У класса Cat должна быть переменная name с типом String.
 * 3.	У класса Cat должна быть переменная age с типом int.
 * 4.	У класса Cat должна быть переменная weight с типом int.
 * 5.	У класса Cat должна быть переменная strength с типом int.
 * 6.	Всего в классе должно быть 4 переменных.
 */

public class Task01 {

    public static void main(String[] args) {
        Cat cat =new Cat("Барсик", 3, 6, 95);
    }

    public static class Cat{
        //напишите тут ваш код
        String name;
        int age;
        int weight;
        int strength;

        Cat(String name, int age, int weight, int strength){
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

    }
}
