package vn.edu.iuh.fit.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class Candidate implements Serializable {
    private long id;
    private String phone;
    private LocalDate dob;
    private String email;
    private String fullName;
    private Address address;
    private List<CandidateSkill> candidateSkills;
    private List<Experience> experiences;

    public Candidate(long id, String phone, LocalDate dob, String email, String fullName, Address address, List<CandidateSkill> candidateSkills, List<Experience> experiences) {
        this.id = id;
        this.phone = phone;
        this.dob = dob;
        this.email = email;
        this.fullName = fullName;
        this.address = address;
        this.candidateSkills = candidateSkills;
        this.experiences = experiences;
    }

    public Candidate() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<CandidateSkill> getCandidateSkills() {
        return candidateSkills;
    }

    public void setCandidateSkills(List<CandidateSkill> candidateSkills) {
        this.candidateSkills = candidateSkills;
    }

    public List<Experience> getExperiences() {
        return experiences;
    }

    public void setExperiences(List<Experience> experiences) {
        this.experiences = experiences;

    }

    @Override
    public String toString() {
        return "Candidate{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                ", fullName='" + fullName + '\'' +
                ", address=" + address +
                ", candidateSkills=" + candidateSkills +
                ", experiences=" + experiences +
                '}';
    }
}
