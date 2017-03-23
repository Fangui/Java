package week7;

/**
 *
 * @author Use
 */
// U08223 Practical 10.
// Bodies of methods:
//   recordWord,
//   display and
//   numberOfEntries
// to be completed by student


import java.util.*;

/** A class representing a binary tree containing words.
 *
 * 16108849
 */
public class WordTree {

    public String word;
    public ArrayList<Integer> lineNumbers;
    public WordTree left, right;

    /** Constructs a tree consisting of a single node, with
     * the given word and line number.
     *
     * @param w           the word
     * @param lineNo      the line number
     * @pre               true
     * @post              word tree containing word w on line lineNo has been constructed
     */
    public WordTree(String w, int lineNo) {
        word = w;
        lineNumbers = new ArrayList<Integer>();
        lineNumbers.add(lineNo);
        left = null;
        right = null;
    }

}
