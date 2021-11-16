package bai_12_java_collection_framework.bai_tap;

import java.util.Comparator;

public class PriceIncreasesGradually implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getPrice()+o2.getPrice();
    }
}
