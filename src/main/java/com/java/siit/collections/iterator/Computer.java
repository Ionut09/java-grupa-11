package com.java.siit.collections.iterator;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Computer {
    String model;
    String name;

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Computer)) {
            return false;
        }
        Computer comp = (Computer) obj;
        return name.equals(comp.name) && model.equals(comp.model);
    }
}
