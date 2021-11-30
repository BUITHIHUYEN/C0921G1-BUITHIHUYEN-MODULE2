package bai_23_behavioral_design_pattern.thuc_hanh.triển_khai_strategy_assignment;

import java.util.List;

public interface SortStrategy {
    <T> void sort(List<T> items);
}
