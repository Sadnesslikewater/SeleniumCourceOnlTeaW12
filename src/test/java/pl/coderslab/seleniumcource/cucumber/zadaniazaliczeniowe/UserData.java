package pl.coderslab.seleniumcource.cucumber.zadaniazaliczeniowe;

public class UserData {

    private String alias;
    private String address;
    private String city;
    private int zipCode;
    private String country;
    private int phone;

    public String getAlias() {
        return alias;
    }

    public UserData setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAddress() {
        return address;
    }
    public UserData setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getCity() {
        return city;
    }
    public UserData setCity(String city) {
        this.city = city;
        return this;
    }
    public int getZipCode() {
        return zipCode;
    }
    public UserData setZipCode(int zipCode) {
        this.zipCode = zipCode;
        return this;
    }
    public String getCountry() {
        return country;
    }
    public UserData setCountry(String country) {
        this.country = country;
        return this;
    }
    public int getPhone() {
        return phone;
    }
    public UserData setPhone(int phone) {
        this.phone = phone;
        return this;
    }
}

