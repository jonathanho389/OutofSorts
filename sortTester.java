import java.util.*;
public class sortTester{
  public static void main(String[] args) {
    Random rng = new Random();
    int[] pain = {5,4,3,2,1};
    int[] pain2 = {5,5,3,2,1};
    int[] pain3 = {};
    int[] pain4 = new int[5];
    for(int i = 0;i < 5;i++){
      pain4[i] = rng.nextInt() % 1000;
    }
    int[] pain5 = {5,4,3,2,1};
    Sorts.bubbleSort(pain);
    Sorts.bubbleSort(pain2);
    Sorts.bubbleSort(pain3);
    System.out.println(Arrays.toString(pain));
    System.out.println(Arrays.toString(pain2));
    System.out.println(Arrays.toString(pain3));
    System.out.println(Arrays.toString(pain4));
    Sorts.bubbleSort(pain4);
    System.out.println(Arrays.toString(pain4));

    System.out.println(Sorts.selectionSort(pain5));
    System.out.println(Arrays.toString(pain5));
  }
}
