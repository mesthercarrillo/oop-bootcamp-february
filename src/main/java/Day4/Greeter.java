package Day4;

import java.time.LocalDateTime;

public class Greeter {
    public static String greet(String name) {
        LocalDateTime currentMoment = LocalDateTime.now();
        //int currentHour = currentMoment.getHour();
        //int currentMinute = currentMoment.getMinute();

        return "Hello " + formatNameInputName(name);
    }

    private static String formatNameInputName(String name) {
        String trimName = name.trim();
        String capitalizeName = trimName.substring(0, 1).toUpperCase() + trimName.substring(1);
        return capitalizeName;
    }
}
