
package dictionary;

/**
 *
 * @author LVaron
 */
public class WordList
{

    WordMeaningNode list;

    WordList()
    {
        list = null;

    }

    boolean empty()
    {
        return list == null;
    }

    void add(WordMeaning w)
    {
        try
        {
            WordMeaningNode node = new WordMeaningNode(w);
            WordMeaningNode current, back = null;
            boolean found = false;

            if (empty())
            {
                list = node;
            } else
            {
                current = list;
                while (current != null && !found)
                {
                    if (node.wordMeaning.getWord().compareToIgnoreCase(current.wordMeaning.getWord()) < 0)
                    {
                        found = true;
                    } else
                    {
                        back = current;
                        current = current.next;
                    }
                }
                node.next = current;

                if (back == null)
                {
                    list = node;
                } else
                {
                    back.next = node;
                }
            }
        } catch (NullPointerException e)
        {
            e.printStackTrace();
        }
    }

    boolean addDef(String word, String def)
    {
        if (list != null)
        {
            WordMeaningNode current = list;
            boolean done = false;
            boolean found = false;
            while (!done)
            {
                if (current.wordMeaning.word.equalsIgnoreCase(word))
                {
                    found = true;
                    done = true;
                } else if (current.next == null)
                {
                    done = true;
                } else
                {
                    current = current.next;
                }
            }
            if (found)
            {
                current.wordMeaning.addDef(def);
                return true;
            } else
            {
                return false;
            }
        } else
        {
            return false;
        }
    }

    String removeWord(String word)
    {
        if (list != null)
        {
            WordMeaningNode current = list, back = null;

            boolean done = false;
            boolean found = false;
            while (!done)
            {
                if (current.wordMeaning.word.equalsIgnoreCase(word))
                {
                    found = true;
                    done = true;
                } else if (current.next == null)
                {
                    done = true;
                } else
                {
                    back = current;
                    current = current.next;
                }

            }
            if (found)
            {

                if (back != null)
                {
                    back.next = current.next;
                    return word;
                } else
                {
                    list = current.next;
                    return word;
                }

            } else
            {
                return null;
            }
        } else
        {
            return null;
        }

    }

    public String toString()
    {
        String result = "";

        WordMeaningNode current = list;

        while (current != null)
        {
            result += current.wordMeaning.getWord() + current.wordMeaning.def + "\n";
            current = current.next;
        }
        return result;
    }
}
