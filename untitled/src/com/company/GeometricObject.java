package com.company;
import java.util.Date;

/**
 * Created by mmilovanovic on 4/5/2017.
 */
public class GeometricObject {

    private String color;
    private boolean filled;
    private Date dateCreated;

    public GeometricObject(){
        dateCreated = new Date();
    }

    public GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
        dateCreated = new Date();
    }

    public String getColor(){
        return  color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public Date getDateCreated(){
       return dateCreated;
    }

    public String toString(){
        return "kreiran datuma  " + dateCreated + " boje " + color + " i popunjenoisti " + filled;
    }
}
