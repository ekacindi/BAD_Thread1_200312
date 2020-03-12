//22018198841 - EKA CINDI FEBRU ANITA SUGIYANTO
package forumbad1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ForumBAD1 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        ArrayList arrayList = new ArrayList();
        int array[] = { -4, -6, -1, 0, 7, 4, -2, 1, -5, 3, -3, 2, 5, -7, 6};
                
        System.out.println("Menu Array:");
        System.out.println("1. Mengurutkan dan Mencari Data pada Array\n" +
                           "2. Mengurutkan dan Menyisipkan Elemen pada Array\n" +
                           "3. Batas Atas Array Dua Dimensi\n" +
                           "4. Membalik Array\n" +
                           "5. Menampilkan String dari Array ke Console");
        System.out.print("Masukkan Pilihan : ");
        int choose = input.nextInt();
        
        if(choose == 1){            
            Arrays.sort(array);
            printArray("Sorted array", array);
            int index = Arrays.binarySearch(array, 5);
            System.out.println("\nFound 5 @ " + index);
        }
        else if(choose == 2){
            Arrays.sort(array);
            printArray("Sorted array", array);
            int index = Arrays.binarySearch(array, 8);
            System.out.println("\nDidn't find 8 @ " + index);
            int newIndex = -index - 1;
            array = insertElement(array, 8, newIndex);
            printArray2("With 8 added", array);
        }
        else if(choose == 3){
            String[][] data = new String[30][15];
            System.out.println("Dimension 1: " + data.length);
            System.out.println("Dimension 2: " + data[0].length);
        }
        else if(choose == 4){
            arrayList.add ("1");
            arrayList.add ("2");
            arrayList.add ("3");
            System.out.println("Before Reverse Order: " + arrayList);
            Collections.reverse(arrayList);
            System.out.println("After Reverse Order: " + arrayList);
        }
        else if(choose == 5){
            String[] intro = new String[2];
            intro[0] = "Hallo ...";
            intro[1] = "Nama Saya Eka Cindi dari Kelas TPBA";
            for (int i = 0; i < intro.length; i++){
                System.out.println(intro[i]);
            }
        }
    }   

    private static void printArray(String sorted_array, int[] array) {
       System.out.println(sorted_array
        + ": [length: " + array.length + "]");
        for (int i = 0; i < array.length; i++) {
            if(i != 0){
                System.out.print(", ");
            }
        System.out.print(array[i]); 
        }
    }

    private static int[] insertElement(int original[], int element, int index) {
        int length = original.length;
        int destination[] = new int[length + 1];
        System.arraycopy(original, 0, destination, 0, index);
        destination[index] = element;
        System.arraycopy(original, index, destination, index
        + 1, length - index);
        return destination;
    }

    private static void printArray2(String message, int[] array) {
        System.out.println(message + ": [length: " + array.length + "]");
        for (int i = 0; i < array.length; i++) {
            if (i != 0){
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
    System.out.println();
    }
}
