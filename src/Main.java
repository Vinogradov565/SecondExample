public class Main {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.model = "AudiR8";
        audi.age = 5;
        Car myCar = new Car();
        System.out.println("Model:"   + audi.model);
        System.out.println("Машине лет:"  + audi.age+"лет");
        System.out.println("Аварийу машины:"+myCar.getAccident());
        myCar.start();
    }
}