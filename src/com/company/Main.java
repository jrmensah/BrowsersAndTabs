package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String tabAns;
        String browserAns;
        String tTitle;
        String tUrl;
        String bName;

        Scanner keyboard = new Scanner(System.in);

        //Instantiate browser throughout main method
        Browser aBrowser = new Browser();

        do {
            System.out.println("Enter the name of the browser");
            browserAns = keyboard.nextLine();
            if (browserAns.equalsIgnoreCase("Internet Explorer") && !browserAns.equalsIgnoreCase("Internet Explorer")) {
                System.out.println("Use a different browser!");
            }
            //Declare variables, create new instances. URL to Tab and Tab to Browser.
            Tabs t;
            Browser b;



            //Prompt the user to enter a Tab title
            do {
                t = new Tabs();
                System.out.println("Enter the title of the Tab");
                tTitle = keyboard.nextLine();
                aBrowser.addTab(t);

                System.out.println("Enter the URL into the tab");
                tUrl = keyboard.nextLine();

                    do {
                        System.out.println("Enter another tab (Y/N)?");
                        tabAns = keyboard.nextLine();
                    } while (!tabAns.equalsIgnoreCase("y") && !tabAns.equalsIgnoreCase("n"));
                    if(!tabAns.equalsIgnoreCase("y") )
                    {
                        System.out.println(aBrowser.getName());
                    }

            } while (!browserAns.equalsIgnoreCase("Internet Explorer"));
        }while(browserAns.equalsIgnoreCase("Internet Explorer") && !browserAns.equalsIgnoreCase("Internet Explorer"));

        System.out.println(aBrowser.getName());
//        for(Tabs browser: aBrowser.getTabs());
//        {
//            System.out.println(tTitle.);
//            for(Tabs aTab: ){
//
//            }
        }
    }

