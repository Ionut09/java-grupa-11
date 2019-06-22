package com.java.siit.oop.garage_app;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class Car {
    //@EqualsAndHashCode.Exclude
    private String model;
    private String plate;
    private boolean broken;
    //@ToString.Exclude
}
