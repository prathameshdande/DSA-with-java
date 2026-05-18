public class ArrayProblem {
    static void avgArray(int[] arr){
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        int size = arr.length;
        double avg = (double) sum / size;
        System.out.println("Average: "+ avg);
    }

    static int[] multiplyByKth( int[] arr, int k){
        int size = arr.length;
        int newArray[] = new int[size];
        for(int i = 0; i<size; i++){
            int element = arr[i];
            int newElement = element * k;
            newArray[i] = newElement; 
        }

        return newArray;
    }

    //search for element in an array
    static boolean searchElement(int[] arr, int target){
        for(int i = 0; i <arr.length; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }

    //find the max element from the array
    static int maxElement(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            // if(arr[i]>max){
            //     max = arr[i];
            // }
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    // sum of +ve and -ve number
    // static int[] sumOfPosNegNumber(int[] arr){
    //     int pos = 0;
    //     int neg = 0;
    //     for(int i = 0; i < arr.length; i++){
    //         if(arr[i] > 0){
    //             pos += arr[i];
    //         }else{
    //             neg -= arr[i];
    //         }
    //     }
    //     int sum[] = {pos, -neg};
    //     return sum;
    // }

    //count the number of 0's and 1's
    static int[] countZerosAndOnes(int[] arr){
        int zeros = 0;
        int ones = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                zeros ++;
            }else if(arr[i] == 1){
                ones ++;
            }
        }
        int sum[] = {zeros, ones};
        return sum;
    }

    //find the unsorted element from an array
    static int unsortedElement(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            if(arr[i+1] <= arr[i]){     //number jar motha naselch tar return krelch
                return arr[i];
            }
        }
        return -1;
    }
    

    public static void main(String[] args) {
        // int[] arr = {2,-2,6,-2,8,-6,9,23};
        // int[] arr = {1,1,0,0,1,1,1,1,0,0,0,1};
        int[] arr = {1,2,3,42,5,6,7,8};
        // avgArray(arr);

        System.out.println(unsortedElement(arr));

        // int sum[] = countZerosAndOnes(arr);
        // System.out.println("Zeros sum : "+sum[0]);
        // System.out.println("Ones sum : "+sum[1]);

    //    int newArray[]= multiplyByKth(arr, 10);
    //    for(int i = 0; i<newArray.length; i++){
    //     System.out.print(newArray[i]+" ");
    //    }

    //    System.out.println(searchElement(arr, 10));
    // System.out.println("Maximum : "+maxElement(arr));

}
    
}
