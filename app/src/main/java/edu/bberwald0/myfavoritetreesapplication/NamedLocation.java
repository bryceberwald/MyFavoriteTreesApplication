package edu.bberwald0.myfavoritetreesapplication;

public class NamedLocation {

    private String name, description, location, inside, outside, tallest;
    private int imageID;

    public NamedLocation(String name, String description, String location, int imageID,
                         String inside, String outside, String tallest) {

        this.description = description;
        this.imageID = imageID;
        this.location = location;
        this.name = name;
        this.inside = inside;
        this.outside = outside;
        this.tallest = tallest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getInside() {
        return inside;
    }

    public void setInside(String inside) {
        this.inside = inside;
    }

    public String getOutside() {
        return outside;
    }

    public void setOutside(String outside) {
        this.outside = outside;
    }

    public String getTallest() {
        return tallest;
    }

    public void setTallest(String tallest) {
        this.tallest = tallest;
    }

}