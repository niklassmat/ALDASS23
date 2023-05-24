import java.util.Arrays;

public class Quicksort {
    private static int teile(String[] a, int vorne, int hinten){
        int i = vorne;
        int j = hinten+1;

        while (true){
            while(a[--j].compareTo(a[vorne])>0) {
                if (j == vorne) {
                    break;
                }
            }
            while (a[++i].compareTo(a[vorne])<0){
                if (i == hinten){
                    break;
                }
            }
            if(i>=j){
                System.out.println("Break erfüllt"+ "i= "+i+" j="+j);
                break;
            }
            System.out.println(Arrays.toString(a)+ " i: " + i + " j: " + j);
            exchange(a,i,j);
        }
        System.out.println(Arrays.toString(a)+ " vorne: " + vorne + " j: " + j);
        exchange(a, vorne, j);
        return j;
        }


    private static void exchange(String[] a, int i, int j){
        String temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static void sort(String[] a, int vorne, int hinten){
        if(hinten <= vorne) {
            return;
        }
        int j = teile(a,vorne, hinten);
        sort(a, vorne, j-1);
        sort(a, j+1,hinten);
    }

    public static void sort(String[] a){
        sort(a,0, a.length-1);
    }
    }


