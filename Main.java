package Lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Object[] object = new Object[2];
        object[0] = 1;
        object[1] = "Hello";

// Задание 1.
        System.out.println(Arrays.deepToString(object));
        change(object);
        System.out.println(Arrays.deepToString(object));


// Задание 2.
        arrayToArrayList(object);
        System.out.println(Arrays.toString(object));

// Задание 3.
        Box<Apple> boxWithApple = new Box<>(new Apple(), new Apple());
        Box<Orange> boxWithOranges = new Box<>(new Orange(), new Orange());
        Box<Orange> anotherBoxWithOranges = new Box<>();

        System.out.println("Weight of box with apples " + boxWithApple.getWeight());
        System.out.println("Weight of box with oranges " + boxWithOranges.getWeight());
        System.out.println(boxWithApple.compare(boxWithOranges));
        boxWithOranges.replaceFruitsToAnotherBox(anotherBoxWithOranges);
        System.out.println(boxWithOranges.getBox());
        System.out.println(anotherBoxWithOranges.getBox());


    }

    private static void change(Object[] object) {
        Object temp = object[0];
        object[0] = object[1];
        object[1] = temp;

    }

    private static <T> ArrayList arrayToArrayList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

}
