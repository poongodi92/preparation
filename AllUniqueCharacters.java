
import java.util.stream.Collectors;

public class AllUniqueCharacters {

    public static boolean allUniqueCharacters(String input) {
        String inputString = input.replaceAll("\\s", "");
        boolean result = inputString.chars().mapToObj(ch -> (char) ch).collect((Collectors.toSet())).size() == inputString.length();
        return result;
    }

    public static void main(String[] args) {
        String input = "ABCD";
        System.out.println("All Unique Characters? " + allUniqueCharacters(input)); // true

        String invalidInput = "Hello World";
        System.out.println("All Unique Characters? " + allUniqueCharacters(invalidInput)); // false
    }
}
