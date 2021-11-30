package bai_23_behavioral_design_pattern.thuc_hanh.triển_khai_observer_assignment;

public class OctObserver extends Observer{
    public OctObserver(Subject subject) {
        this.subject = subject;
        this.subject.add( this );
    }

    public void update() {
        System.out.print(" " + Integer.toOctalString(subject.getState()));
    }
}
