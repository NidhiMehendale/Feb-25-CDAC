public class VowelConsonantCounter {
    public static void countVowelsConsonants(String str, int index, int vowels, int consonants) {
        if (index == str.length()) {
            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
            return;
        }

        char ch = Character.toLowerCase(str.charAt(index));

        // Debugging print statement
        System.out.println("Checking character: " + ch);

        if ("aeiou".indexOf(ch) != -1) {
            vowels++;
        } else if (ch >= 'a' && ch <= 'z') { 
            consonants++;
        }

        countVowelsConsonants(str, index + 1, vowels, consonants);
    }

    public static void main(String[] args) {
        String sentence = "Practice makes a man perfect";
        countVowelsConsonants(sentence, 0, 0, 0);
    }
}
