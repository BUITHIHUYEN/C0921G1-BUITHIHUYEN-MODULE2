package bai_21_design_patterns.thuc_hanh.factory_method;

import jdk.nashorn.internal.runtime.regexp.joni.constants.StringType;

public class FactoryAnimal {
    public Animal getAnimal(String type){
        if ("canine".equals(type)) {
            return new Dog();
        } else {
            return new Cat();
        }
    }
}
