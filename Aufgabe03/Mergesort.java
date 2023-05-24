public class Mergesort {

    private static void merge(Studierende[] a, Studierende[] hilfe, int vorne, int mitte, int hinten){
        for (int k =vorne; k <= hinten; k++){
            hilfe[k] = a[k];
        }

        int i = vorne;
        int j = mitte+1;
        for(int k = vorne; k <= hinten; k++){
            if(i > mitte){
                a[k]=hilfe[j++];
            } else if (j > hinten) {
                a[k] = hilfe[i++];
            } else if (hilfe[j].getNote() < hilfe[i].getNote()){
                a[k]=hilfe[j++];
            } else {
                a[k] = hilfe[i++];
            }
        }
    }
    public static void sort(Studierende[] a, Studierende[] hilfe, int vorne, int hinten){
        if(hinten <= vorne) return;
        int mitte = vorne + (hinten-vorne)/2;
        sort(a,hilfe,vorne,mitte);
        sort(a, hilfe, mitte+1, hinten);

        merge(a,hilfe,vorne,mitte,hinten);
    }
}
