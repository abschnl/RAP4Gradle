package com.zufengze.rap4g.dataobject;

import java.util.Comparator;

public class ParameterComparator implements Comparator<Parameter> {

    public int compare(Parameter o1, Parameter o2) {
        return o1.getId() < o2.getId() ? 0 : 1;
    }

}
