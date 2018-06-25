package com.example.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Employee {

    private @Id @GeneratedValue Long id;

    @JsonProperty("firstName")
    private String firstName;
    private String lastName, description;

    @JsonCreator
    public Employee() {
    }

    public Employee(String firstName, String lastName, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", description=" + description + "]";
    }

}