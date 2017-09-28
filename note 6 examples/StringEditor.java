public class StringEditor {
    public static String removeNonLetters(String original) {
        StringBuilder  s = new StringBuilder();
        for (int i=0; i<original.length(); i++) {
            char aCharacter = original.charAt(i);
            if (Character.isLetter(aCharacter))
                s.append(new Character(aCharacter));
        }
        return new String(s);
    }
}

