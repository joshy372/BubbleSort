public class BubbleSortExample {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp;
        boolean swapped;
        for(int i=0; i < n; i++){
            swapped = false;
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }
    }
}

