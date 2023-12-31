package vn.edu.iuh.fit.models;

import java.io.Serializable;
import java.util.List;

public class Company implements Serializable {
    private long id;
    private String name;
    private String about;
    private Address address;
    private String email;
    private String phone;
    private String webUrl;
    private List<Job> jobs;

    public Company(long id, String name, String about, Address address, String email, String phone, String webUrl, List<Job> jobs) {
        this.id = id;
        this.name = name;
        this.about = about;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.webUrl = webUrl;
        this.jobs = jobs;
    }

    public Company() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", about='" + about + '\'' +
                ", address=" + address +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", webUrl='" + webUrl + '\'' +
                ", jobs=" + jobs +
                '}';
    }
}
