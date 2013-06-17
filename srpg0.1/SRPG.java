package srpg;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** 
 * Strategy Role-Playing Game, or SRPG (name subject to change), is a turn-
 * based tactical role-playing game heavily influenced by its great
 * predecessor Fire Emblem.
 * @author Kevin Yu Sung
 *
 */
public class SRPG {
    public static void main (String[] args) throws IOException {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        System.out.println("Welcome to Strategy RPG (name subject to change).");
        System.out.println("Please choose one of the following: \n\t 'n' for New"
        + "Game, \n\t 'c' for Continue Game, \n\t 's' for Suspend Game");
        String option = reader.readLine();
        if (option.equals("n")) {
            System.out.println("Welcome to the Rebellion. Here we " +
            	"pledge allegiance to Prince K(name subject to change). " +
            	"First we need a quick background check to ensure you " +
            	"are not a spy.");
            System.out.println("What is your full name?");
            String name = reader.readLine();
            System.out.println("What do you like to go by?");
            String nickname = reader.readLine();
            System.out.println("Now for your history. What did your father" +
            	" do for a living? Please enter one of the following:" +
            	" \n 'm' - merchant \n 'a' - alchemist \n 's' - soldier");
            String occupation = reader.readLine();
            while (!(occupation.equals("m") || occupation.equals("a")
                || occupation.equals("s"))) {
                System.out.println("Huh? Please re-enter your father's" +
                "occupation: \n 'm' - merchant \n 'a' - alchemist \n" +
                " 's' - soldier");
                occupation = reader.readLine();
            }
            System.out.println("As a child, what did you enjoy doing the most?" +
            	"\n 'b' - reading books \n 't' - playing tag \n 'e' - eating ");
            String childhood = reader.readLine();
            while (!(childhood.equals("b") || childhood.equals("t")
                    || childhood.equals("e"))) {
                System.out.println("Huh? Please re-enter what you liked to" +
                " do the most as a child: \n 'b' - reading books \n" +
                " 't' - playing tag \n 'e' - eating ");
                childhood = reader.readLine();
            }
            System.out.println("Okay. Finally, as a rebel, you must choose a" +
            	" field. What would you like to specialize in? " +
            	"\n 'k' - knight \n 'a' - alchemist \n 'g' - gunsman ");
            String field = reader.readLine();
            while (!(field.equals("k") || field.equals("a")
                    || occupation.equals("g"))) {
                System.out.println("Huh? Please re-enter what field you" +
                " want to specialize in: \n 'k' - knight" +
                " \n 'a' - alchemist \n 'g' - gunsman");
                field = reader.readLine();
            }
            System.out.println("Hm, looks like you're good to go." +
            	" Right, we'll meet again on the field in two months" +
            	" to see the results of your training.");
        }
    }
    
    
}
