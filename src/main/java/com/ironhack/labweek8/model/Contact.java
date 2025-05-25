package com.ironhack.labweek8.model;
import jakarta.persistence.*;
//
@Entity
@Table(name = "contact")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String company;
    private String title;
    //private String name;

    //embedded element section
    @Embedded
    private Name emberName;
    @AttributeOverrides({
            @AttributeOverride(name = "salutation", column = @Column(name = "secondary_area_salutation")),
            @AttributeOverride(name = "firstName", column = @Column(name = "secondary_area_firstName")),
            @AttributeOverride(name = "middleName", column = @Column(name = "secondary_area_middleName")),
            @AttributeOverride(name = "lastName", column = @Column(name = "secondary_area_lastName"))
    })
    @Embedded
    private Name emberArea;

    //constructor
    public Contact(Long id, String company, String title, Name emberName, Name emberArea) {
        this.id = id;
        this.company = company;
        this.title = title;
        this.emberName = emberName;
        this.emberArea = emberArea;
    }

    //empty
    public Contact() {
    }

    //getters & setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Name getEmberName() {
        return emberName;
    }

    public void setEmberName(Name emberName) {
        this.emberName = emberName;
    }

    public Name getEmberArea() {
        return emberArea;
    }

    public void setEmberArea(Name emberArea) {
        this.emberArea = emberArea;
    }


//
}
