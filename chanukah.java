import java.io.*;
import java.util.*;

public class chanukah {
    public static void main(String[] args) throws Exception {
        BufferedReader inpt = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter outpt = new BufferedWriter(new OutputStreamWriter(System.out));

        int cases = Integer.parseInt(inpt.readLine());
        while (cases-- > 0) {
            String[] tokens = inpt.readLine().split(" ");
            int num = Integer.parseInt(tokens[1]);
            outpt.write(tokens[0] + " " + (num * (num + 1) / 2 + num) + "\n");
        }

        inpt.close();
        outpt.close();
    }
}