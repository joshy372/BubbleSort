public class BubbleSortExample {

    static <T extends Comparable<T>> void bubbleSort(T[] numbers) {
        int n = numbers.length;
        T temp;
        boolean swapped;

        for(int i=0; i < n; i++){
            swapped = false;
            for(int j=1; j < (n-i); j++){
                if(numbers[j-1].compareTo(numbers[j]) > 0){
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

