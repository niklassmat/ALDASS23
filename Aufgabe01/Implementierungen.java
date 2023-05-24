import java.util.Arrays;
import java.util.Scanner;

public class Implementierungen {
    private int N;
    private int arraylänge;
    public static void StandardImplementierung(int N, int arraylänge) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Möchtest du das Programm Standardimplementierung ausführen? Ja zum Ausführen");
        String ausführung = scanner.next();
        if(!(ausführung.equalsIgnoreCase("JA"))){
            return;
        }

        System.out.println("Dir stehen die Bausteine (Zahlen) 0 bis " + N + " zur Verfügung um die Arrays zu befüllen");

        int[] pArray = new int[arraylänge];
        int[] qArray = new int[arraylänge];
        WeightedQU uf = new WeightedQU(N);
        for (int i = 1; i <= arraylänge; i++) {
            System.out.println("Bitte " + i + ". p-Wert eingeben:");
            int pValue = scanner.nextInt();
            System.out.println("Bitte " + i + ". q-Wert eingeben:");
            int qValue = scanner.nextInt();
            if (pValue >= 0 && pValue <= N && qValue >= 0 && qValue <= N) {
                pArray[i - 1] = pValue;
                qArray[i - 1] = qValue;
                uf.union(pValue, qValue);
            }
            else {
                System.out.println("Einer der Werte lag außerhalb des definierten Zahlenbereichs von 0 bis " + N + ". Bitte gültigen Wert eingeben.");
                i -= 1;
            }
        }
        System.out.println("Deine Arrays sind:");
        System.out.println("p-Array: " + Arrays.toString(pArray));
        System.out.println("q-Array: " + Arrays.toString(qArray));
        while (true) {
            System.out.println("Möchtest du eine connection prüfen? 1 für Ja, eine andere Zahl für Nein");
            int prüfung = scanner.nextInt();
            if (prüfung != 1) {
                break;
            }
            System.out.println("Zahl 1: ");
            int zahl1 = scanner.nextInt();
            System.out.println("Zahl 2: ");
            int zahl2 = scanner.nextInt();
            System.out.println("Bausteine " + zahl1 + " und " + zahl2 + " sind verbunden: " + uf.connected(zahl1, zahl2));
        }
    }
    public static void ImplementierungMitAnwendungsbeispiel(int N, int arraylänge){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dir stehen "+ N + " verschiedenen Bausteine (Städte) zur Verfügung um die Arrays zu befüllen");
        int[] pArray = new int[arraylänge];
        int[] qArray = new int[arraylänge];

        for (int i =0; i<arraylänge;i++){
            pArray[i]= i;
        }
        int z = arraylänge;
        for (int k = 0; k<arraylänge; k++){
            qArray[k] = z;
            z+=1;
        }
        System.out.println(Arrays.toString(pArray));
        System.out.println(Arrays.toString(qArray));
        WeightedQU uf = new WeightedQU(N);
        String[] pArrayStadt = new String[arraylänge];
        String[] qArrayStadt = new String[arraylänge];

        for (int i=0; i < arraylänge; i++) {
            System.out.println("Bitte " + i + ". p-Wert (Stadt) eingeben:");
            String pValue = scanner.next();
            pArrayStadt[i] = pValue;
            System.out.println("Bitte " + i + ". q-Wert (Stadt) eingeben:");
            String qValue = scanner.next();
            qArrayStadt[i] = qValue;
        }
        for (int i=0; i<arraylänge;i++){
            uf.union(pArray[i], qArray[i]);
            System.out.println(pArray[i]+", entsprechend " + pArrayStadt[i] + " und " + qArray[i]+ ", entsprechend " + qArrayStadt[i] + " sind connected: " + uf.connected(pArray[i], qArray[i]));
        }
        System.out.println("p-Array: " + Arrays.toString(pArray));
        System.out.println("q-Array: " + Arrays.toString(qArray));
        System.out.println("p-Array: " + Arrays.toString(pArrayStadt));
        System.out.println("q-Array: " + Arrays.toString(qArrayStadt));
    }
    public static void StandardImplementierungMitTimer(int N, int arraylänge){
        int[] pArray = new int[arraylänge];
        int[] qArray = new int[arraylänge];
        for (int i=0; i<arraylänge;i++){
            pArray[i] = (int) (Math.random()*N);
            qArray[i] = (int) (Math.random()*N);
        }

        System.out.println(Arrays.toString(pArray));
        System.out.println(Arrays.toString(qArray));
        System.out.println("Arraylength: " +pArray.length);
        //Stopuhr zählt nur die Zeit für die union Operation und nicht für das befüllen des Arrays
        Stopwatch stopwatch = new Stopwatch();
        WeightedQU uf = new WeightedQU(N);
        for (int i=0; i<arraylänge; i++){
            uf.union(pArray[i],qArray[i]);
        }
        double time = stopwatch.elapsedTime();
        System.out.println("Time: " + time);
    }
}
