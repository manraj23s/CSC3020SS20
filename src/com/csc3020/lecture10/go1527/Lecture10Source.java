package com.csc3020.lecture10.go1527;

public class Lecture10Source {
    public static void main(String args[]){
        //Super
        Flight flight1=new Flight();
        Flight flight2=new Flight();
        if (flight1==flight2){
            System.out.println("Yes");
        }
        if (flight1.equals(flight2)){
            System.out.println("Yes");
        }

        Passenger passenger = new Passenger();
        if (flight1.equals(passenger)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        Student oStudent = new Student();

        CargoOnlyPilot oCargoOnlyPilot = new CargoOnlyPilot();
        CargoFlight oCargoFlight = new CargoFlight();
        boolean canAccept = oCargoOnlyPilot.canAccept(oCargoFlight);
        if (canAccept) {
            System.out.println("The CargoOnlyPilot can accept the flight");
        }
        oCargoFlight.add1Passenger();
        canAccept = oCargoOnlyPilot.canAccept(oCargoFlight);
        if (canAccept) {
            System.out.println("The CargoOnlyPilot can accept the flight");
        } else {
            System.out.println("The CargoOnlyPilot can't accept the flight");
        }

        FullLicensePilot oFullLicensePilot = new FullLicensePilot();
        canAccept = oCargoOnlyPilot.canAccept(oCargoFlight);
        if (canAccept) {
            System.out.println("The FullLicensePilot can accept the flight");
        } else {
            System.out.println("The FullLicensePilot can't accept the flight");
        }

        Flight f175 = new Flight(175);
        CargoFlight cf = new CargoFlight();
        CargoFlight cf294 = new CargoFlight(294);
        CargoFlight cf85 = new CargoFlight(85, 200);
        CargoFlight cfBig = new CargoFlight(5000.0f);

    }
}
