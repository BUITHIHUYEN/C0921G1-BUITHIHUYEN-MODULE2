package bai_tap_cuoi_tuan_4.models;

import bai_tap_cuoi_tuan_4.models.Candidates;

public class Fresher extends Candidates {
    private String graduationTime;
    private String graduationRank;
    private String education;

    public Fresher() {
    }

    public Fresher(String iD, String firstName, String lastName, String birthDate, String address, String phone,
                   String email, String graduationTime, String graduationRank, String education) {
        super(iD, firstName, lastName, birthDate, address, phone, email);
        this.graduationTime = graduationTime;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public String getGraduationTime() {
        return graduationTime;
    }

    public void setGraduationTime(String graduationTime) {
        this.graduationTime = graduationTime;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "Fresher{" +
                "iD = "+ getiD()+
                "firstName = "+getFirstName()+
                "lastName = " +getLastName()+
                "birthDate = "+getBirthDate()+
                "address"+getAddress()+
                "phone = "+getPhone()+
                "email"+ getEmail()+
                "graduationTime='" + graduationTime + '\'' +
                ", graduationRank='" + graduationRank + '\'' +
                ", education='" + education + '\'' +
                '}';
    }
}
