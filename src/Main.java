public class Main {

    public static void main(String[] args) throws InterruptedException {
        Califications one = new Califications("Hilo1", 1);
        Califications two = new Califications("Hilo2", 2);
        Califications three = new Califications("Hilo3", 3 );
        Califications four = new Califications("Hilo4", 4);
        Califications five = new Califications("Hilo5", 5);
        Califications six = new Califications("Hilo6", 6);
        Califications seven = new Califications("Hilo7", 7);
        Califications eight = new Califications("Hilo8", 8);
        Califications nine = new Califications("Hilo9", 9);
        Califications ten = new Califications("Hilo10", 10);
        one.start();
        two.start();
        three.start();
        four.start();
        five.start();
        six.start();
        seven.start();
        eight.start();
        nine.start();
        ten.start();

        one.join();
        two.join();
        three.join();
        four.join();
        five.join();
        six.join();
        seven.join();
        eight.join();
        nine.join();
        ten.join();
        System.out.println("Todos los hilos han acabado su tarea");
    }
}
