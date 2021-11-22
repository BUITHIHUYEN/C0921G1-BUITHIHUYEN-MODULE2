package bai_tap_cuoi_tuan_4.models;

import bai_tap_cuoi_tuan_4.models.Candidates;

public class Intern extends Candidates {
    private String majors;
    private String semester;
    private String universityName;

    public Intern() {
    }

    public Intern(String iD, String firstName, String lastName, String birthDate, String address, int phone,
                  String email, String majors, String semester, String universityName) {
        super(iD, firstName, lastName, birthDate, address, phone, email);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return "Intern{" +"iD="+getiD()+
                "firstName = "+getFirstName()+
                "lastName = " +getLastName()+
                "birthDate = "+getBirthDate()+
                "address"+getAddress()+
                "phone = "+getPhone()+
                "email"+ getEmail()+
                "majors='" + majors + '\'' +
                ", semester='" + semester + '\'' +
                ", universityName='" + universityName + '\'' +
                '}';
    }
}
