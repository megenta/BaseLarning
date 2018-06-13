/**
You are given a library with n words (w[0], w[1], ..., w[n - 1]). You 
choose a word from it, and in each step, remove one letter from this 
word only if doing so yields a another word in the library. What is the 
longest possible chain of these removal steps? 
Constraints: 
1 ≤ n ≤ 50000 
1 ≤ the length of each string in w ≤ 50 
Each string composed of lowercase ascii letters only. 
Input Format: 
Complete the function "longest_chain" which contains an array of 
strings "w" as its argument. 
Output Format: 
Return a single integer that represents the length of the longest chain of 
character removals possible. 
Sample Input: 
6 
a 
b 
ba 
bca 
bda 
bdca 
Sample Output #00: 
4
*/
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class LongestChain {

    public static void main(String[] args) {
        String[] words = {
                "a",
                "b",
                "ba",
                "bca",
                "bda",
                "bdca"
        };

        System.out.println("Longest Chain Length : " + longest_chain(words));
    }

    static int longest_chain(String[] w) {
        if (null == w || w.length < 1) {
            return 0;
        }

        int maxChainLen = 0;

        HashSet<String> words = new HashSet<>(Arrays.asList(w));
        HashMap<String, Integer> wordToLongestChain = new HashMap<>();

        for (String word : w) {
            if (maxChainLen > word.length()) {
                continue;
            }
            int curChainLen = find_chain_len(word, words, wordToLongestChain) + 1;
            wordToLongestChain.put(word, curChainLen);
            maxChainLen = Math.max(maxChainLen, curChainLen);
        }
        return maxChainLen;
    }

    static int find_chain_len(String word, HashSet<String> words, HashMap<String, Integer> wordToLongestChain) {
        int curChainLen = 0;

        for (int i = 0; i < word.length(); i++) {
            String nextWord = word.substring(0, i) + word.substring(i + 1);
            if (words.contains(nextWord)) {
                if (wordToLongestChain.containsKey(nextWord)) {
                    curChainLen = Math.max(curChainLen, wordToLongestChain.get(nextWord));
                } else {
                    int nextWordChainLen = find_chain_len(nextWord, words, wordToLongestChain);
                    curChainLen = Math.max(curChainLen, nextWordChainLen + 1);
                }
            }
        }

        return curChainLen;
    }
}
