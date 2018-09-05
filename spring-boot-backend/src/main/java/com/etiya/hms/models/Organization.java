package com.etiya.hms.models;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Organization{
    private String organizationName;
    private String description;
    private Set<OrganizationName> organizationNames = new HashSet<OrganizationName>();
    private Set<Person> contacts = new HashSet<Person>();
}