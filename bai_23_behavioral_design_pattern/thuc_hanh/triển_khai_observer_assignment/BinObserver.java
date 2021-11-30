package bai_23_behavioral_design_pattern.thuc_hanh.triển_khai_observer_assignment;

public class BinObserver extends Observer{
    public BinObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }
    @Override
    public void update() {
        System.out.print(" " + Integer.toBinaryString(subject.getState()));
    }
}
