import com.sun.jdi.Value;
import java.util.Scanner;

public class Main {

    public static int[] insertionSort(int[] array) {
        int count = 0;

        /* iterating over elements in the unsorted part */
        for (int i = 1; i < array.length; i++) {
          //  int elem = array[i]; // take the next element
            int j = i - 1;

            /* find a suitable position to insert and shift elements to the right */
            while (j >= 0 && array[j] < array[i]) {
                count++;
                array[j + 1] = array[j];  // shifting
                j--;
            }
            array[j + 1] = array[i];

            }

        System.out.println(count);
        return array;
    }
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int length = Integer.parseInt(scn.next());
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = Integer.parseInt(scn.next());
        }

        int [] result = insertionSort(array);

      //  for (int item : result) {
              //  System.out.print(item + " ");
      //  }
    }
}
