public class Maths{

    // static void digitsNumber(int number){
    //     while(number != 0){
    //         int digit = number % 10;
    //         System.out.println(digit);
    //         number = number / 10;
    //     }
    //}


    // static int countDigits(int number){
    //     int count = 0;
    //     while(number != 0){
    //         int digit = number % 10;
    //         count++;
    //         number = number / 10;
    //     }
    //     return count;
    // }

    static int sumOfDigits(int number){
        int sum = 0;
        while(number != 0){
            int digit = number % 10;
            sum += digit;
            number = number / 10;
        }
        return sum;
    }

    // static int reverseNum(int number){
    //     int revNum = 0;
    //     while(number != 0){
    //         int digit = number % 10;
    //         revNum = revNum*10 + digit;
    //         number = number/10;
    //     }
    //     return revNum;
    // }

    static int palindromeNum(int number){
        int revNum = 0;
        while(number != 0){
            int digit = number % 10;
            revNum = revNum*10 + digit;
            number = number/10;
        }
       return revNum;
    }

    static boolean isPrime(int number){

        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0){
                return false;
            }
        }

        // for(int i = 2; i <= number-1; i++){
        //     if(number%i == 0){
        //         return false;
        //     }
        // }
        return true;
    }

    static int gcdOfNumber(int a, int b){
        while(b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }

    static int lcmOfNumber(int a, int b){
        int gcd = gcdOfNumber(a, b);
       int lcm = a*b;
       int ans = lcm/gcd;
       return ans;
    }

    public static void main(String[] args) {
    //    System.out.println("The count is : ");
        // digitsNumber(524863);
        // System.out.println(countDigits(52146325));
        // System.out.println("The sum of digits is : "+sumOfDigits(25489632));
        // int num = 2165612;
        // int revNum = palindromeNum(num);
        // if(num == revNum){
        //     System.out.println(num+" is palindrome number");
        // }else{
        //     System.out.println(num+" is not palindrome number");
        // }
        int num = 9;
        System.out.println(isPrime(num));
        System.out.println(gcdOfNumber(32,16));
        System.out.println(lcmOfNumber(12, 18));
    }
}