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
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Dictionary
{

    public static void main(String[] args)
    {
        WordList b = new WordList();
        WordList deleted = new WordList();
        boolean done = false;
        String menu = "Enter option\n1. Add Word\n2. Show Dictionary\n3. Add New Definition\n4. Remove Word\n5. Show Deleted List\n6. Quit";

        while (!done)
        {
            try
            {

                String s = JOptionPane.showInputDialog(menu);
                int i = Integer.parseInt(s);
                switch (i)
                {
                    case 1:
                        String Word = JOptionPane.showInputDialog("Please enter the word you would like to add to the dictionary.");
                        String Definition = JOptionPane.showInputDialog("Please enter the definition of the word entered.");
                        b.add(new WordMeaning(Word, Definition));
                        break;

                    case 2:
                        String c = "Dictionary:\n" + b.toString();
                        display(c);
                        break;

                    case 3:
                        String WordDef = JOptionPane.showInputDialog("Please enter the word you would like to add a definition to.");
                        String Def = JOptionPane.showInputDialog("Please enter the new definition.");
                        b.addDef(WordDef, Def);
                        break;
                    case 4:
                        String Remove = JOptionPane.showInputDialog("Please enter the word you would like to remove.");
                        String del = b.removeWord(Remove);
                        if (del != null)
                        {
                            deleted.add(new WordMeaning(del, ""));
                        }
                        break;
                    case 5:

                        display("Deleted Words:\n" + deleted.toString());

                        break;
                    case 6:
                        done = true;
                        break;
                    default:
                       JOptionPane.showMessageDialog(null, "Invalid option!", "Error", JOptionPane.ERROR_MESSAGE);
                        break;

                }

            } 
            catch (NumberFormatException e)
            {
                displayError("Error: Number Format Exception - Press Option 6 To Exit");
            }
        }

    }

    static void display(String s)
    {
        JTextArea text = new JTextArea(s, 25, 30);
        JScrollPane pane = new JScrollPane(text);
        JOptionPane.showMessageDialog(null, pane);
    }

    static void displayError(String msg)
    {
        JOptionPane.showMessageDialog(null, msg, "Error", JOptionPane.ERROR_MESSAGE);
    }
}

