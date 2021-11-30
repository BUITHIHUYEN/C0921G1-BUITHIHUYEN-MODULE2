package bai_23_behavioral_design_pattern.thuc_hanh.triển_khai_observer_assignment;

import java.io.ObjectInputStream;

public class HexObserver extends Observer {
        public HexObserver(Subject subject) {
            this.subject = subject;
            this.subject.add(this);
        }

        public void update() {
            System.out.print(" " + Integer.toHexString(subject.getState()));
        }
    }
