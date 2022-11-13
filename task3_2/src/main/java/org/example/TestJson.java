package org.example;

import java.util.ArrayList;

public class TestJson {
    public String id;
    public String title;
    public String value;
    public ArrayList<TestJson> values;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ArrayList<TestJson> getValues() {
        return values;
    }

    public void setValues(ArrayList<TestJson> values) {
        this.values = values;
    }
}
