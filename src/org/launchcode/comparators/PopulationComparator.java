package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;

/**
 * Created by catub on 7/18/2017.
 */
public class PopulationComparator implements Comparator<City> {
    @Override
    public int compare(City o1, City o2) {
        if (o1.getPopulation() == (o2.getPopulation())) {
            return o1.getName().compareTo(o2.getName());
        } else {
            return Integer.compare(o2.getPopulation(), o1.getPopulation());
        }
    }
}