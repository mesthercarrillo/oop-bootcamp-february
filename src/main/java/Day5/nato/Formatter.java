package Day5.nato;

import com.google.common.collect.ImmutableMap;
import com.sun.jdi.CharType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Formatter {

    private static final Map<String, String> ALPHABET_TRANSLATOR = new HashMap<>();

    static {
        ALPHABET_TRANSLATOR.put("a", "alpha");
        ALPHABET_TRANSLATOR.put("b", "bravo");
        ALPHABET_TRANSLATOR.put("c", "charlie");
        ALPHABET_TRANSLATOR.put("d", "delta");
        ALPHABET_TRANSLATOR.put("e", "echo");
        ALPHABET_TRANSLATOR.put("f", "foxtrot");
        ALPHABET_TRANSLATOR.put("g", "golf");
        ALPHABET_TRANSLATOR.put("h", "hotel");
        ALPHABET_TRANSLATOR.put("i", "india");
        ALPHABET_TRANSLATOR.put("j", "juliet");
        ALPHABET_TRANSLATOR.put("k", "kilo");
        ALPHABET_TRANSLATOR.put("l", "lima");
        ALPHABET_TRANSLATOR.put("m", "mike");
        ALPHABET_TRANSLATOR.put("n", "november");
        ALPHABET_TRANSLATOR.put("o", "oscar");
        ALPHABET_TRANSLATOR.put("p", "papa");
        ALPHABET_TRANSLATOR.put("q", "quebec");
        ALPHABET_TRANSLATOR.put("r", "romeo");
        ALPHABET_TRANSLATOR.put("s", "sierra");
        ALPHABET_TRANSLATOR.put("t", "tango");
        ALPHABET_TRANSLATOR.put("u", "union");
        ALPHABET_TRANSLATOR.put("v", "victor");
        ALPHABET_TRANSLATOR.put("w", "whiskey");
        ALPHABET_TRANSLATOR.put("x", "xray");
        ALPHABET_TRANSLATOR.put("y", "yankee");
        ALPHABET_TRANSLATOR.put("z", "zulu");
        ALPHABET_TRANSLATOR.put("1", "one");
        ALPHABET_TRANSLATOR.put("z", "two");
        ALPHABET_TRANSLATOR.put("z", "zulu");
        ALPHABET_TRANSLATOR.put("z", "zulu");
    }

    public static String encode(String message) {
        String encodedText = "";
        String[] messageArray = message.split("");

        for (int i = 0; i < messageArray.length; i++) {
            encodedText +=  ALPHABET_TRANSLATOR.get(i);
        }
        return encodedText;
    }
}
