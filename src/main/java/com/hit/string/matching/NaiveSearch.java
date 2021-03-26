package main.java.com.hit.string.matching;
import main.java.com.hit.string.matching.abstracts.AbstractMatcher;

public class NaiveSearch extends AbstractMatcher {
    @Override
    public Integer match(String searchWord, String input) {
        Integer edgeCases = super.match(searchWord, input);
        if (edgeCases != null) return edgeCases;

        for (int i = 0; i < input.length(); i++) {
            int j = 0;
            for (j = 0; j < searchWord.length(); j++) {
                if (input.charAt(i+j) != searchWord.charAt(j)) {
                    // location i is wrong.
                    break;
                }
            }
            if (j == searchWord.length()) {
                // found word at index i
                return i;
            }
        }

        // did not find word
        return -1;
    }
}
