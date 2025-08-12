package com.fidelis.util;

import java.util.regex.Pattern;

public class dateUtil {

     private static final String DATE_REGEX = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";

    // Valida se a string está no formato correto
    public static boolean isValidDate(String date) {
        return Pattern.matches(DATE_REGEX, date);
    }

    // Formata ou manipula a data (se necessário no futuro)
    public static String formatDate(String date) {
        // Aqui você poderia aplicar uma formatação personalizada, se necessário.
        return date; // No momento, só retorna a data como está.
    }

}
