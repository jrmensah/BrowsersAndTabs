package com.company;

import java.util.ArrayList;

public class Browser {
    private String name;
    private ArrayList<Tabs> tabs;


    public Browser() {
        tabs = new ArrayList<Tabs>();

    }

    public Browser(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Tabs> getTabs() {
        return tabs;
    }

    public void setTabs(ArrayList<Tabs> tabs) {
        this.tabs = tabs;
    }

    public void addTab(Tabs aTab){
        tabs.add(aTab);
    }
}
