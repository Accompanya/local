package com.acco.entity;

import com.acco.api.model.CustomerModel;
import org.springframework.data.annotation.Id;

/**
 * Created by Salman on 5/19/2016.
 */
public class AccompaniaCustomer extends MongoEntity {
    @Id
    private String id; //comes from Stripe

    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String contactNumber;
    private String emergencyContactFirstName;
    private String emergencyContactLastName;
    private String emergencyContactNumber;
    private String emergencyContactRelation;

    public AccompaniaCustomer(String id) {this.id = id;}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public static AccompaniaCustomer createEntity(String id, CustomerModel customer) {
        AccompaniaCustomer result = new AccompaniaCustomer(id);
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
