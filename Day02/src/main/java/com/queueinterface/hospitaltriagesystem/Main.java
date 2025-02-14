//package
package com.queueinterface.hospitaltriagesystem;

//main class
public class Main {

    //main method
    public static void main(String[] args) {

        //object
        TriageSystem hospital = new TriageSystem();

        // Adding patients
        hospital.addPatient("John", 3);
        hospital.addPatient("Alice", 5);
        hospital.addPatient("Bob", 2);

        // Treating patients based on severity
        hospital.treatPatients();
    }
}
