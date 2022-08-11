import java.util.*;

public class Task {

    public boolean containsOnlyDigits(String str) { //Task #1
        return !str.chars()
                .anyMatch(n -> !Character.isDigit(n));
    }

    public Map<Long, Long> countVowelsAndConsonants(String str) { //Task #2
        Set<Character> allVowels = new HashSet(Arrays.asList('a', 'b', 'c', 'i'));
        str = str.toLowerCase();
        long vowels = str.chars()
                .filter(c -> allVowels.contains((char) c))
                .count();
        long consonants = str.chars()
                .filter(c -> !allVowels.contains((char) c))
                .filter(ch -> (ch >= 'a' && ch <= 'z'))
                .count();
        return Map.of(vowels, consonants);
    }

    public int countOccurrencesOfACertainCharcter(String str, String ch) { //Task #3
        if (ch.codePointCount(0, ch.length()) > 1) {
            return -1;
        }
        int result = str.length() - str.replace(ch, "").length();
        return ch.length() == 2 ? result / 2 : result;
    }
}
