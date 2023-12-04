package com.example.formRDS;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

@Data
@Entity
public class formEntity {

    private @Id @GeneratedValue Long id;
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private String phoneNo;
    private String emailId;
    private String dateOfSurvey;
    private String likeCampus;
    private String interestUniversity;
    private String recommend;
    private String raffle;
    private String comment;

    public formEntity(){}

    public formEntity(Long id, String firstName, String lastName, String streetAddress, String city, String state, String zipCode, String phoneNo, String emailId, String dateOfSurvey, String likeCampus, String interestUniversity, String recommend, String raffle, String comment) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNo = phoneNo;
        this.emailId = emailId;
        this.dateOfSurvey = dateOfSurvey;
        this.likeCampus = likeCampus;
        this.interestUniversity = interestUniversity;
        this.recommend = recommend;
        this.raffle = raffle;
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "formEntity{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", emailId='" + emailId + '\'' +
                ", dateOfSurvey='" + dateOfSurvey + '\'' +
                ", likeCampus='" + likeCampus + '\'' +
                ", interestUniversity='" + interestUniversity + '\'' +
                ", recommend='" + recommend + '\'' +
                ", raffle='" + raffle + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
