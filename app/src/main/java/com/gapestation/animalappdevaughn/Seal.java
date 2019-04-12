package com.gapestation.animalappdevaughn;

public class Seal extends Animal implements Animal.Fun {
    @Override
    public String say(){
        return("arf");
    }

    public Seal(){
    }

    @Override
    public String play() {
        return("The seal bounces a ball off its nose.");
    }

}
