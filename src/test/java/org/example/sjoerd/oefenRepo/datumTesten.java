package org.example.sjoerd.oefenRepo;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class datumTesten {

    @Test
    void testLocalDate () {
        LocalDate vandaag = LocalDate.now ();
        System.out.println (vandaag);
        String geformateerdeDatum = vandaag.format (DateTimeFormatter.ofLocalizedDate (FormatStyle.LONG));
        System.out.println (geformateerdeDatum);
        String geformateerdeLangeDatum = vandaag.format (DateTimeFormatter.ofLocalizedDate (FormatStyle.FULL));
        System.out.println (geformateerdeLangeDatum);
    }

    @Test
    void testLocalTime () {
        LocalTime tijd = LocalTime.now ();
        System.out.println (tijd);
        String geformateerdeTijd = tijd.format (DateTimeFormatter.ofLocalizedTime (FormatStyle.SHORT));
        System.out.println (geformateerdeTijd);
        String geformateerdeLangeTijd = tijd.format (DateTimeFormatter.ofLocalizedTime (FormatStyle.MEDIUM));
        System.out.println (geformateerdeLangeTijd);
    }

    @Test
    void testLocalDateTime () {
        LocalDateTime datumTijd = LocalDateTime.now ();
        System.out.println (datumTijd);
        String datumTijdFormaat = datumTijd.format (DateTimeFormatter.ofPattern ("yyyy-MM-dd HH:mm"));
        //DateTimeFormatter datumTijdFormaat = datumTijd.format (DateTimeFormatter.ofLocalizedDateTime ());
        System.out.println (datumTijdFormaat);
        String datumTijdFormaatNed = datumTijd.format (DateTimeFormatter.ofPattern ("HH:mm dd-MM-yyyy"));
        //DateTimeFormatter datumTijdFormaat = datumTijd.format (DateTimeFormatter.ofLocalizedDateTime ());
        System.out.println (datumTijdFormaatNed);
    }
}
