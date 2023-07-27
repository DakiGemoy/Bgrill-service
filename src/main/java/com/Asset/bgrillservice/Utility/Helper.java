package com.Asset.bgrillservice.Utility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Helper {

    private final static Locale lokasi = new Locale("id", "ID");

    public static String convertDateTime(LocalDateTime time){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyy HH:mm", lokasi);

        String balik = formatter.format(time);
        return balik;
    }

}
