package bai_23_behavioral_design_pattern.thuc_hanh.triển_khai_emplate_method;

public class TemplateMethodDemo {
    public static void main(String[] args) {

        Meal meal1 = new HamburgerMeal();
        meal1.doMeal();

        System.out.println();

        Meal meal2 = new TacoMeal();
        meal2.doMeal();

    }
}
