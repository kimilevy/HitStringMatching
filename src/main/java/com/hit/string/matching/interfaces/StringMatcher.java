package main.java.com.hit.string.matching.interfaces;

import java.util.Set;

public interface StringMatcher {
    /**
     * Function to return a matching index of the searchWord in the input string
     * @param searchWord The word to search for
     * @param input The input text to search in
     * @return The index of the first occurrence of the search word
     */
    public Integer match(String searchWord, String input); // searchWord="elad" input="fdslakjaskjdfkjasehdelad"
}
