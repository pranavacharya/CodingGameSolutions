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
        int N = in.nextInt(); // Number of elements which make up the association table.
        int Q = in.nextInt(); // Number Q of file names to be analyzed.
        HashMap<String, String> minetable = new HashMap<String, String>();
        for (int i = 0; i < N; i++) {
            minetable.put(in.next().toLowerCase(),in.next());
        }
        in.nextLine();
        String MIMEType = "UNKNOWN";
        for (int i = 0; i < Q; i++) {
            String FNAME = in.nextLine(); // One file name per line.
            if(FNAME.lastIndexOf(".") == -1){
                System.out.println("UNKNOWN");
                continue;
            }
            FNAME = FNAME.substring(FNAME.lastIndexOf(".") + 1);
            // System.err.println("FNAME : " + FNAME);
            String value = minetable.get(FNAME.toLowerCase());
            // System.err.println("VALUE : " + value);
            if(value == null){
                System.out.println("UNKNOWN");
            }
            else {
                MIMEType =value;
                System.out.println(MIMEType);
            }
        }
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
        // For each of the Q filenames, display on a line the corresponding MIME type. If there is no corresponding type, then display UNKNOWN.
    }
}
