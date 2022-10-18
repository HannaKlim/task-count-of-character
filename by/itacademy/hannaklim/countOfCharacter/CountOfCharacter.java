package by.itacademy.hannaklim.countOfCharacter;

import java.util.Arrays;

public class CountOfCharacter {
    public static void main(String[] args) {
        String str = "abagggggggfd";
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String s = String.valueOf(chars);
        for (int i = 0; i < chars.length; ) {
            System.out.println("Количество символов " + chars[i] + " равно " + (s.lastIndexOf(chars[i]) - s.indexOf(chars[i]) + 1));
            i += (s.lastIndexOf(chars[i]) - s.indexOf(chars[i]) + 1);
        }
    }
}
