package com.gapestation.animalappdevaughn;

import java.util.ArrayList;
import java.util.Random;

public class Fox extends Animal implements Animal.Fun{
    @Override
    public String say() {
        ArrayList<String> foxsays = new ArrayList<>();
        foxsays.add("Ring-ding-ding-ding-dingeringeding!");
        foxsays.add("Wa-pa-pa-pa-pa-pa-pow!");
        foxsays.add("Hatee-hatee-hatee-ho!");
        foxsays.add("Fraka-kaka-kaka-kaka-kow!");
        foxsays.add("A-oo-oo-oo-ooo!");
        Random picker = new Random();
        int pick = picker.nextInt(7);
        return(foxsays.get(pick));
    }



    @Override
    public String play() {
        return("The fox chases mice and digs holes!");
    }
}
