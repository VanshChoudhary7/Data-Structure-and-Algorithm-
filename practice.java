public class practice {
    public static void main(String arg[]) {
        int [] arr = {42,7,19,23,5,31,16,11};
        int len = arr.length;


        // -------------- BUBBLE SORT ----------------
        // for(int i = 0; i < len -1; i++) {
        //     boolean swapped = false;
        //     for(int j = 0; j < len-i-1; j++) {
        //         if(arr[j] > arr[j+1]) {
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //             swapped = true;
        //         }
        //     }

        //     if(!swapped) break;
        //     System.out.println("first Pass Completed." + i);
        //     for(int k = 0 ; k < len ; k++) {
        //         System.out.print(arr[k] + "  ");
        //     }
        //     System.out.println();
        // }
        //-------------------------------------------------------



        // -------------- SELECTION SORT -------------------
        for(int i = 0; i < len-1; i++) {
            int min = i;
            for(int j = i+1; j < len; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

            System.out.println("Pass is Completed  : " +  i);
            for(int k = 0; k < len; k++) {
                System.out.print(arr[k] + "  ");
            }
            System.out.println();
        }
    }
}