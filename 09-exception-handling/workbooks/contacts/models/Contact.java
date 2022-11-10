package models;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Contact {
  
    private String name;
    private String birthDate;
    private String phoneNumber;
    private int age;

    public Contact(String name, String phoneNumber, String birthDate) throws ParseException {
        // IllegalArgumentException is not needed for birthDate because it already throw a ParseException error.
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name cannot be null or blank.");
        }
        if (phoneNumber == null || phoneNumber.isBlank()) {
            throw new IllegalArgumentException("phone number cannot be null or blank");
        }
        if (phoneNumber.length() < 5) {
            throw new IllegalArgumentException("phone number length cannot be less than 5");
        }
        this.name = name;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.age = toAge(birthDate);
    }

    // copy constructor
    public Contact(Contact source) {
        this.name = source.name;
        this.birthDate = source.birthDate;
        this.phoneNumber = source.phoneNumber;
        this.age = source.age;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name cannot be null or blank.");
        }
        this.name = name;
    }

    public void setBirthDate(String birthDate) throws ParseException {
        this.birthDate = birthDate;
        setAge(toAge(birthDate));
    }
    
    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.isBlank()) {
            throw new IllegalArgumentException("phone number cannot be null or blank");
        }
        if (phoneNumber.length() < 5) {
            throw new IllegalArgumentException("phone number length cannot be less than 5");
        }
        this.phoneNumber = phoneNumber;
    }

    private void setAge(int age) {
        this.age = age;
    }

    /**
     * Name: toAge
     * @param birthDate
     * @return age (int)
     * @throws ParseException
     *
     * Inside the function:
     *   1. Parses a date from the birthDate String
     *   2. Gets the current date
     *   3. Subtracts the difference and returns the age.
     *
     */
    public int toAge(String birthDate) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        formatter.setLenient(false);
        long diff = new Date().getTime() - formatter.parse(birthDate).getTime(); // age in milliseconds
        long days = TimeUnit.MILLISECONDS.toDays(diff);
        return (int) (days/365);
    }

    // toString method
    public String toString() {
        return "Name: " + this.name + "\n" +
            "Phone number: " + this.phoneNumber + "\n" +
            "Birth Date: " + this.birthDate + "\n" +
            "Age: " + this.age + " year old\n";
    }

}
