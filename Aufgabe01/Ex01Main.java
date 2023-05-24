import java.util.Scanner;


public class Ex01Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] operationList ={"LE2-Standardimplementierung", "LE2-IImplementierung mit Anwendungbeispiel", "LE3 Standardimplementierung mit Timer mit 10 Arrayfeldern", "LE3 Standardimplementierung mit Timer mit 100 Arrayfeldern", "LE3 Standardimplementierung mit Timer mit 1000 Arrayfeldern", "LE3 Standardimplementierung mit Timer mit 10000 Arrayfeldern", "LE3 Standardimplementierung mit Timer mit 100000 Arrayfeldern", "LE3 Standardimplementierung mit Timer mit 1000000 Arrayfeldern", "LE3 Standardimplementierung mit Timer mit 10000000 Arrayfeldern","LE3 Standardimplementierung mit Timer mit 100000000 Arrayfeldern", "LE3 Standardimplementierung mit Timer mit 500000000 Arrayfeldern"};
        while(true) {
            System.out.println("Was willst du machen?");
            for (int i = 0; i < operationList.length; i++) {
                System.out.println("Wähle " + i + " für: " + operationList[i]);
            }
            System.out.println("Wähle 99 um das Programm zu beenden");
            int operation = scanner.nextInt();
            switch (operation){
                case 99:
                    return;
                case 1:
                    Implementierungen.StandardImplementierung(10,10);
                    break;
                case 2:
                    Implementierungen.ImplementierungMitAnwendungsbeispiel(10,3);
                    break;
                case 3:
                    Implementierungen.StandardImplementierungMitTimer(10,10);
                    break;
                case 4:
                    Implementierungen.StandardImplementierungMitTimer(100,100);
                    break;
                case 5:
                    Implementierungen.StandardImplementierungMitTimer(1000,1000);
                    break;
                case 6:
                    Implementierungen.StandardImplementierungMitTimer(10000,10000);
                    break;
                case 7:
                    Implementierungen.StandardImplementierungMitTimer(100000,100000);
                    break;
                case 8:
                    Implementierungen.StandardImplementierungMitTimer(1000000,1000000);
                    break;
                case 9:
                    Implementierungen.StandardImplementierungMitTimer(10000000,10000000);
                    break;
                case 10:
                    Implementierungen.StandardImplementierungMitTimer(5000000,50000000);
                    break;
            }
        }
            }
    }



