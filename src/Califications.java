import java.util.ArrayList;
import java.util.List;

public class Califications extends Thread {
    private int MAX_CALIFICATIONS = 10000;
    String name;
    int threadNumber;

    public Califications(String name, int threadNumber) {
        this.name = name;
        this.threadNumber = threadNumber;
    }

    List<Integer> califications = new ArrayList<>();

    @Override
    public void run() {
        try {
            int count = 0;
            int sumaTotal = 0;
            for (int x = 0; x < MAX_CALIFICATIONS; x++) {
                int randomCalification = (int) (Math.random() * 10);
                califications.add(randomCalification);
                sumaTotal += califications.get(x);
                count++;
            }
            System.out.println("El hilo " + this.name + ", que empezó en el índice " + ((this.threadNumber-1) * (MAX_CALIFICATIONS-1)) + " y ha contado " + count + " calificaciones, ha sumado un total de: " + sumaTotal);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
