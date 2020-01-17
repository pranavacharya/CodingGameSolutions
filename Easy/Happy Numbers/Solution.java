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
        Set <String> set = new HashSet<String>();
        for (int i = 0; i < N; i++) {
            String x = in.nextLine();
            String og = x;
            int temp;
            set.clear();
            set.add(x);
            while (!x.equals("1")) {
                temp = 0;
                for (int c : x.toCharArray()) {
                    temp += (c - 48) *(c -48);
                    x = temp + "";
                }
                if(set.contains(x))
                    break;
                else
                    set.add(x);                
            }
            if(x.equals("1")) {
                System.out.println(og + " :)");
            }
            else
                System.out.println(og + " :(");
        }
    }
}
