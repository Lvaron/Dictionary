//********************************************************************************
// STUDENT NAME:  Leonardo Varon
// FIU EMAIL: lvaro010@fiu.edu
// CLASS: COP 3337 – Summer 2015
// ASSIGNMENT # 5
// DATE: 7/20/2015
//
// I hereby swear and affirm that this work is solely my own, and not the work 
// or the derivative of the work of someone else.
//********************************************************************************

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
