package edu.wctc.independentcopy.reader;

import java.util.ArrayList;
import java.util.List;

public class ListReader implements Reader {

    @Override
    public String readln() {
        List<String> str = new ArrayList<>();

        str.add("Item 1");
        str.add("Item 2");
        str.add("Item 3");
        str.add("Item 4");

        return str.toString();
    }
}
