package com.example;

public class SaveSystem {
    boolean prepared = false;
    public void prepareForSaving(){
        if(!prepared){
            prepared = true;
        }
    }
    public void save(){
        if(prepared){
            System.out.println("Data has been saved.");
        }
        else{
            System.out.println("Data is not prepared for saving.");
        }
    }
}
