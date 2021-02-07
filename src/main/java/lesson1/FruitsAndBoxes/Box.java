package lesson1.FruitsAndBoxes;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    ArrayList<T> box = new ArrayList<>();

    public Box() {

    }

    public float getWeight() {
        float weight = 0.0f;
        for (T fruit : box) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compare(Box otherBox) {
        if (getWeight() == otherBox.getWeight()) {
            return true;
        }
        return false;
    }

    public void shift(Box<T> box1) {
        box.addAll(box1.box);
        box1.box.clear();
    }

    public void addFruit(T fruit, int count) {
        for (int i = 0; i < count; i++) {
            box.add(fruit);
        }
    }
}
