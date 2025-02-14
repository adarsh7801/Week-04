//package
package com.queueinterface.hospitaltriagesystem;

//import
import java.util.PriorityQueue;

//class
public class TriageSystem {

    //priority queue
    private PriorityQueue<Patient> queue;

    public TriageSystem() {
        // PriorityQueue with custom comparator (highest severity first)
        queue = new PriorityQueue<>(Patient.severityComparator);
    }

    public void addPatient(String name, int severity) {
        queue.add(new Patient(name, severity));
    }

    public void treatPatients() {
        System.out.println("Treating patients in order of severity:");

        while (!queue.isEmpty()) {

            // Remove highest priority patient
            Patient p = queue.poll();
            System.out.println("Treating: " + p.getName() + " (Severity: " + p.getSeverity() + ")");
        }
    }
}
