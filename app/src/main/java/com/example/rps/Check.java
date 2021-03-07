package com.example.rps;

public class Check {

     protected static String check (String player) {
         String cpu = "";
         int rand = (int) (Math.random() * 3);
         System.out.println(rand);
         String outcome = "";
         cpu = rand == 0 ? "Rock" : (rand == 1 ? "Paper" : "Scissors");
         if (cpu.equals(player)) {
             outcome =  "Draw";
         }
         else if((player.equals("Rock") && cpu.equals("Scissors") ||
                  player.equals("Paper") && cpu.equals("Rock") ||
                  player.equals("Scissors") && cpu.equals("Paper"))){
             outcome =  "Victory";
         }
         else if((player.equals("Rock") && cpu.equals("Paper") ||
                 player.equals("Paper") && cpu.equals("Scissors") ||
                 player.equals("Scissors") && cpu.equals("Rock"))){
             outcome =  "Defeat";
         }
         return outcome;

    }
}
