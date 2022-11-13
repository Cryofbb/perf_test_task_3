package org.example;

import java.util.ArrayList;

public class Values {
    public ArrayList<Value2> values;

    public ArrayList<Value2> getValues() {
        return values;
    }

    public void setValues(ArrayList<Value2> values) {
        this.values = values;
    }
}

class Value2 {
    public String id;
    public String value;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

