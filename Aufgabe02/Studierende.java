public class Studierende {

    private String email;
    private double zufallsnote;
    private double wunschnote;

    public Studierende(String email) {
        double[] Noten = {1.0, 1.3, 1.7, 2.0, 2.3, 2.7, 3.0, 3.3, 3.7, 4.0, 5.0};
        int zufallsZahl = (int) (Math.random() * 11);
        double note = Noten[zufallsZahl];
        this.email = email;
        this.zufallsnote = note;
    }

    public double getNote() {
        return this.zufallsnote;
    }

    public String getEmail() {
        return this.email;
    }

    public static Studierende[] sortListForGrades(Studierende[] studierende) {
        int N = studierende.length;

        for (int i = 0; i < N; i++) {
            for (int j = i; j > 0; j--) {
                if (studierende[j - 1].getNote() > studierende[j].getNote()) {
                    Studierende temp = studierende[j - 1];
                    studierende[j - 1] = studierende[j];
                    studierende[j] = temp;
                    //temp als Zwischenspeicher für das Objekt Studierende
                }
            }
        }
        return studierende;
    }

    public static Studierende[] sortMailList(Studierende[] studierende) {
        int N = studierende.length;

        for (int i = 0; i < N; i++) {
            for (int j = i; j > 0; j--) {
                if (studierende[j - 1].getEmail().compareTo(studierende[j].getEmail()) > 0) {

                    Studierende temp;
                    temp = studierende[j - 1];
                    studierende[j - 1] = studierende[j];
                    studierende[j] = temp;

                }
            }

        }
        return studierende;
    }
}



