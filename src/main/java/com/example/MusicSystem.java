package com.example;

public class MusicSystem {
    private String currentVibe = "Danger";
    public void checkCurrentVibe(){
        if(currentVibe.equals("Peace")){playPeaceMusic();}
        if(currentVibe.equals("Danger")){playDangerMusic();}
    }
    public void playPeaceMusic(){
        System.out.println("Calm music is playing.");
    }
    public void playDangerMusic(){
        System.out.println("Danger music is playing.");
    }
    public void setVibe(String vibe){
        currentVibe = vibe;
    }
}
