package Chapter7;

class Vehicle {
    private int passengers;
    private int fuelcap;
    private double lkm;

    Vehicle(int p, int f, double l) {
        passengers = p;
        fuelcap = f;
        lkm = l;
    }

    int range() {
        return (int) (fuelcap / lkm * 100);
    }

    double fuelNeeded(int km) {
        return (double) km / 100 * lkm;
    }

    int getPassengers() { return passengers; }
    void setPassengers(int p) { passengers = p; }
    int getFuelcap() { return  fuelcap; }
    void setFuelcap(int f) { fuelcap = f; }
    double getLkm() { return  lkm; }
    void setMpg(double l) { lkm = l; }
}

class Truck extends Vehicle {
    private int cargocap;

    Truck(int p, int f, double l, int c) {
        super(p, f, l);

        cargocap = c;
    }

    int getCargo() { return cargocap; }
    void putCargo(int c) { cargocap = c; }
}

public class TruckDemo {
    public static void main(String[] args) {
        Truck semi = new Truck(2, 200, 25, 4);
        Truck picup = new Truck(3, 80, 15, 1);
        double liters;
        int dist = 252;

        liters = semi.fuelNeeded(dist);

        System.out.println("Semi-truck carries " + semi.getCargo() + " tons of cargo.");
        System.out.println("To cover a distance " + dist + " km semi-truck consumes " + liters + " of fuel.");

        liters = picup.fuelNeeded(dist);

        System.out.println("Picup carries " + picup.getCargo() + " tons of cargo.");
        System.out.println("To cover a distance " + dist + " km picup consumes " + liters + " of fuel.");
    }
}
