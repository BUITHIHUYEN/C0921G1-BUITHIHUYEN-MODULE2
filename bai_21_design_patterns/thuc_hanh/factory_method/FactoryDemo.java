package bai_21_design_patterns.thuc_hanh.factory_method;

public class FactoryDemo {
    public static void main(String[] args) {
        FactoryAnimal factoryAnimal = new FactoryAnimal();
        Animal animal1 = factoryAnimal.getAnimal("feline");
        System.out.println("animal1 sound :" + animal1.makesound());
        Animal animal2 = factoryAnimal.getAnimal("canine");
        System.out.println("animal2 sound : " + animal2.makesound());
    }
}
