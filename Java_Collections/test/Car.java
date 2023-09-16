package collection.test;

public class Car extends Vehicle {
    public String color;
    
    public Car(String brand, String model, int year, String color) {
        super(brand, model, year);
        this.color = color;
        System.out.println("Displaying car parameters are:  " +brand+"-"+model+"-"+year+"-"+color+"-");
    }
    
    public void honk() {
        System.out.println("Honking method is called");
    }

}
