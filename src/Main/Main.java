package Main;

/**
 * Created by Aleksander on 07.03.2017.
 */
public class Main {
    public static void main(String[] args) {

        System.out.format("Hello %s!\n", args[0]); /* \n перевод строки */
        /** созаём новый объект Carimpl ( физически в памяти)*/
        Car car = new Carimpl();
        Car car2 = new Carimpl();
        car.setSpeed(200);
        System.out.println(car.getSpeed());
        /*присвоили объекту метод go */
        car.go();
        car2.go();
    }
}
