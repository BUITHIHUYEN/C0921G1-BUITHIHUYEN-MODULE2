package bai_23_behavioral_design_pattern.thuc_hanh.triển_khai_strategy_assignment;

public class Main {
    public static void main(String[] args) {
        SortedList sortedList = new SortedList();
        sortedList.add("Java");
        sortedList.add("PHP");
        sortedList.add("C#");
        sortedList.add("Python");
        sortedList.setSortStrategy(new QuickSort());
        sortedList.sort();
        sortedList.setSortStrategy(new MergeSort());
        sortedList.sort();
    }
}
