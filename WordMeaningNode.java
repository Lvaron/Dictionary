
package dictionary;

/**
 *
 * @author LVaron
 */
public class WordMeaningNode {
    WordMeaning wordMeaning;
    WordMeaningNode next;
    
    WordMeaningNode(WordMeaning w)
    {
        wordMeaning = w;
        next = null;
    }
}
