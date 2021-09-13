package lesson9;

import lesson11.FileHandler;

public class TextFormaterApplication {
    public static void main(String[] args) {
        //String text = "Hello world. How are you. I learn Java. True false Java class isPalindrom madam. Lol";
        TextFormater fileHandler = new TextFormater();
        String text = fileHandler.process("file.txt","output.txt");


        String[] cutText = text.split("\\.");

        for (int i=0; i< cutText.length;i++){
            if (TextFormater.countWords(cutText[i])>=3&&TextFormater.countWords(cutText[i])<=5){
                System.out.println(cutText[i]);
            } else if (TextFormater.isPalindrom(cutText[i])){
                System.out.println(cutText[i]);
            }
        }

    }

}
