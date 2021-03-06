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

  public static void selectionSort(int[] data){
    int min = data[0];
    int starting = 0;
    int temp = 0;
    int index = 0;
    while(starting < data.length){
      min = data[starting];
      for(int i = starting;i < data.length;i++){
        if(data[i] < min){
          min = data[i];
        }
      }
      for(int i = starting;i < data.length;i++){
        if(data[i] == min){
          index = i;
        }
      }
      temp = data[starting];
      data[starting] = min;
      data[index] = temp;
      starting++;
    }
  }

  public static void insertionSort(int[] data){
    int temp = 0;
    for(int i = 0;i < data.length;i++){
      for(int j = 0;j < i;j++){
        if(data[i] < data[j]){
          temp = data[i];
        for(int k = i - 1;k >= j;k--){
          data[k + 1] = data[k];
        }
        data[j] = temp;
        temp = 0;
        }
      }
    }
  }
}
