import java.util.*;
public class ArrayExample {
  public static void main(String[] args) {
    int[] array1 = {1,2,3};
    int[] array2 = {3,4};
    int[] array3 = array1;
    int[] array4 = array2;
    System.out.println(Arrays.toString(array1)+Arrays.toString(array2));
    array3[0] = 5;
    array4[1] = 7;
    System.out.println(Arrays.toString(array1)+Arrays.toString(array2));
    array1 = array4;
    System.out.println(Arrays.toString(array1)+Arrays.toString(array2));
    array2str();
    printarray();
    swap();
  }
  public static void array2str() {
    int [] list = {1, 2, 3, 4, 5};
    System.out.println(Arrays.toString(list));
  }
  public static void printarray() {
    int [] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22};
    System.out.print("[");
    for (int i=0; i < list.length - 1; i++) {
        if (i > 0 && i % 10 == 0) {
            System.out.print("\n");
            System.out.print(list[i] + ", ");
        }
        else {
            System.out.print(list[i] + ", ");
        }
    }
    System.out.print(list[list.length-1] + "]");
    System.out.print("\n");
  }
  public static void swap() {
    int [] list = {1, 2, 3, 4, 5};
    for (int i=0; i <  (int) list.length / 2 ; i++) {
        int temp = list[i];
        list[i] = list[list.length - i - 1];
        list[list.length - i - 1] = temp;
    }
    System.out.println(Arrays.toString(list));
  }
}