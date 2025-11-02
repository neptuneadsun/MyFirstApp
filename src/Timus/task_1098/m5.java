package Timus.task_1098;

import java.io.*;

public class m5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder text = new StringBuilder();
        String line;

        while ((line = br.readLine()) != null && !line.isEmpty()) {
            text.append(line);
        }

        if (text.length() == 0) {
            return;
        }

        int n = 1999;
        int len = text.length();
        int pos = 0;

        while (len > 1) {
            pos = (pos + n - 1) % len;
            text.deleteCharAt(pos);
            len--;
            if (pos == len) pos = 0;
        }

        char last = text.charAt(0);
        if (last == '?') {
            System.out.println("Yes");
        } else if (last == ' ') {
            System.out.println("No");
        } else {
            System.out.println("No comments");
        }
    }
}
