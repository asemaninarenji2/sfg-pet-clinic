package com.mainapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
public class Person extends BaseEntity{
    private String firstName;
    private String lastName;

}
