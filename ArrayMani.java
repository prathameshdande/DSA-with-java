import java.util.Arrays;
import java.util.HashMap;

class ArrayMani {
    static void reverseArray(int[] arr) {

        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        for (int m : arr) {
            System.out.print(m + " ");
        }
    }

    static void shiftBy1(int[] arr) {
        int n = arr.length;
        int temp = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1]; // reversing technique
        }
        arr[0] = temp;
        for (int m : arr) {
            System.out.print(m + " ");
        }
    }

    static void printAlternate(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i <= j) {
            if (i == j) {
                System.out.print(arr[i] + " ");
                return;
            } else {
                System.out.print(arr[i] + " ");
                i++;
                System.out.print(arr[j] + " ");
                j--;
            }
        }
    }

    static void rearrange(int arr[]) {
        int n = arr.length;
        if (n <= 1)
            return;

        Arrays.sort(arr);

        long max_element = (long) arr[n - 1] + 1;

        int max_idx = n - 1;
        int min_idx = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arr[i] += (arr[max_idx] % max_element) * max_element;
                max_idx--;
            } else {
                arr[i] += (arr[min_idx] % max_element) * max_element;
                min_idx++;
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] = (int) (arr[i] / max_element);
        }
    }

    static int getMode(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int maxFreq = -1;
        int maxFreqKeyKiFreq = -1;
        for(int key: freq.keySet()){
            int currentKey = key;
            int currentKeyKiFreq = freq.get(key);
            if(currentKeyKiFreq > maxFreq){
                maxFreq = currentKeyKiFreq;
                maxFreqKeyKiFreq = currentKey;
            }
        }
        return maxFreqKeyKiFreq;
    }


    static int[] highestAndLowestFrequency(int[] arr){
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int num : arr){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }

        int highestFreq = Integer.MIN_VALUE;
        int highestNum = -1;
        for(int key : freq.keySet()){
            int currentKey = key;
            int currentFreq = freq.get(key);
            if(currentFreq > highestFreq){
                highestFreq = currentFreq;
                highestNum = currentKey;
            }
        }

        int lowestFreq = Integer.MAX_VALUE;
        int lowestNum = -1;
        for(int key : freq.keySet()){
            int currentKey = key;
            int currentFreq = freq.get(key);
            if(currentFreq < lowestFreq){
                lowestFreq = currentFreq;
                lowestNum = currentKey;
            }
        }

        int ans[] = {highestFreq, lowestFreq};
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 64, 24, 26, 76 };
        int[] arr2 = {1,1,1,1,3,3,3,4,4,4,5,5,6,6,6,6,6};

        int ans[] = highestAndLowestFrequency(arr2);
        System.out.println("Highest frequency: "+ans[0]);
        System.out.println("Lowest frequency: "+ans[1]);


        // int ar = getMode(arr2);
        // System.out.println(ar);
        // shiftBy1(arr);
        // printAlternate(arr);
        // rearrange(arr);
        // for (int m : arr) {
        //     System.out.print(m + " ");
        // }
    }
}