package com.acco.api.model;

import com.acco.entity.AccompaniaCustomer;

/**
 * Created by Salman on 5/19/2016.
 */
public class CustomerModel {

    private String cardId; // card token coming from Stripe
    private String firstName;
    private String lastName;
    private String email;
    private String contactNumber;
    private String emergencyContactFirstName;
    private String emergencyContactLastName;
    private String emergencyContactNumber;
    private String emergencyContactRelation;
    private String gender;

    public CustomerModel(){

    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmergencyContactFirstName() {
        return emergencyContactFirstName;
    }

    public void setEmergencyContactFirstName(String emergencyContactFirstName) {
        this.emergencyContactFirstName = emergencyContactFirstName;
    }

    public String getEmergencyContactLastName() {
        return emergencyContactLastName;
    }

    public void setEmergencyContactLastName(String emergencyContactLastName) {
        this.emergencyContactLastName = emergencyContactLastName;
    }

    public String getEmergencyContactNumber() {
        return emergencyContactNumber;
    }

    public void setEmergencyContactNumber(String emergencyContactNumber) {
        this.emergencyContactNumber = emergencyContactNumber;
    }

    public String getEmergencyContactRelation() {
        return emergencyContactRelation;
    }

    public void setEmergencyContactRelation(String emergencyContactRelation) {
        this.emergencyContactRelation = emergencyContactRelation;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static CustomerModel fromEntity(AccompaniaCustomer customer) {
        CustomerModel result = new CustomerModel();
        result.setFirstName(customer.getFirstName());
        result.setLastName(customer.getLastName());
        result.setEmail(customer.getEmail());
        result.setContactNumber(customer.getContactNumber());
        result.setGender(customer.getGender());
        result.setEmergencyContactFirstName(customer.getEmergencyContactFirstName());
        result.setEmergencyContactLastName(customer.getEmergencyContactLastName());
        result.setEmergencyContactNumber(customer.getEmergencyContactNumber());
        result.setEmergencyContactRelation(customer.getEmergencyContactRelation());
        return result;
    }
}
