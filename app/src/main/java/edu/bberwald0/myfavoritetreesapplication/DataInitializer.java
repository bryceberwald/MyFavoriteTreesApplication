package edu.bberwald0.myfavoritetreesapplication;

import java.util.ArrayList;
import java.util.List;

public class DataInitializer {
    private static List<NamedLocation> data = new ArrayList<>();

    public static List<NamedLocation> getData() {
        return data;
    }

    static {
        data.add(new NamedLocation("Pine Tree",
                "this is the pine tree description.",
                "Pine Tree Location.",
                R.drawable.pine_tree));
        data.add(new NamedLocation("Maple Tree",
                "this is the maple tree description.",
                "Maple Tree Location.",
                R.drawable.maple_tree));
    }
}
