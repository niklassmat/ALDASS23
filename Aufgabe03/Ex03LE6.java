public class Ex03LE6 {
    public static void main(String[] args) {
        Studierende niklas = new Studierende("ni352mat@htwg-kostanz.de");
        Studierende joel = new Studierende("jo351gan@htwg-konstanz.de");
        Studierende johannes = new Studierende("jo121tze@htwg-konstanz.de");
        Studierende sina = new Studierende("si351kor@htwg-konstanz.de");
        Studierende christian = new Studierende("ch351los@htwg-konstanz.de");

        Studierende[] studierende = {niklas, joel, johannes, sina, christian};
        Studierende[] studierendeHunderdTausend = new Studierende[100000];

        int counter=0;
        for (Studierende studi:studierendeHunderdTausend) {
            String mail = counter + "@htwg-konstanz.de";
            studi = new Studierende(mail);
            studierendeHunderdTausend[counter]=studi;
            counter+=1;
        }

        for (int i=0; i<studierende.length; i++){
            System.out.println(studierende[i].getEmail()+", " +studierende[i].getNote());
        }

        System.out.println();

        Studierende[] hilfe = new Studierende[studierende.length];
        Mergesort.sort(studierende, hilfe, 0, studierende.length-1);
        System.out.println();

        for (Studierende stud:studierende) {
            System.out.println(stud.getEmail()+ " " +stud.getNote());
        }
        Studierende[] hilfeHT = new Studierende[studierendeHunderdTausend.length];
        Stopwatch stopwatch = new Stopwatch();
        Mergesort.sort(studierendeHunderdTausend,hilfeHT,0, studierendeHunderdTausend.length-1);
        System.out.println(stopwatch.elapsedTime());
    }
}
