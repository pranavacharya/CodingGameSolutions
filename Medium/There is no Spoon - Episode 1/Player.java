import java.util.*;
import java.io.*;
import java.math.*;

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int width = in.nextInt();
        int height = in.nextInt();
        char[][] grid = new char[height][width];
        if (in.hasNextLine()) {
            in.nextLine();
        }
        for (int i = 0; i < height; i++) {
            String line = in.nextLine(); // width characters, each either 0 or .
            grid[i] = line.toCharArray();
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int x1,y1,x2,y2,x3,y3;
                x1 = y1 = x2 = y2 = x3 = y3 = -1;
                if(grid[i][j] == '0') {
                    x1 = j;
                    y1 = i;
                    int temp = x1 + 1;
                    while (temp < width) {
                        if(grid[i][temp] == '0') {
                            x2 = temp;
                            y2 = i;
                            break;
                        }
                        temp ++;
                    }
                    temp = y1 + 1;
                    while (temp < height) {
                        if(grid[temp][j] == '0') {
                            x3 = j;
                            y3 = temp;
                            break;
                        }
                        temp ++;
                    }
                    System.out.println(x1 +" "+ y1 +" "+ x2 +" "+ y2 +" "+ x3 +" "+ y3);
                }
            }
        }        
    }
}
