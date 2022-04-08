package com.multilevel.inheritance.domain;

import lombok.*;
import org.joda.time.DateTime;
import com.sample.inheritance.domain.User;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Landlord extends User {
    private UUID id;

    private DateTime signUpDate;

    private String status;


}
