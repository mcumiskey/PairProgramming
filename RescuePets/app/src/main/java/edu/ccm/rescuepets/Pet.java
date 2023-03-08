package edu.ccm.rescuepets;

import android.widget.ImageView;
/** Pets are the dogs / cats we have available. */

public class Pet {
    String pet_name;
    //since we only have dogs and cats, it is a silly way to tell which is which
    boolean pet_isDog;
    //same for male / female - could be refactored for neutered animals
    boolean pet_isMale;
    int pet_yearsOld;
    float pet_distance;
    boolean pet_isFavorite;
    int pet_imageID;

    //getresouce ID

    public void favoritePet(){
        pet_isFavorite = !pet_isFavorite;
    }

    //default initializer
    public Pet(){
        pet_name = "Pet";
        pet_isDog = true;
        pet_isMale = false;
        pet_yearsOld = 0;
        pet_distance = 0f;
        pet_isFavorite = false;
        pet_imageID = 0;
    }

    public Pet(String name, boolean isDog, boolean isMale, int yearsOld, float distance, boolean isFavorite){
        pet_name = name;
        pet_isDog = isDog;
        pet_isMale = isFavorite;
        pet_yearsOld = yearsOld;
        pet_distance = distance;
        pet_isFavorite = isFavorite;
        pet_imageID = 0;
    }

    public Pet(String name, boolean isDog, boolean isMale, int yearsOld, float distance){
        pet_name = name;
        pet_isDog = isDog;
        pet_isMale = isMale;
        pet_yearsOld = yearsOld;
        pet_distance = distance;
        pet_isFavorite = false;
        pet_imageID = 0;
    }

    public String getName(){
        return pet_name;
    }
    public boolean checkIfDog(){
        return pet_isDog;
    }
    public boolean checkIfMale(){
        return pet_isMale;
    }
    public int getAge(){
        return pet_yearsOld;
    }
    public float getDistance(){
        return pet_distance;
    }
    public boolean checkIfFavorite(){
        return pet_isFavorite;
    }
}
