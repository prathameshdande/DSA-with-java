import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // for(int i = 0; i <= arr.length-1; i++){
        //     System.out.println(arr[i]);
        // }

        // for(int val:arr){
        //     System.out.println(val);
        // }
        // for(int i = 0; i < arr.length; i++){
        //     System.out.println("Provide value for the index "+i);
        //     arr[i]  = sc.nextInt();
        // }
        // System.out.println();
        // for(int val:arr){
        //     System.out.println(val);
        // }

        //print maximum element from the array
        // int max = Integer.MIN_VALUE;
        //  for(int i = 0; i < arr.length; i++){
        //     System.out.println("Provide value for the index "+i);
        //     arr[i]  = sc.nextInt();
            
        //     if(arr[i] > max){
        //         max = arr[i];
        //     }
        // }

        // System.out.println("The Multiplication of array elements is "+max);

        //find the minimum value inside the array

        // int min = Integer.MAX_VALUE;
        // for(int i = 0; i < arr.length; i++){
        //     System.out.println("Provide value for the index "+i);
        //     arr[i]  = sc.nextInt();
        //     if(arr[i] < min){
        //         min = arr[i];
        //     }
        // }
        // System.out.println("The minimum element from the array: "+min);


        //2D array 
        // int[][]arr = {
        //     {2,3},{5,4},{7,8}
        // };

        // int rowLength = arr.length;
        // int colLength = arr[0].length; // for fix length

        // for(int rowIndex = 0; rowIndex < rowLength; rowIndex++){
        //     for(int colIndex = 0; colIndex < colLength; colIndex++){
        //         System.out.print(arr[rowIndex][colIndex]+" ");
        //     }
        //     System.out.println();
        // }


        // int[][]arr = {
        //     {2,3,3,5,6},
        //     {5,4,7,3},
        //     {7,8,7,5}
        // };

        // int rowLength = arr.length;

        // for(int rowIndex = 0; rowIndex < rowLength; rowIndex++){
        //     // jsa mi new row la alo ts mi tya row chi length find krnar te ashi
        //     for(int colIndex = 0; colIndex < arr[rowIndex].length; colIndex++){
        //         System.out.print(arr[rowIndex][colIndex]+" ");
        //     }
        //     System.out.println();
        // }

        //Addition of 2d arrays

        // int[][]arr = new int[3][3];
        // int sum = 0;
        // for(int rowIndex = 0; rowIndex < arr.length; rowIndex++){
        //     for(int colIndex = 0; colIndex < arr[rowIndex].length; colIndex++){
        //         System.out.println("Enter element for the index " +rowIndex+" "+colIndex+ " : ");
        //         arr[rowIndex][colIndex] = sc.nextInt();
        //         sum += arr[rowIndex][colIndex];
        //     }
            
        //     System.out.println();
        // }

        // for(int rowIndex = 0; rowIndex < arr.length; rowIndex++){
        //     // jsa mi new row la alo ts mi tya row chi length find krnar te ashi
        //     for(int colIndex = 0; colIndex < arr[rowIndex].length; colIndex++){
        //         System.out.print(arr[rowIndex][colIndex]+" ");
                
        //     }
        //     System.out.println();
        // }
        // System.out.print(sum);


        // int[][]arr = new int[3][3];
        // int mul = 1;
        // for(int rowIndex = 0; rowIndex < arr.length; rowIndex++){
        //     for(int colIndex = 0; colIndex < arr[rowIndex].length; colIndex++){
        //         System.out.println("Enter element for the index " +rowIndex+" "+colIndex+ " : ");
        //         int value = arr[rowIndex][colIndex] = sc.nextInt();
        //         mul *= value;
        //     }
            
        //     System.out.println();
        // }

        // System.out.print("Multiplication is : "+mul);


        //find max value from 2d array
        //  int[][]arr = new int[3][3];
        // int max = Integer.MIN_VALUE;
        // for(int i = 0; i < arr.length; i++){
        //     for(int j = 0; j < arr[i].length; j++){
        //         System.out.println("Enter element for the index " +i+" "+j+ " : ");
        //         int value = arr[i][j] = sc.nextInt();
        //         if(value > max){
        //             max = value;
        //         }
        //     }
            
        //     System.out.println();
        // }

        // System.out.print("Maximum value is  : "+max);

        //find min value from 2d array
        int[][]arr = new int[3][3];
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.println("Enter element for the index " +i+" "+j+ " : ");
                int value = arr[i][j] = sc.nextInt();
                if(value < min){
                    min = value;
                }
            }
            
            System.out.println();
        }

        System.out.print("Minimum value  is : "+min);
    }
}
