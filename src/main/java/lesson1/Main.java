package lesson1;

import lesson1.FruitsAndBoxes.Apple;
import lesson1.FruitsAndBoxes.Box;
import lesson1.FruitsAndBoxes.Orange;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arrInt = {1, 2, 3, 4, 5};
        String[] arrString = new String[]{"A", "B", "C", "D"};

        swapElement(arrInt, 2, 3);
        swapElement(arrString, 1, 2);

        arrToArrayList(arrInt);

        workWithFruitsAndBoxes();
    }

    // Меняет 2 элемента местами
    private static <T> void swapElement(T[] arr, int oldIndex, int newIndex) {
        System.out.println("До изменения " + Arrays.toString(arr));
        T temp = arr[oldIndex];
        arr[oldIndex] = arr[newIndex];
        arr[newIndex] = temp;
        System.out.println("После изменения" + Arrays.toString(arr));
    }

    // Массив в ArrayList
    private static <T> void arrToArrayList(Object[] arr) {
        ArrayList<T> arrayList = new ArrayList(Arrays.asList(arr));
    }


    private static void workWithFruitsAndBoxes() {

        Box<Apple> boxApple1 = new Box<>();
        Box<Apple> boxApple2 = new Box<>();
        Box<Orange> boxOrange1 = new Box<>();
        Box<Orange> boxOrange2 = new Box<>();

        boxApple1.addFruit(new Apple(), 5);
        boxApple2.addFruit(new Apple(), 6);
        boxOrange1.addFruit(new Orange(), 7);
        boxOrange2.addFruit(new Orange(), 7);

        // Работает метод getWeight
        System.out.println("Имеется коробка весом " + boxApple1.getWeight());

        // Сравниваем 2 коробки
        System.out.println("Равны ли коробки по весу? " + boxOrange1.compare(boxOrange2));

        // Перекладываем
        boxApple1.shift(boxApple2);
        System.out.println("Вес коробки 1 после перекладывания = " + boxApple1.getWeight());
        System.out.println("Вес коробки 2 после перекладывания = " + boxApple2.getWeight());
    }
}
