package by.it.petrov.jd01_06;

import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA1 {
    public static void main(String[] args) {
        StringBuilder dyText = new StringBuilder(Poem.text);
        Pattern pattern = Pattern.compile("[а-яА-ЯЁё]{4,}");
        Matcher matcher = pattern.matcher(Poem.text);
        while(matcher.find()){
            int start = matcher.start();
            int end = matcher.end();
            dyText.setCharAt(start + 3, '#');
            if(matcher.group().length()>= 7){
                dyText.setCharAt(start + 6, '#');
            }
        }
        System.out.println(dyText);
    }
}

