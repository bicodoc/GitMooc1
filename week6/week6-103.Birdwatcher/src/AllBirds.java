
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author albertdavis
 */
public class AllBirds {

    private ArrayList<Bird> allBirds;

    public AllBirds() {
        this.allBirds = new ArrayList<Bird>();
    }

    public void addBird(String name, String species, int observes) {
        Bird newBird = new Bird(name, species, observes);
        allBirds.add(newBird);
    }

    public void Stats() {
        for (Bird tweetie : allBirds) {
            System.out.println(tweetie.getName() + " (" + tweetie.getSpecies() + "): " + tweetie.getObservations());
        }
    }

    public void show(String name) {
        for (Bird tweetie : allBirds) {
            if (tweetie.getName().equals(name)) {
                System.out.println(tweetie.getName() + " (" + tweetie.getSpecies() + "): " + tweetie.getObservations() + " observations");            
            }
        }
    }
    
    public void observe(String name) {
        boolean found = false;
        for (Bird tweetie : allBirds) {
            if ((tweetie.getName().equals(name))) {
                found = true;
                tweetie.setObservations();
            }
        }
        if (found == false) System.out.println("Is not a bird!");
    }

    public ArrayList<Bird> searchByName(String name) {
        return searchBirds(name, "", -1);
    }

    public ArrayList<Bird> searchBySpecies(String species) {
        return searchBirds(null, species, -1);
    }

    public ArrayList<Bird> searchByObservations(int observations) {
        return searchBirds(null, null, observations);
    }

    public ArrayList<Bird> searchBirds(String name, String species, int observations) {
        ArrayList<Bird> found = new ArrayList<Bird>();
        for (Bird tweetie : this.allBirds) {
            if (StringUtils.included(tweetie.getName(), name)
                    || StringUtils.included(tweetie.getSpecies(), species)
                    || tweetie.getObservations() == observations) {
                found.add(tweetie);
            }
        }
        return found;
    }
}

/*
import java.util.ArrayList;
 
public class BirdDatabase {
 
    private ArrayList<Bird> birds;
 
    public BirdDatabase() {
        birds = new ArrayList<Bird>();
    }
 
    public boolean observe(String name) {
        for (Bird bird : birds) {
            if (name.equals(bird.name())) {
                bird.observe();
                return true;
            }
        }
        return false;
    }
 
    public void addBird(String name, String latinName) {
        birds.add(new Bird(name, latinName));
    }
 
    public String showBird(String name) {
        for (Bird bird : birds) {
            if (name.equals(bird.name())) {
                return bird.toString();
            }
        }
        return null;
    }
 
    public String statistics() {
        String stats = "";
        for (Bird bird : birds) {
            stats = stats+bird.toString()+"\n";
        }
        return stats;
    }
 
}
*/