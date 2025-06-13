public class BubbleSortExample {

    static void bubbleSort(int[] numbers) {
        int n = numbers.length;
        int temp;
        boolean swapped;

        for(int i=0; i < n; i++){
            swapped = false;
            for(int j=1; j < (n-i); j++){
                if(numbers[j-1] > numbers[j]){
                    //swap elements
                    temp = numbers[j-1];
                    numbers[j-1] = numbers[j];
                    numbers[j] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }
    }
}

