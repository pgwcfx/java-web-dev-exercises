package org.launchcode.java.demos.lsn1datatypes;

public class Message {

    public static String getMessage(String lang) {

        if (lang.equals("sp")) {
            return "¡Hola, Mundo!";
        } else if (lang.equals("fr")) {
            return "Êtes-vous prêt à apprendre le java? Je suis sûr !!!";
        } else if (lang.equals("en")) {
            return "Welcome to Unit 2!";
        } else {
            return "Hello, World!";
        }
    }
}
