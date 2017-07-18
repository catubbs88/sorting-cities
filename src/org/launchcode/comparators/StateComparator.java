package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;

/**
 * Created by catub on 7/18/2017.
 */
public class StateComparator implements Comparator<City> {
    @Override
    public int compare(City o1, City o2) {
        if (o1.getState().compareTo(o2.getState()) == 0) {
            return o1.getName().compareTo(o2.getName());
        } else {
            return o1.getState().compareTo(o2.getState());
        }
    }
}





