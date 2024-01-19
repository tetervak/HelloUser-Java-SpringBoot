package ca.tetervak.hellouser.model;

import jakarta.validation.constraints.NotBlank;

public class AppUser {

    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;

    public AppUser(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public AppUser() {
        this("","");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
