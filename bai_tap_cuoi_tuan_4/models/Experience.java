package bai_tap_cuoi_tuan_4.models;

import bai_tap_cuoi_tuan_4.models.Candidates;

public class Experience extends Candidates {
    private double expInYear;
    private String proSkill;

    public Experience() {
    }

    public Experience(String iD, String firstName, String lastName, String birthDate, String address,
                      String phone, String email,double expInYear, String proSkill) {
        super(iD, firstName, lastName, birthDate, address, phone, email);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public double getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(double expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return "Experience{" + "iD = " + getiD()+
                "firstName = "+getFirstName()+
                "lastName = " +getLastName()+
                "birthDate = "+getBirthDate()+
                "address"+getAddress()+
                "phone = "+getPhone()+
                "email"+ getEmail()+
                "expInYear=" + expInYear +
                ", proSkill='" + proSkill + '\'' +
                '}';
    }
}
