// Count number of odd digits in a number
// Easy
// Company
// You are given an integer n. You need to return the number of odd digits present in the number.
// The number will have no leading zeroes, except when the number is 0 itself.
// Example 1
// Input: n = 5
// Output: 1
// Explanation: 5 is an odd digit.

import java.util.Scanner;

public class CountOddDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        while(n>0){
            int lastdigit=n%10;
            if(lastdigit %2!=0){
                count =count+1;
            }
            n=n/10;
        }
       System.out.println(count);
        
    }
}
