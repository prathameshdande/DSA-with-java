import java.util.Scanner;

public class Strings {

    static int getVowelsCount(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }

    static String getReverseString(String str){
        String reverse = "";
        int n = str.length();
        for(int i=n-1; i >= 0; i--){
            char ch = str.charAt(i);
            reverse += ch;
        }
        return reverse;
    }

    static String getPalindromeString(String str){
        String original = str;
        String reverse = "";
        int n = str.length();
        for(int i=n-1; i >= 0; i--){
            char ch = str.charAt(i);
            reverse += ch;
        }

        if(original.equalsIgnoreCase(reverse)){
            System.out.println(original +" this is palindrome string : "Math);
        }else{
            System.out.println("This is not palindrome string");
        }
        return reverse;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String str = "Prathamesh Dande is the best";
        // String strs = "prathamesh";
        // int num = 5698745;
        // String str1 = String.valueOf(num);

        // // if(str.equalsIgnoreCase(strs)){
        // //     System.out.println("True");
        // // }else{
        // //     System.out.println("False");
        // // }

        // // System.out.println("Enter the line do you want to print : ");
        // // String str = sc.nextLine();
        // // System.out.println("The line is : "+str);
        // // System.out.println("Enter the word to you want to print : ");
        // // String str1 = sc.next();
        // // System.out.println("The word is: "+str1);

        // System.out.println(str.length());
        // System.out.println(str.charAt(2));
        // System.out.println(str.substring(1,5));
        // System.out.println(str.contains("best"));
        // // System.out.println(str.split(4));
        // System.out.println(str1+1);
        // System.out.println(num+1);
        // System.out.println(str.startsWith("P"));
        // System.out.println(str.endsWith("t"));
        // String name = "Pratham";
        // char[] crr = name.toCharArray();

        // for(char ch: crr){
        //     System.out.println("Character is : "+ch);
        // }

        // String input = "My,Name,is,prathamesh,dande";
        // String[] words = input.split(",");
        // for(String ch: words){
        //     System.out.println("The word is: "+ch);
        // }
        // System.out.println(str.replace("a", "p"));

        // String name = sc.next();
        // for(int i = 0; i < name.length(); i++){
        //     System.out.println("Each char from "+name+" is: "+name.charAt(i));
        // }
        // int count = 0;
        // for(char val : name.toCharArray()){
        //     count++;
        // }
        // System.out.println(count);
        System.out.println(getVowelsCount("Prathamesh"));
        System.out.println(getReverseString("Prathamesh"));
        System.out.println(getPalindromeString("Madam"));
    }
}
