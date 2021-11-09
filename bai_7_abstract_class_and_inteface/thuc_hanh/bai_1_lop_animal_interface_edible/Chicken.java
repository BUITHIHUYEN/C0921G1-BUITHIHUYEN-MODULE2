package bai_7_abstract_class_and_inteface.thuc_hanh.bai_1_lop_animal_interface_edible;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
