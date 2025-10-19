package Timus.task_2100;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class m2 {
    public static void main(String[] args) {

        String inputFileName = "src/Timus/task_2100/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;

        int mAl = 2;

        try {
            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName));

            String readLine = "";

            int numOfFriends = 0;
            int numOfPairs = 0;

            while ((readLine = bufferedReader.readLine()) != null) {
                if (numOfFriends == 0) {
                    numOfFriends = Integer.parseInt(readLine);
                    continue;
                }
                if (readLine.contains("+")) {
                    numOfPairs++;
                }
            }

            int result;
            int guests = (mAl + numOfFriends + numOfPairs);

            if (guests == 13) {
                result = (guests * 100) + 100;
            }
            else {
                result = guests * 100;
            }

            System.out.println(result);
        }
        catch (IOException exception) {
            exception.printStackTrace();
        }

    }
}
