package lesson9;

import java.io.*;

public class TextFormater {

    public String process(String scr, String dest) {

        StringBuilder builder = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(scr)); BufferedWriter writer = new BufferedWriter(new FileWriter(dest))) {
            String stringBuilder = "";
            String line;
            while ((line = reader.readLine()) != null) {
                builder.append(line);
            }


        } catch (IOException e) {
            System.out.println(e);
             }
        return builder.toString();
    }

    public static int countWords (String line){
        String [] words = line.split(" ");
        int counter=0;
        for (int i = 0;i<words.length;i++){
            counter++;
        }
        return counter;
    }
    public static boolean isPalindrom (String str) {
        String [] words = str.split(" ");

            for (int i = 0;i<words.length;i++){
            StringBuilder builder = new StringBuilder(words[i]);
            if (builder.reverse().toString().equals(words[i])) {
                return true;
            }
        }
        return false;
    }
}
