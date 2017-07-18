package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;

/**
 * Created by catub on 7/18/2017.
 */
public class AreaComparator implements Comparator<City> {
    @Override
    public int compare(City o1, City o2) {
        if (o1.getArea() == (o2.getArea())) {
            return o1.getName().compareTo(o2.getName());
        } else {
            return Double.compare(o2.getArea(), o1.getArea());
        }
    }
}