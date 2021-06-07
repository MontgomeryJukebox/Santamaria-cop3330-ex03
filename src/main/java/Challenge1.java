/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 David Santamaria
 */
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 David Santamaria
 */

import java.util.HashMap;

public class Challenge1 {
    public static void main(String[] args) {
        HashMap<String, String> quotes = new HashMap<String, String>();
        // Sorry, I wish I knew how to keep it in order :/
        quotes.put("These aren't the droids you're looking for", "Obi-Wan Kenobi");
        quotes.put("It's over Anakin! I have the high ground", "Obi-Wan Kenobi");
        quotes.put("You underestimate my power!", "Anakin SkyWalker");
        quotes.put("Don't try it!", "Obi-Wan Kenobi");
        quotes.put("Aaaah!", "Anakin SkyWalker");
        quotes.put("You were the Chosen One! It was said that you would destroy the sith, not join them! Bring balance to the force, not leave it in darkness!", "Obi-Wan Kenobi");
        quotes.put("I HATE YOU!", "Anakin SkyWalker");
        quotes.put("You were my brother Anakin, I loved you", "Obi-Wan Kenobi");
        for (String k : quotes.keySet()) {
            System.out.println(quotes.get(k) + " says, " + k);
        }
    }
}