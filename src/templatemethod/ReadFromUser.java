/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod;

import java.util.Scanner;

/**
 *
 * @author ayerj
 */
public class ReadFromUser extends BookReader{
    
    Scanner keyboard = new Scanner(System.in);
    String birthplace = "";
    String favoriteMemory = "";
    String familyPets = "";
    

    @Override
    void initialize() {
        System.out.println("Where were you born?");
        birthplace = keyboard.nextLine();
        System.out.println("What is your favorite memory?");
        favoriteMemory = keyboard.nextLine();
        System.out.println("Name your family pets");
        familyPets = keyboard.nextLine();
        
    }

    @Override
    void startReading() {
        System.out.println("Your birthplace is " + birthplace + "\nYour favorite memory is " + favoriteMemory + "\nYour family pets are " + familyPets);
    }

    @Override
    void stopReading() {
        
    }
    
}
