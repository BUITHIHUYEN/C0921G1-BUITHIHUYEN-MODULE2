package bai_23_behavioral_design_pattern.thuc_hanh.triển_khai_emplate_method;

public class TacoMeal extends Meal{
    @Override
    public void prepareIngredients() {
        System.out.println("Getting ground beef and shells");
    }
    @Override
    public void cook() {
        System.out.println("Cooking ground beef in pan");
    }
    @Override
    public void eat() {
        System.out.println("The tacos are tasty");
    }
    @Override
    public void cleanUp() {
        System.out.println("Doing the dishes");
    }
}
