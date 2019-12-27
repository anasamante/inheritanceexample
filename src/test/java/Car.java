public class Car {

    private String name;
    private String manufactureName;

    public Car(String name, String manufactureName) {
        this.name = name;
        this.manufactureName = manufactureName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufactureName() {
        return manufactureName;
    }

    public void setManufactureName(String manufactureName) {
        this.manufactureName = manufactureName;
    }

    public void charge(){
        System.out.println("Cahrging...");
    }
}
