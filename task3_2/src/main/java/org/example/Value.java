package org.example;

import java.util.ArrayList;

public class Value {

    public ArrayList<Value> tests;
    public String id;
    public String title;
    public String value;
    public ArrayList<Value> values;

    public ArrayList<Value> getTests() {
        return tests;
    }

    public void setTests(ArrayList<Value> tests) {
        this.tests = tests;
    }

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

    public ArrayList<Value> getValues() {
        return values;
    }

    public void setValues(ArrayList<Value> values) {
        this.values = values;
    }
}
