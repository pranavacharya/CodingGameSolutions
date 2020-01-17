import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        for (int i = 0; i < N; i++) {
            BigInteger x = new BigInteger(in.nextLine());
            BigInteger temp = x;
            BigInteger sum = new BigInteger("0");
            boolean isHappy = false;
            Set<BigInteger> set = new HashSet<BigInteger>();
            set.add(temp);
            while ( sum.compareTo(new BigInteger("1"))!= 0) {
                sum = new BigInteger("0");
                while( temp.compareTo(new BigInteger("0")) == 1) {
                    sum = sum.add(temp.mod(new BigInteger("10")).pow(2));
                    temp = temp.divide(new BigInteger("10"));     
                }
                if(!set.contains(sum)) {
                    temp = sum;
                    set.add(sum);
                }
                else {
                    break;
                }
            }
            if( sum.compareTo(new BigInteger("1")) == 0 ) {
                isHappy = true;
            }
            if (isHappy) {
                System.out.println(x + " :)");
            }
            else {
                System.out.println(x + " :(");
            }   
        }
    }
}
