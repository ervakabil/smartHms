package com.etiya.hms.models;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class OrganizationName {
    @NonNull
    private String name;
    private String description;
}