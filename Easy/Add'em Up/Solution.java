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
        ArrayList<Integer> cards = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            cards.add(in.nextInt());
        }
        int cost = 0;
        while (cards.size() > 1) {
            int sum = 0;
            Collections.sort(cards);
            sum = cards.get(0) + cards.get(1);
            cards.remove(0);
            cards.remove(0);
            cards.add(sum);
            cost = cost + sum;
        }
        // System.err.println(cards);
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
        System.out.println(cost);
    }
}
