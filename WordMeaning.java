
package dictionary;

/**
 *
 * @author LVaron
 */
public class WordMeaning {
    String word;
    String def = " - ";
    
    WordMeaning(String t, String def)
    {
        this.word = t;
        this.def += def;
    }
    
    public void addDef(String d)
    {
        def += "\n           - " + d;
    }
    
    public String getWord()
    {
        return word;
    }
    
}
