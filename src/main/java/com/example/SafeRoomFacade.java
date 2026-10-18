package com.example;

public class SafeRoomFacade {
    private final HealthSystem healthSystem;
    private final ItemSystem itemSystem;
    private final MusicSystem musicSystem;
    private final SaveSystem saveSystem;
    public SafeRoomFacade(
    ){
        this.healthSystem = new HealthSystem();
        this.itemSystem = new ItemSystem();
        this.musicSystem = new MusicSystem();
        this.saveSystem = new SaveSystem();
    }
    public void enterSafeRoom() {
        musicSystem.setVibe("Peace");
        musicSystem.checkCurrentVibe();
        healthSystem.checkHealthBar();
        healthSystem.heal();
        itemSystem.openStorage();
        itemSystem.storeItem();
        saveSystem.prepareForSaving();
        saveSystem.save();
    }
    public void leaveSafeRoom() {
        musicSystem.setVibe("Danger");
        musicSystem.checkCurrentVibe();
        healthSystem.checkHealthBar();
        saveSystem.prepareForSaving();
        saveSystem.save();
    }
}
