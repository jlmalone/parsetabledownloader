package com.techventus.parsetabledownloader;

import java.util.ArrayList;

/**
 * Created by josephmalone on 2017-01-21.
 */
public class ResultsWrapper {
    ArrayList<ParseStruct> results;

    public ArrayList<ParseStruct> getResults() {
        return results;
    }

    public void setResults(ArrayList<ParseStruct> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "ResultsWrapper{" +
                "results=" + results +
                '}';
    }
}
