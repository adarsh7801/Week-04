//package
package com.queueinterface.hospitaltriagesystem;

//import
import java.util.Comparator;

//class
public class Patient {

    //initializing variables
    private String name;
    private int severity; // Higher means more critical

    //constructor
    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    //getter
    public String getName() {
        return name;
    }

    //setter
    public int getSeverity() {
        return severity;
    }

    // Comparator for PriorityQueue (Higher severity = higher priority)
    public static Comparator<Patient> severityComparator = (p1, p2) -> p2.getSeverity() - p1.getSeverity();
}
