public class Vehicle {
    void display(){
        System.out.println("This is a vehicle");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.show();
        car.display();
    }

}
class Car extends Vehicle{

    void show(){
        System.out.println("This is a car");
    }



}