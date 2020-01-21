import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int C = in.nextInt();
        int[] budget = new int[N];
        int[] contri = new int[N];
        int[][] participants = new int[2][N];
        Arrays.fill(contri,0);
        for (int i = 0; i < N; i++) {
            budget[i] = in.nextInt();
        }
        Arrays.sort(budget);
        participants[0] = budget;
        participants[1] = contri;
        int total = 0;
        while (total < C) {
            boolean isContributed = false;
            for (int j = 0; j < N; j++) {
                if(participants[0][j] > participants[1][j] && total <C ) {
                    participants[1][j]++;
                    isContributed = true;
                    total++;
                }
            }
            if(!isContributed) {
                break; 
            }
        }
        if (total != C) {
            System.out.println("IMPOSSIBLE");
        }
        else {
            contri = participants[1];
            Arrays.sort(contri);
            for (int i = 0; i < N; i++) {
                System.out.println(contri[i]);
            }
        }
    }
}
