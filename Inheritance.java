
class Vehicle{
    public String name;
    public String model;
    public int noOfTyres;

    Vehicle(){
        this.name = "";
        this.model = "";
        this.noOfTyres = -1;
    }

    Vehicle(String name, String model, int noOfTyres){
        this.name = name;
        this.model = model;
        this.noOfTyres = noOfTyres;
    }

    public void startEngine(){
        System.out.println("Engine started of " + name + " :" + model);
    }

    public void stopEngine(){
        System.out.println("Engine stopped of " + name + " :" + model);
    }
}

class Car extends Vehicle{
    public int noOfDoors;
    public String transmissionType;

    Car(String name, String model, int noOfTyres, int noOfDoors, String transmissionType){
        super(name, model, noOfTyres);
        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissionType;

    }

    public void startAc(){
        System.out.println("AC started of " + name + " : " + model);
    }

}

class Bike extends Vehicle{
    public String handleBarStyle;
    public String suspensionType;

    Bike(String name, String model, int noOfTyres, String handleBarStyle, String suspensionType){
        super(name, model, noOfTyres);
        this.handleBarStyle = handleBarStyle;
        this.suspensionType = suspensionType;
    }

    public void wheelie(){
        System.out.println("Your Bike is doing a wheelie! " + name + " : " + model);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Car c = new Car("Honda", "City", 4, 4, "Automatic");
        c.startEngine();
        c.startAc();
        c.stopEngine();

        Bike b = new Bike("Yamaha", "R15", 2, "Clip-on", "Telescopic");
        b.startEngine();
        b.wheelie();
        b.stopEngine();
    }
}
