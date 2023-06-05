/*
    public enqueue(int emergencyLevel, String callerName) {
        //Fügt einen neuen Notruf in die Warteschlange ein.
        // Der Parameter emergencyLevel gibt die Dringlichkeit des Notrufs an, und callerName ist der Name des Anrufers.
    }

	public String dequeue() {
        //Entfernt den Notruf mit der höchsten Dringlichkeit aus der Warteschlange und gibt den Namen des Anrufers zurück.

    public boolean isEmpty() {
        //Gibt zurück, ob die Warteschlange leer ist.
 */


public class EmergencyQueue {
    private int[] a;
    private int N;
    private String[] names;

    public EmergencyQueue(int capacity) {
        a = new int[capacity + 1];
        names = new String[capacity + 1];
    }

    public void enqueue(int emergencyLevel, String name) {
        a[++N] = emergencyLevel;
        //früher: names[++N] = name;
        names[N] = name;
        tauscheHoch(N);
    }

    public boolean isEmpty(){
        return N==0;
    }

    public String dequeue() {
        String name = names[1];
        exchange(1, N--);
        tauscheRunter(1);
        return name;
    }


    private void tauscheHoch(int k) {
        while (k > 1 && a[k/2]<a[k]) {
            exchange(k, k/2);
            k = k/2;
        }
    }

    private void tauscheRunter(int k) {
        while (2*k <= N) {
            int j = 2*k;
            if (j < N && (a[j]<a[j+1])) j++;
            if (a[k]>=a[j]) break;
            exchange(k, j);
            k = j;
        }
    }

    private void exchange(int x1, int x2) {
        int temp = a[x1];
        a[x1] = a[x2];
        a[x2] = temp;
        //zuvor: vergessen names-Array auch mitzuordnen, analog zu a
        String tempName = names[x1];
        names[x1] = names[x2];
        names[x2] = tempName;
    }
}


