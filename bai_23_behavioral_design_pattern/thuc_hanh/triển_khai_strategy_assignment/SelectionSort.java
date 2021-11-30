package bai_23_behavioral_design_pattern.thuc_hanh.triển_khai_strategy_assignment;

import java.util.List;

public class SelectionSort implements SortStrategy{
    @Override
    public <T> void sort(List<T> items) {
        System.out.println("Selection sort");
    }
}
