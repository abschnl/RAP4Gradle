package com.zufengze.rap4g.dataobject;

import java.util.Comparator;

public class ActionComparator implements Comparator<Action> {

    public int compare(Action o1, Action o2) {
        return o1.getId() < o2.getId() ? 0 : 1;
    }

}
