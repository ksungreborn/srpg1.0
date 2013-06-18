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
 * predecessor Fire Emblem. All characters and maps are generated in this file.
 * @author Kevin Yu Sung
 *
 */
public class SRPG {
    void preGame() throws IOException {
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
                " \n 'm' - merchant \n 'f' - farmer \n 'n' - noble");
            String occupation = reader.readLine();
            while (!(occupation.equals("m") || occupation.equals("f")
                || occupation.equals("n"))) {
                System.out.println("Huh? Please re-enter your father's" +
                "occupation: \n 'm' - merchant \n 'f' - farmer \n 'n' - noble");
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
                    || field.equals("g"))) {
                System.out.println("Huh? Please re-enter what field you" +
                " want to specialize in: \n 'k' - knight" +
                " \n 'a' - alchemist \n 'g' - gunsman");
                field = reader.readLine();
            }
            System.out.println("Hm, looks like you're good to go." +
                " Right, we'll meet again on the field in two months" +
                " to see the results of your training.");
            Unit MU; int[] growths = new int[8]; int[] stats = new int[11];
            Item[] inventory = new Item[5]; String mufield; Item equipped;
            Item medPack = new Item("medPack", 0, 0, 3, "heal", "hp+10", 0);
            if (field.equals("k")) {
                mufield = "Knight";
                Item bronzeSword = new Item("steelSword", 90, 4, 40, "sword", "", 2);
                Item bronzeAxe = new Item("steelAxe", 80, 5, 40, "axe", "", 2);
                equipped = bronzeSword;
                inventory[0] = bronzeSword; inventory[1] = bronzeAxe; inventory[2] = medPack;
                growths[0] = 90; growths[1] = 60; growths[2] = 0;
                growths[3] = 50; growths[4] = 50; growths[5] = 40; 
                growths[6] = 20; growths[7] = 40;
                stats[0] = 19; stats[1] = 19; stats[2] = 8; stats[3] = 0;
                stats[4] = 5; stats[5] = 5; stats[6] = 6; stats[7] = 2;
                stats[8] = 5; stats[9] = 6; stats[10] = 10;
            } else if (field.equals("a")) {
                mufield = "Alchemist";
                Item zapGlove = new Item("zapGlove", 5, 100, 40, "glove", "", 2);
                equipped = zapGlove;
                inventory[0] = zapGlove; inventory[1] = medPack;
                growths[0] = 70; growths[1] = 0; growths[2] = 55;
                growths[3] = 55; growths[4] = 55; growths[5] = 25; 
                growths[6] = 30; growths[7] = 40;
                stats[0] = 16; stats[1] = 16; stats[2] = 1; stats[3] = 6;
                stats[4] = 6; stats[5] = 6; stats[6] = 4; stats[7] = 4;
                stats[8] = 5; stats[9] = 6; stats[10] = 10;
            } else {
                mufield = "Gunsman";
                Item pistol = new Item("pistol", 4, 100, 40, "gun", "", 2);
                equipped = pistol;
                inventory[0] = pistol; inventory[1] = medPack;
                growths[0] = 65; growths[1] = 50; growths[2] = 0;
                growths[3] = 65; growths[4] = 65; growths[5] = 30; 
                growths[6] = 25; growths[7] = 50;
                stats[0] = 14; stats[1] = 14; stats[2] = 5; stats[3] = 1;
                stats[4] = 8; stats[5] = 5; stats[6] = 4; stats[7] = 2;
                stats[8] = 6; stats[9] = 6; stats[10] = 15;
            }
            if (occupation.equals("m")) {
                growths[4] += 5;
                growths[7] += 5;
            } else if (occupation.equals("f")) {
                growths [0] += 5;
                growths[5] += 5;
            } else {
                growths[3] += 5;
                growths[7] += 5;
            }
            if (childhood.equals("b")) {
                growths[2] += 5;
                growths[6] += 5;
            }
            else if (childhood.equals("t")) {
                growths[3] += 5;
                growths[7] += 5;
            } else {
                growths[0] += 5;
                growths[5] += 15;
                growths[6] += 5;
                growths[3] -= 10;
            }
            MU = new Unit(nickname, stats[0], stats[1], stats[2],
                stats[3], stats[4], stats[5], stats[6], stats[7], stats[8], 
                stats[9], stats[10], mufield, inventory, equipped, 0, 0, 1, growths,
                0);
        }
    }
    void Prologue1() {
        System.out.println("It's time to test if you're ready to become" +
            " a full-fledged rebel. You will be fighting trainer Marvin on the field.");
        
    }
    void Prologue2() {
        
    }
    public static void main (String[] args) throws IOException {
        
    }
    
    
}
