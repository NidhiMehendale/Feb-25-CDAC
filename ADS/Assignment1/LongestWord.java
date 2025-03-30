public class LongestWord{
    public static String findLongestWord(String[] words, int index, String longest) {
        if (index == words.length) {
            return longest;
        }

        if (words[index].length() > longest.length()) {
            longest = words[index];
        }

        return findLongestWord(words, index + 1, longest);
    }

    public static void main(String[] args) {
        String sentence = "Practice makes a man perfect";

        String[] words = sentence.split(" ");
        String longestWord = findLongestWord(words, 0, "");
        System.out.println("Longest word: " + longestWord);
    }
}
