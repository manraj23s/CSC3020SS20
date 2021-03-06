package com.csc3020.lecture05.gh9893;

public class Lecture09Source {
    public static void main(String[] args) {
        CargoFlight cf = new CargoFlight();
        cf.add1Passenger();
        cf.print();

        cf.add1Package(1.0f, 2.5f, 3.0f);
        cf.print();

        Flight f = new CargoFlight();
        Passenger janet = new Passenger(0, 1);
        //f.add1Passenger(janet);

        //f.add1Package(1.0f, 2.5f, 3.0f);
        Flight[] squadron = new Flight[5];
        squadron[0] = new Flight();
        squadron[1] = new CargoFlight();
        squadron[2] = new CargoFlight();
        squadron[3] = new Flight();
        squadron[4] = new Flight();

        Flight regularFlight1 = new Flight();
        System.out.println(regularFlight1.getSeats());

        CargoFlight cargoFlight1 = new CargoFlight();
        System.out.println(cargoFlight1.getSeats());

        Flight castedCargoFlight = new CargoFlight();
        System.out.println(castedCargoFlight.getSeats());

        Object[] stuff = new Object[3];
        stuff[0] = new Flight();
        stuff[1] = new Passenger(0, 2);
        stuff[2] = new CargoFlight();

        Object o = new Passenger();
        o = new Flight[5];
        o = new CargoFlight();
        if (o instanceof CargoFlight) {
            CargoFlight oCargoFlight = (CargoFlight) o;
            oCargoFlight.add1Package(1, 2, 3);
        }

        Flight flight1 = new Flight();
        Flight flight2 = new Flight();
        if (flight1 == flight2) {
            System.out.println("Yes");
        }
        if (flight1.equals(flight2)){
            System.out.println("Yes");
        }

//        Passenger passenger = new Passenger();
//        if (flight1.equals(passenger)) {
//            System.out.println("Yes");
//        }
//        else {
//            System.out.println("No");
//        }
    }

}