/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author albertdavis
 */
public class Bird {
    private String name;
    private String species;
    private int observations;


    public Bird(String name, String species, int observations) {
        this.name = name;
        this.species = species;
        this.observations = 0;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
    
    public int getObservations() {
        return observations;
    }

    public void setObservations() {
        observations++;
    }
    
    public String toString(String name, String species, int observations) {
        return name + " (" + species + "): " + observations + " observations";
    }
}

/*
public class Bird {
 
    private String name;
    private String latinName;
    private int observations;
 
    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }
 
    public String name() {
        return this.name;
    }
 
    public void observe() {
        this.observations++;
    }
 
    public String toString() {
        return this.name+" ("+this.latinName+"): "+this.observations+" observations";
    }
}
*/

