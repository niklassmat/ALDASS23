import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex02LE5 {
    public static void main(String[] args) throws IOException {
        Studierende niklas = new Studierende("ni352mat@htwg-kostanz.de");
        Studierende joel = new Studierende("jo351gan@htwg-konstanz.de");
        Studierende johannes = new Studierende("jo121tze@htwg-konstanz.de");
        Studierende sina = new Studierende("si351kor@htwg-konstanz.de");
        Studierende christian = new Studierende("ch351los@htwg-konstanz.de");

        Studierende[] studierende = {niklas, joel, johannes, sina, christian};

        for (int i=0; i<studierende.length; i++){
            System.out.println(studierende[i].getEmail()+", " +studierende[i].getNote());
        }

        System.out.println();
        Studierende.sortListForGrades(studierende);
        System.out.println();

        for (int i=0; i<studierende.length; i++){
            System.out.println(studierende[i].getEmail()+", " +studierende[i].getNote());
        }

        System.out.println();
        Path path = Paths.get("Aufgabe02/mail_adressen.txt");
        String emailString = Files.readString(path);
        String[] lines = emailString.split("\n");

        Studierende[] studierende2 = new Studierende[lines.length];

        for (int i=0; i<lines.length; i++){
            String mail = lines[i];
            Studierende studi = new Studierende(mail);
            studierende2[i] = studi;
            System.out.println(studierende2[i].getEmail());
        }
        Studierende.sortMailList(studierende2);
        System.out.println();

        for (int i=0; i<studierende2.length; i++){
            System.out.println(studierende2[i].getEmail());
        }



    }
}
