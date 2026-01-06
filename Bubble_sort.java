public class Bubble_sort {
    public static void sort() {

        int[] arr = Data.arr;
        int len = Data.len;

        int i,j;

        for(i = 0; i < len; i++) {
            boolean swapped = false;
            for(j = 0; j < len - i-1; j++) {
                if(arr[j] > arr[j+1] ) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }
}