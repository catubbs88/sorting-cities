package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;

/**
 * Created by catub on 7/18/2017.
 */
public class PopulationDensityComparator implements Comparator<City> {
    @Override
    public int compare(City o1, City o2) {
        double populationDensity1 = (o1.getPopulation() / o1.getArea());
        double populationDensity2 = (o2.getPopulation() / o2.getArea());
        if (populationDensity1 == populationDensity2) {
            return o1.getName().compareTo(o2.getName());
        } else {
            return Double.compare(populationDensity2, populationDensity1);
        }
    }
}