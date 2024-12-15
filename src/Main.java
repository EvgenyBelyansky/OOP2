import VehiclePack.*;

public class Main {
    public static void main(String[] args) {

        Bicycle stels = new Bicycle("Stells", 2);

        Car lada = new Car("Lada 2110", 4);
        Car volvoCV90 = new Car("Volvo CV90", 4);

        Truck shcman = new Truck("Sacman", 8);
        Truck kamaz = new Truck("Kamaz", 6);

        System.out.println("lada = " + lada);

        CheckedVehicle[] checkedVehicles = {
                stels,
                lada,
                volvoCV90,
                shcman,
                kamaz,
        };

        ServiceStation serviceStation = new ServiceStation();

        for (CheckedVehicle checkedVehicle: checkedVehicles) {
            serviceStation.check(checkedVehicle);
        }

    }
}