package edu.bberwald0.myfavoritetreesapplication;

import java.util.ArrayList;
import java.util.List;

public class DataInitializer {
    private static List<NamedLocation> data = new ArrayList<>();

    public static List<NamedLocation> getData() {
        return data;
    }

    static {
        //Pine Tree
        data.add(new NamedLocation("Pine Tree",
                "this is the pine tree description.",
                "Pine Tree Location.",
                R.drawable.pine_tree));
        //Maple Tree
        data.add(new NamedLocation("Maple Tree",
                "this is the maple tree description.",
                "Maple Tree Location.",
                R.drawable.maple_tree));
        //Apple Tree
        data.add(new NamedLocation("Apple Tree",
                "this is the apple tree description.",
                "Apple Tree Location.",
                R.drawable.apple_tree));
        //Birch Tree
        data.add(new NamedLocation("Birch Tree",
                "this is the birch tree description.",
                "Birch Tree Location.",
                R.drawable.birch_tree));
        //Blue Spruce Tree
        data.add(new NamedLocation("Blue Spruce Tree",
                "this is the blue spruce tree description.",
                "Blue Spruce Tree Location.",
                R.drawable.blue_spruce_tree));
        //Oak Tree
        data.add(new NamedLocation("Oak Tree",
                "this is the oak tree description.",
                "Oak Tree Location.",
                R.drawable.oak_tree));
        //Palm Tree
        data.add(new NamedLocation("Palm Tree",
                "this is the palm tree description.",
                "Palm Tree Location.",
                R.drawable.palm_tree));
        //Willow Tree
        data.add(new NamedLocation("Willow Tree",
                "this is the willow tree description.",
                "Willow Tree Location.",
                R.drawable.willow_tree));
    }
}
