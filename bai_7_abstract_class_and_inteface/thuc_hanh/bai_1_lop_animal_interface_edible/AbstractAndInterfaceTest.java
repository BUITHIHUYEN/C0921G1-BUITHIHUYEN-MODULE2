package bai_7_abstract_class_and_inteface.thuc_hanh.bai_1_lop_animal_interface_edible;

import bai_7_abstract_class_and_inteface.thuc_hanh.bai_1_lop_animal_interface_edible.Animal;
import bai_7_abstract_class_and_inteface.thuc_hanh.bai_1_lop_animal_interface_edible.Chicken;
import bai_7_abstract_class_and_inteface.thuc_hanh.bai_1_lop_animal_interface_edible.Tiger;
import bai_7_abstract_class_and_inteface.thuc_hanh.bai_1_lop_animal_interface_edible.Edible;
import bai_7_abstract_class_and_inteface.thuc_hanh.bai_1_lop_animal_interface_edible.Fruit;
import bai_7_abstract_class_and_inteface.thuc_hanh.bai_1_lop_animal_interface_edible.Orange;
import bai_7_abstract_class_and_inteface.thuc_hanh.bai_1_lop_animal_interface_edible.Apple;
public class AbstractAndInterfaceTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        Fruit []fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
    }
}
