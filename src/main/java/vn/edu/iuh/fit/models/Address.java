package vn.edu.iuh.fit.models;

import com.neovisionaries.i18n.CountryCode;

import java.io.Serializable;

public class Address implements Serializable {
    private long id;
    private String city;
    private CountryCode country;
    private String zipCode;
    private String street;
    private Candidate candidate;
    private String number;
    private Company company;

    public Address(long id, String city, CountryCode country, String zipCode, String street, Candidate candidate, String number, Company company) {
        this.id = id;
        this.city = city;
        this.country = country;
        this.zipCode = zipCode;
        this.street = street;
        this.candidate = candidate;
        this.number = number;
        this.company = company;
    }

    public Address() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public CountryCode getCountry() {
        return country;
    }

    public void setCountry(CountryCode country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", country=" + country +
                ", zipCode='" + zipCode + '\'' +
                ", street='" + street + '\'' +
                ", candidate=" + candidate +
                ", number='" + number + '\'' +
                ", company=" + company +
                '}';
    }
}
