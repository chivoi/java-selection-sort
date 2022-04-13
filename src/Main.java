import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Integer[] array = {46, 5, 34, 23, 56, 7, 30};
    System.out.print("All sorted: ");
    selectionSort(array);
  }

  public static int findIndexOfSmallest(Integer[] array) {
    int smallest = array[0];
    for (int element:array) {
      if (element < smallest) {smallest = element;}
    }
    return Arrays.asList(array).indexOf(smallest);
  }

  public static void selectionSort(Integer[] array){

    // base case - if there is one element in array, stop iterating
    if (array.length == 1) {
      System.out.println(array[0]);
      return;
    }

    // if there are more elements in an array, first find the smallest index
    int indexOfSmallest = findIndexOfSmallest(array);

    // if it's not already first in array, put it in the beginning
    if (indexOfSmallest != 0) {
      // a very silly way to swap something :/
      int temp = array[0];
      array[0] = array[indexOfSmallest];
      array[indexOfSmallest] = temp;
    }

    System.out.print(array[0] + " ");
    selectionSort(Arrays.copyOfRange(array, 1, array.length));
  }
}
