public class RabbitAndTurtle extends Thread {
    public static void main(String[] args) {
        AnimalThread rabbit = new AnimalThread("Кролик", 5);
        AnimalThread turtle = new AnimalThread("Черепаха", 10);
        rabbit.start();
        turtle.start();
    }
}