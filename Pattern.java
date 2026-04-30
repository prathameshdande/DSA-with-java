
class Pattern {
    public static void main(String[] args) {
        // int n = 5;
        // for(int row = 1; row <= n; row++){
        // for(int col = 1; col <= 5; col++){
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // int n = 3;
        // for(int row = 1; row <= n; row++){
        // for(int col = 1; col <= 5; col++){
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // Triangle

        // int n = 5;
        // for(int row = 1; row <= n; row++){
        // for(int col = 1; col <= row; col++){
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // Rhomb

        // int n = 5;
        // for(int row = 1; row <= n; row++){
        // //spaces in triangle and solid square

        // //spaces
        // for(int col = 1; col <= n-row; col++){
        // System.out.print(" ");
        // }

        // //Square
        // for(int col = 1; col <= n; col++){
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // inverted right angle triangle
        // int n = 5;
        // for(int row = 1; row <= n; row++){
        // for(int col = 1; col <= n-row+1; col++){
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // //triangle
        // int n = 5;
        // int num = 0;
        // for(int row = 1; row <= n; row++){
        // for(int col = 1; col <= row; col++){
        // num++;
        // System.out.print(num+" ");
        // }
        // System.out.println();
        // }

        // pyramid

        // int n = 9;
        // for(int row = 1; row <= n; row++){

        // //space
        // for(int col = 1; col <= n-row; col++){
        // System.out.print(" ");
        // }

        // for(int col = 1; col <= 2*row-1; col++){
        // System.out.print("* ");
        // }

        // System.out.println();
        // }

        // //inverted pyramid
        // // int n = 5;
        // for(int row = 1; row <= n; row++){
        // //spaces

        // if(row == 1){
        // continue;
        // }
        // for(int col = 2; col <= row; col++){
        // System.out.print(" ");
        // }

        // //star

        // for(int col = 1; col <= 2*n-2*row+1; col++){
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // OUTPUT:-
        // * * * * * * * * *
        // * * * * * * *
        // * * * * *
        // * * *
        // *

        // Hollow Rectangle
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for(int row = 1; row <= n; row++){
        // for(int col = 1; col <= n; col++){
        // if(row == 1 || row == n || col == 1 || col == n){
        // System.out.print("* ");
        // }else{
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // hollow triangle
        // int n = 10;
        // for(int row = 1; row <= n; row++){
        // if(row == 1 || row == 2 || row == n){
        // for(int col = 1; col <= row; col++){
        // System.out.print("* ");
        // }
        // }else{
        // //1*
        // System.out.print("* ");

        // //(row-2)spaces
        // for(int col = 1; col <= (row-2); col++){
        // System.out.print(" ");
        // }

        // //2*
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // Hollow Pyramid

        // int n = 10;
        // for(int row = 1; row <= n; row++){

        // //spaces
        // for(int col = 1; col <= n-row; col++){
        // System.out.print(" ");
        // }

        // if(row == 1 || row == n){
        // for(int col = 1; col <= 2*row-1; col++){
        // System.out.print("* ");
        // }
        // }else{
        // //1*
        // System.out.print("* ");
        // //2row-3 spaces
        // for(int col = 1; col <= 2*row-3; col++){
        // System.out.print(" ");
        // }

        // //1*
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // //cleaner way
        // for(int row = 1; row <= n; row++){
        // //spaces
        // for(int col = 1; col <= n-row; col++){
        // System.out.print(" ");
        // }

        // for(int col = 1; col <= 2*row-1; col++){
        // if(row == 1 || row == n || col == 1 || col == 2*row-1){
        // System.out.print("* ");
        // }else{
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // diamond shape => upper pyramid and lower pyramid
        // cleaner way

        // int n = 10;
        // //upper
        // for(int row = 1; row <= n; row++){
        // //spaces
        // for(int col = 1; col <= n-row; col++){
        // System.out.print(" ");
        // }

        // //upper
        // for(int col = 1; col <= 2*row-1; col++){
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // //lower
        // for(int row = n-1; row >= 1; row--){
        // //spaces
        // for(int col = 1; col <= n-row; col++){
        // System.out.print(" ");
        // }

        // //lower
        // for(int col = 1; col <= 2*row-1; col++){
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // hollow diamond

        // int n = 10;
        // for(int row = 1; row <= n; row++){

        // //spaces
        // for(int col = 1; col <= n-row; col++){
        // System.out.print(" ");
        // }

        // if(row == 1 ){
        // for(int col = 1; col <= 2*row-1; col++){
        // System.out.print("* ");
        // }
        // }else{
        // //1*
        // System.out.print("* ");
        // //2row-3 spaces
        // for(int col = 1; col <= 2*row-3; col++){
        // System.out.print(" ");
        // }

        // //1*
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // //cleaner way
        // //lower
        // for(int row = n-1; row >= 1; row--){
        // //spaces
        // for(int col = 1; col <= n-row; col++){
        // System.out.print(" ");
        // }

        // for(int col = 1; col <= 2*row-1; col++){
        // if(row == 1 || col == 1 || col == 2*row-1){
        // System.out.print("* ");
        // }else{
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // butterfly shape
        // * *
        // * * * *
        // * * * * * *
        // * * * * * * * *
        // * * * * * * * * * *
        // * * * * * * * * * *
        // * * * * * * * *
        // * * * * * *
        // * * * *
        // * *

        // int n = 5;
        // for(int row = 1; row <= n; row++){
        // for(int col = 1; col <= row; col++){
        // System.out.print("* ");
        // }
        // //spaces
        // for(int col = 1; col <= 2*(n-row); col++){
        // System.out.print(" ");
        // }
        // //star
        // for(int col = 1; col <= row; col++){
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // for(int row = n; row >= 1; row--){
        // for(int col = 1; col <= row; col++){
        // System.out.print("* ");
        // }

        // //spaces
        // for(int col = 1; col <= 2*(n-row); col++){
        // System.out.print(" ");
        // }

        // //star
        // for(int col = 1; col <= row; col++){
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // numerical triangle
        // int n = 5;
        // for(int row = 1; row <= n; row++){
        // for(int col = 1; col <= row; col++){
        // System.out.print(col);
        // }
        // System.out.println();
        // }
        // 1
        // 12
        // 123
        // 1234
        // 12345

        //print this pattern
        // A 
        // A B 
        // A B C 
        // A B C D 
        // A B C D E 
        // int n = 5;
        // for (int row = 1; row <= n; row++) {
        //     for (int col = 1; col <= row; col++) {
        //         int a = col;
        //         int b = ('A' - 1);
        //         int ans = a+b;
        //         char finalAns = (char)ans;
        //         System.out.print(finalAns + " ");
                
        //     }
        //     System.out.println();
        // }

        // int n = 5;
        // for (int row = 1; row <= n; row++) {
        //     for (int col = 1; col <= row; col++) {
        //         int a = col;
        //         int b = ('E' + 1);
        //         int ans = b-a;
        //         char finalAns = (char)ans;
        //         System.out.print(finalAns + " ");
                
        //     }
        //     System.out.println();
        // }

        //print vertical butterfly
            // * * * * * * * * * 
            //   * * * * * * * 
            //     * * * * * 
            //       * * * 
            //         * 
            //       * * * 
            //     * * * * * 
            //   * * * * * * * 
            // * * * * * * * * *         
        // int n = 5;
        // for(int row = 1; row <= n; row++){
        //     //spaces
        //     for(int col = 1; col <= row; col++){
        //         System.out.print("  ");
        //     }
        //     for(int col = 1; col <=  2*n-2*row+1; col++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // //opposite side
        // for(int row = n-1; row >= 1; row--){
        //     //spaces
        //     for(int col = 1; col <= row; col++){
        //         System.out.print("  ");
        //     }
        //     for(int col = 1; col <= 2*n-2*row+1; col++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //number pyramid
            //         1 
            //       1 2 1 
            //     1 2 3 2 1 
            //   1 2 3 4 3 2 1 
            // 1 2 3 4 5 4 3 2 1 
        // int n = 5; 
        // for(int row = 1; row <= n; row++){
        //     //spaces
        //     for(int col = 1; col <= n-row; col++){
        //         System.out.print("  ");
        //     }
        //     for(int col = 1; col <= row; col++){
        //         System.out.print(col+" ");
        //     }
        //     int rowValue = row;
        //     int decrementValue = rowValue-1;

        //     for(int col = 1; col <= row-1; col++){
        //             System.out.print(decrementValue+" ");
        //             decrementValue--;
        //         }
            
        //     System.out.println();

        // }

        //print this
            //         1 
            //       2 2 2 
            //     3 3 3 3 3 
            //   4 4 4 4 4 4 4 
            // 5 5 5 5 5 5 5 5 5 

        // int n = 5;
        // for(int row = 1; row <= n; row++){
        //     for(int col = 1; col <= n-row; col++){
        //         System.out.print("  ");
        //     }

        //     for(int col = 1; col <= 2*row-1; col++){
        //         System.out.print(row+" ");
        //     }
        //     System.out.println();
        // }
    }
}