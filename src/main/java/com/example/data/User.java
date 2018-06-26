package com.example.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {

    @JsonProperty("id")
    private @Id @GeneratedValue Long id;

    @JsonProperty("name")
    private String name;

    public User(Long id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    @JsonCreator
    public User() {
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + "]";
    }

}