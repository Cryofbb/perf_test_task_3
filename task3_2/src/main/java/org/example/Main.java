package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File valuesFile = new File("values.json");
        File testsFile = new File("tests.json");
        Tests val = objectMapper.readValue(testsFile, Tests.class);
        Values val2 = objectMapper.readValue(valuesFile, Values.class);

        for (TestJson element2 : val.tests) {
            for (Value2 element : val2.values) {
                if (element.getId().equals(element2.getId())) {
                    element2.setValue(element.getValue());
                }
            }
        }
        objectMapper.writeValue(new File("report.json"), val);
    }
}

