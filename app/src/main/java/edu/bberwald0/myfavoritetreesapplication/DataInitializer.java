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
                "Pine trees are evergreens that grow at varying sizes and typically live " +
                        "a long time, sometimes reaching 100-1000 years of age.",
                "North America, China, South-East Asia, Russia & Europe",
                R.drawable.pine_tree,
                "Yes",
                "Yes",
                "10-260 feet"));
        //Maple Tree
        data.add(new NamedLocation("Maple Tree",
                "Maple trees are in the Sapindaceae family & are seen being distributed to North Temperate" +
                        " locations quite often but are more concentrated in China.",
                "Mostly Asia but also seen in Europe, Northern Africa & North America",
                R.drawable.maple_tree,
                "Yes",
                "Yes",
                "30-130 feet"));
        //Apple Tree
        data.add(new NamedLocation("Apple Tree",
                "Apple trees produce more than 7,500 different kinds of" +
                        " apples through all the apple trees grown throughout the world. The" +
                        " approximate life span for an apple tree is 5-7 years.",
                "Originated in Central Asia but now they are cultivated world wide.",
                R.drawable.apple_tree,
                "Yes",
                "Yes",
                "12-20 feet"));
        //Birch Tree
        data.add(new NamedLocation("Birch Tree",
                "Birch trees are part of the Betulaceae family of plants. They are usually medium-sized " +
                        "and sometimes clumped with multiple trunks.",
                "Northern part of North America",
                R.drawable.birch_tree,
                "Yes",
                "Yes",
                "40-70 feet"));
        //Blue Spruce Tree
        data.add(new NamedLocation("Blue Spruce Tree",
                "Blue spruce trees are a species of the spruce tree that's native" +
                        " to North America but has been introduced elsewhere.",
                "Western United States",
                R.drawable.blue_spruce_tree,
                "Yes",
                "Yes",
                "50-75 feet"));
        //Oak Tree
        data.add(new NamedLocation("Oak Tree",
                "Oak trees are in the Fagaceae family and have 500 extant species of oaks.",
                "Bay Area",
                R.drawable.oak_tree,
                "Yes",
                "Yes",
                "50-100 feet"));
        //Palm Tree
        data.add(new NamedLocation("Palm Tree",
                "Palm trees are evergreens which are tropical plants that are a part of the Palmae family.",
                "Wet lands, lowland forests, South America, Caribbean",
                R.drawable.palm_tree,
                "Yes",
                "Yes",
                "4-20 feet"));
        //Willow Tree
        data.add(new NamedLocation("Willow Tree",
                "Willow trees are usually found in moist soils in cold temperate locations.",
                "China, Europe, North America",
                R.drawable.willow_tree,
                "Yes",
                "Yes",
                "35-50 feet"));
    }
}
