import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        EmergencyQueue emergencyQueue = new EmergencyQueue(10);
        emergencyQueue.enqueue(1,"Niklas");
        emergencyQueue.enqueue(20,"Joel");
        emergencyQueue.enqueue(3,"Luca");
        emergencyQueue.enqueue(10,"Michael");
        emergencyQueue.enqueue(8,"Nico");
        System.out.println(emergencyQueue.isEmpty());
        System.out.println(emergencyQueue.dequeue());
        System.out.println(emergencyQueue.dequeue());
        System.out.println(emergencyQueue.dequeue());
        System.out.println(emergencyQueue.dequeue());
        System.out.println(emergencyQueue.dequeue());
        System.out.println(emergencyQueue.isEmpty());
    }
}
