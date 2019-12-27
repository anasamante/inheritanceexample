public class InheritanceExample {

    public static void main(String[] args){
        ElectricCar electricCar = new ElectricCar("Model A", "tesla");

        electricCar.getName();
        electricCar.getManufactureName();

        electricCar.setName("A");
        electricCar.setManufactureName("Ferrari");

        electricCar.charge();



    }
}
