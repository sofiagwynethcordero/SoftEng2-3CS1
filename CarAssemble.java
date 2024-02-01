public class CarAssemble {
    public static void main(String[] args){

       Car myCar = new Car.CarBuilder()
                .engineType("Gasoline")
                .transmission("Manual")
                .color("Purple")
                .passengerCapacity(7)
                .brand("Honda")
                .build();

        System.out.println(myCar.engineType);
        System.out.println(myCar.brand);
        System.out.println(myCar.transmission);
        System.out.println(myCar.color);
        System.out.println(myCar.passengerCapacity);
    }
}
