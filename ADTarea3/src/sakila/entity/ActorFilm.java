/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sakila.entity;

/**
 *
 * @author AntDVD
 */
public class ActorFilm implements java.io.Serializable{
    
    private String title;
    private String description;
    private String firstName;
    private String lastName;
    
    public ActorFilm(){
        
    }

    public ActorFilm(String title, String description, String firstName, String lastName) {
        this.title = title;
        this.description = description;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    
    
}
