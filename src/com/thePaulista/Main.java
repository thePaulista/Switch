package com.thePaulista;

public class Main {

    public static void main(String[] args) {
//        int value = 2;
//        if (value ==1) {
//            System.out.println("Value was 1");
//        } else  if(value ==2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

        int switchValue = 5;

        //testing just the switchValue
        switch (switchValue) {
            case 1:
                System.out.println("value was 1");
                break;

            case 2:
                System.out.println("value was 2");
                break;

            // when you have a multiple hairy number of values
            case 3:
            case 4:
            case 5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("was in fact " + switchValue);
                break;

            default:
                System.out.println("was not 1 or 2");
                break; // technically not needed
        }

        char charValue = 'A';
        switch (charValue) {
            case 'A':
                System.out.println("A was found");
                break;

            case 'B':
                System.out.println("B was found");
                break;

            default:
                System.out.println("Could not find A, B, C, D, E");
        }


        String month = "january";
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;

            case "june":
                System.out.println("Jun");
                break;

            default:
                System.out.println("Not sure");
        }

    }

}
