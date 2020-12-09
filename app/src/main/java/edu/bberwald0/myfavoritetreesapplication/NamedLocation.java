package edu.bberwald0.myfavoritetreesapplication;

public class NamedLocation {

    private String name, description, location;
    private int imageID;

    public NamedLocation(String name, String description, String location, int imageID) {
        this.description = description;
        this.imageID = imageID;
        this.location = location;
        this.name = name;
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

}
