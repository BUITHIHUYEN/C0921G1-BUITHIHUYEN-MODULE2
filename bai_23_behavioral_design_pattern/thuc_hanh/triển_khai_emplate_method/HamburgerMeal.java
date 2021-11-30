package bai_23_behavioral_design_pattern.thuc_hanh.triển_khai_emplate_method;

import bai_tap_cuoi_tuan_4.services.ManageCandidatesServices;

public class HamburgerMeal extends Meal {
    @Override
    public void prepareIngredients() {
        System.out.println("Getting burgers, buns, and french fries");
    }

    @Override
    public void cook() {
        System.out.println("Cooking burgers on grill and fries in oven");
    }

    @Override
    public void cleanUp() {
        System.out.println("Throwing away paper plates");
    }
}
