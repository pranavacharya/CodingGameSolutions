import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int speed = in.nextInt();
        int lightCount = in.nextInt();
        int answer = 0;
        
        int [][] lights = new int[lightCount][2];
        for (int i = 0; i < lightCount; i++) {
            lights[i][0] = in.nextInt();
            lights[i][1] = in.nextInt();
        }
        for (int i = speed; i > 0; i--) {
            boolean validSpeed = false;
            for (int j = 0; j < lightCount; j++) {
                int dist = lights[j][0];
                int time = (dist *18) / (i * 5);
                if ((time /lights[j][1]) %2 != 0) {
                    validSpeed = false;
                    break;
                }
                validSpeed = true;
            }
            if (validSpeed) {
                answer = i;
                break;
            }
        }    
        System.out.println(answer);
    }
}
