package com.java.siit.jdbc;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Singer implements Serializable {
    /*
    id	bigint(10) Auto-INCREMENT PK
    first_name	varchar(50)
    last_name	varchar(50)
    birth_date	date
     */

    private LocalDate birthDate;
    private String firstName;
    private long id;
    private String lastName;
}

