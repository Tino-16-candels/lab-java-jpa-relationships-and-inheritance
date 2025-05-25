package com.ironhack.labweek8.model;
import jakarta.persistence.*;
//
@Embeddable
public class Name {
    private Long id;
    private String salutation;//Mr,Mrs,Dr.
    private String firstName;
    private String middleName;
    private String lastName;
}
