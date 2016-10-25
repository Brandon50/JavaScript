
import java.util.Arrays;
class Array2 {
    public static void printArrya(int[] iarray) {
       int length = iarray.length;
       int i;
        for (i = 0; i < length; i++){
            System.out.print(iarray[i]);
            system.out.print(" . ");
      }
   }

    public static void main (String a[]){
        int i;
        int[] ia ;ia = new int[21];

            ia[0] = 7 ; ia[1] = -7; ia[2] = 4; ia[3] = -4;
            ia[4] = 2; ia[5] = -1; ia[6] = 2; ia[7] = -6;
            ia[8] = -3; ia[9] = 1; ia[10] = -5; ia[11] = -8;
            ia[12] = -9; ia[13] = -10; ia[14] = 5; ia[15] = 3;
            ia[16] = 6; ia[17] = 8; ia[18] = 0; ia[19] = 9;

            //printArrya
            // shortarray
            printArrya(ia);
            Arrays.short(ia);
            printArrya(ia);
