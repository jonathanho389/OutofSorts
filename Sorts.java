public class Sorts{
  public static void bubbleSort(int[] data){
    int original = 0;
    for(int i = 0;i < data.length;i++){
      for(int j = i + 1;j < data.length;j++){
        if(data[i] > data[j]){
          original = data[i];
          data[i] = data[j];
          data[j] = original;
        }
      }
    }
  }
}
