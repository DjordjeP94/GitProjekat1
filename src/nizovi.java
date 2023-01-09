import java.lang.reflect.Array;
import java.util.Arrays;

public class nizovi {


    public static void main(String[] args) {

      int niz [] = new int[] {55,8,9,10,56,78};

 int minimum = niz[0];
        for (int i = 0; i < 6; i++) {
            if (niz[i]<minimum){
                minimum = niz[i];
                System.out.println(minimum);
            }
        }

        int maximum = niz[0];
        for (int i = 0; i < 6; i++) {

            if (niz[i]>maximum){
                maximum = niz[i];
                System.out.println(maximum);
            }
        }
//
        System.out.println(Arrays.toString(niz));

        String pojmovi[] = new String[]{"Bicycle", "Car", "Mobil phone"};
        String nazivi[] = new String[] {"BMX", "Reno", "I-phone"};
        double cene[] = new double[] {100.0, 150.55, 500.0};

        for (int i = 0; i < 3; i++) {
            System.out.println(nazivi[i] + " is type " + pojmovi[i] + " and it costs " + cene[i]);
        }
    }
//
//      foreach petlja
//        for (int i:niz) {
//            System.out.println(i);
//        }





    }


}
