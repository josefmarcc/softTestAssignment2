package Utils;


public class StringUtil {

    public String reverseInput(String input) {

        if (input == null) {
            return input;
        }

        String output = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            output = output + input.charAt(i);
        }

        return output;
    }


    public String capitalizeInput(String input) {
        if (input == null) {
            return input;
        }

        String output = "";

        for (int i = 0; i < input.length(); i++) {
            output = output + Character.toUpperCase(input.charAt(i));
        }

        return output;
    }

    public String lowercaseInput(String input) {
        if (input == null) {
            return input;
        }

        String output = "";

        for (int i = 0; i < input.length(); i++) {
            output = output + Character.toLowerCase(input.charAt(i));
        }

        return output;
    }
}
