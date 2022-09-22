package org.launchcode.techjobs.oo;

import java.util.Objects;

public class PositionType extends JobField {

    public  PositionType () {
        super();
    }

    public PositionType(String value) {
        super();
        this.setValue(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PositionType that = (PositionType) o;
        return getId() == that.getId();
    }

}
