package com.thedevwolf.jokerserver;

import java.util.Random;

public class Joker {
   private static String[] jokes={"Q: What is Easter Bunny’s favorite kind of music?A: Hip-hop, of course!",
            "Q: Why are bunnies the luckiest animals?A: Because they each have four rabbits feet.",
            "Q: What the Easter Bunny’s favorite dance move?A: The bunny hop.",
            "Q: What day does an Easter egg hate the most?A: Fry-day",
            "Q: What music does the Easter bunny like?A: Hip-hop",
            "Q: Why does Peter Cottontail go hopping down the bunny trail?A: Because he's too young to drive.",
            "Q: What did the Easter bunny say to the carrot?A: It's been nice gnawing you",
            "Q: Why does the Easter Bunny hide?nA: Because he’s a little chicken.",
            "Q: What sport are the eggs good at?A: Running",
            "Q: What do you call an egg from outer space?A: An “Egg-stra terrestial”",
            "Q: What happened when the Easter Bunny met the rabbit of his dreams?A: They lived hoppily ever after",
            "Q: Why was the Easter bunny upset?A: He was having a bad hare day",};

    Random random=new Random();



    public String tellJoke(){
        //11 is the maximum and the 1 is our minimum
        int  n = random.nextInt(11) + 1;
        return jokes[n];
    }
}
