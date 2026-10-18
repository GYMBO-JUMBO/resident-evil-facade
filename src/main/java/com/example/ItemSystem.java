package com.example;

public class ItemSystem {
    private boolean isOpen = false;
    public void openStorage(){
        if(!isOpen){
            isOpen = true;
        }
    }
    public void storeItem(){
        if(!isOpen){
            System.out.println("Storage is closed. Open before use.");
        }
        else{
            System.out.println("Items have been successfully stored.");
        }
    }
}
