package com.multilevel.inheritance.domain;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Manager extends Landlord {
    private UUID id;
    private String propertyType;
    private String propertyLimit;
}
