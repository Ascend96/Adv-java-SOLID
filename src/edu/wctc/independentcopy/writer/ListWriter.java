package edu.wctc.independentcopy.writer;

import java.util.ArrayList;
import java.util.List;

public class ListWriter implements Writer {
    @Override
    public void writeln(String line) {

        List<String> str = new ArrayList<>();

        str.add(line);

        System.out.println(str.toString());
    }
}
