import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt(); // width of the building.
        int H = in.nextInt(); // height of the building.
        int N = in.nextInt(); // maximum number of turns before game over.
        int X0 = in.nextInt();
        int Y0 = in.nextInt();

        int xh = W;
        int yh = H;
        int xl = 0;
        int yl = 0;

        // game loop
        while (true) {
            String bombDir = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)
            
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages..."); 
            if(bombDir.contains("U")){
                yh = Y0;
            }
            if(bombDir.contains("D")){
                yl = Y0;
            }
            if(bombDir.contains("R")){
                xl = X0;
            }
            if(bombDir.contains("L")){
                xh = X0;
            }
            if(bombDir == "U" || bombDir == "D"){
                if(yh>=yl){
                    Y0 = (yh + yl) /2;
                }
            }
            else if (bombDir == "R" || bombDir == "L"){
                if(xh>=xl){
                    X0 = (xh + xl) /2;
                }
            }
            else {
                if(xh>=xl){
                    X0 = (xh + xl) /2;
                }
                if(yh>=yl){
                    Y0 = (yh + yl) /2;
                }
            }

            //System.err.println(X0 + " " + Y0);
            // the location of the next window Batman should jump to.
            System.out.println(X0  + " " + Y0);
        }
    }
}
