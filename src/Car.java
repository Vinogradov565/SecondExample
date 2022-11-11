public class Car {
    public String model;
    public int age;
    private int accident = 1;
    private boolean accidents;

     Car() {
        this.accident = accident;
    }
    int getAccident(){
        return accident;
    }
    void start() {
        accidents = true;
        System.out.println("У машины есть Аварии");
    }
    void stop() {
        accidents = false;
        System.out.println("У машины нет Аварий");
    }


}
