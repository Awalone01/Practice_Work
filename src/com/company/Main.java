package com.company;

public class Main {

    public static void main(String[] args) {
        String alphabet = "a b c d";
        String user = "Alex|qwerty@mail.ru";

        String[] splitUser = user.split("\\|");
        String[] splitAlphabet = alphabet.split(" ", 2);

        for (String word : splitAlphabet) {
            System.out.println(word);
        }

        for (String word : splitUser) {
            System.out.println(word);
        }
    }
}
