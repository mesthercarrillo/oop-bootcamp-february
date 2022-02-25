package Day4;

import java.time.LocalDateTime;

public class Greeter {

    private final String actualTime; //"6:23"

    public Greeter(String actualTime) {
        this.actualTime = actualTime;
    }

    public String greet(String name) {
        String[] splitedTime = actualTime.split(":");

        if (Integer.valueOf(splitedTime[0])  >= 6 && Integer.valueOf(splitedTime[0])  <= 12 ) {
            return "Good morning " + formatNameInputName(name);
        }
        return "Hello " + formatNameInputName(name);
    }

    private static String formatNameInputName(String name) {
        String trimName = name.trim();
        String capitalizeName = trimName.substring(0, 1).toUpperCase() + trimName.substring(1);
        return capitalizeName;
    }
}
