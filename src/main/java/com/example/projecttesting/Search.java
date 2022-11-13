package com.example.projecttesting;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        // Attributes of the Search class.
        // Create string variables for the search options.
        String z1 = "zone 1";
        String z2 = "zone 2";
        String z3 = "zone 3";
        String z4 = "zone 4";
        String z5 = "zone 5";
        String z6 = "zone 6";
        String z7 = "zone 7";
        String z8 = "zone 8";
        String z9 = "zone 9";
        String z10 = "zone 10";

        //Ask the user for input
        // Same message as the GUI.
        System.out.println("Please select a zone.");

        // Get input from the user.
        Scanner scan = new Scanner(System.in);
        // Create a variable for the user's search.
        String zonePick = scan.nextLine();

        // Create a while loop with if,else, elif branches for the user's search.
        // Program loops and allows user to search again.
        // --------------------------------Still working on the while loop.--------------------------------------------------------
        // The "quit" will be a string input to a boolean that the user can enter to end the program.
        boolean Pick_again = true;
        while (Pick_again)
            switch (zonePick) {
                case "zone 1":
                    System.out.println("You chose " + z1 + ".");
                    // Ask the user if they want to search again. If the answer yes, loop the program. If no, program ends.

                    System.out.println("Do you want to search a different zone?");
                    String diffZone = scan.nextLine();
                    if (diffZone == "yes") {
                        while(true) {
                            System.out.println("Please select a zone.");
                        }
                        //continue;

                        //String newZone = scan.nextLine();
                    } else if (diffZone == "no") {
                        break;

                    } else {
                        System.out.println("You did not search an appropriate zone. Please pick between zone 1 through 10.");

                    }
                case "zone 2":
                    System.out.println("You chose " + z2 + ".");
                    // Ask the user if they want to search again. If the answer yes, loop the program. If no, program ends.
                    System.out.println("Do you want to search a different zone?");
                    String diffZone2 = scan.nextLine();
                    if (diffZone2 == "yes") {
                        //continue;
                        System.out.println("Please select a zone.");
                        //String newZone = scan.nextLine();
                    } else if (diffZone2 == "no") {
                        break;

                    } else {
                        System.out.println("You did not search an appropriate zone. Please pick between zone 1 through 10.");

                    }
                case "zone 3":
                    System.out.println("You chose " + z3 + ".");
                    // Ask the user if they want to search again. If the answer yes, loop the program. If no, program ends.
                    System.out.println("Do you want to search a different zone?");
                    String diffZone3 = scan.nextLine();
                    if (diffZone3 == "yes") {
                        //continue;
                        System.out.println("Please select a zone.");
                        //String newZone = scan.nextLine();
                    } else if (diffZone3 == "no") {
                        break;

                    } else {
                        System.out.println("You did not search an appropriate zone. Please pick between zone 1 through 10.");

                    }
                case "zone 4":
                    System.out.println("You chose " + z4 + ".");
                    // Ask the user if they want to search again. If the answer yes, loop the program. If no, program ends.
                    System.out.println("Do you want to search a different zone?");
                    String diffZone4 = scan.nextLine();
                    if (diffZone4 == "yes") {
                        //continue;
                        System.out.println("Please select a zone.");
                        //String newZone = scan.nextLine();
                    } else if (diffZone4 == "no") {
                        break;

                    } else {
                        System.out.println("You did not search an appropriate zone. Please pick between zone 1 through 10.");

                    }
                case "zone 5":
                    System.out.println("You chose " + z5 + ".");
                    // Ask the user if they want to search again. If the answer yes, loop the program. If no, program ends.
                    System.out.println("Do you want to search a different zone?");
                    String diffZone5 = scan.nextLine();
                    if (diffZone5 == "yes") {
                        //continue;
                        System.out.println("Please select a zone.");
                        //String newZone = scan.nextLine();
                    } else if (diffZone5 == "no") {
                        break;

                    } else {
                        System.out.println("You did not search an appropriate zone. Please pick between zone 1 through 10.");

                    }
                case "zone 6":
                    System.out.println("You chose " + z6 + ".");
                    // Ask the user if they want to search again. If the answer yes, loop the program. If no, program ends.
                    System.out.println("Do you want to search a different zone?");
                    String diffZone6 = scan.nextLine();
                    if (diffZone6 == "yes") {
                        //continue;
                        System.out.println("Please select a zone.");
                        //String newZone = scan.nextLine();
                    } else if (diffZone6 == "no") {
                        break;

                    } else {
                        System.out.println("You did not search an appropriate zone. Please pick between zone 1 through 10.");

                    }
                case "zone 7":
                    System.out.println("You chose " + z7 + ".");
                    // Ask the user if they want to search again. If the answer yes, loop the program. If no, program ends.
                    System.out.println("Do you want to search a different zone?");
                    String diffZone7 = scan.nextLine();
                    if (diffZone7 == "yes") {
                        //continue;
                        System.out.println("Please select a zone.");
                        //String newZone = scan.nextLine();
                    } else if (diffZone7 == "no") {
                        break;

                    } else {
                        System.out.println("You did not search an appropriate zone. Please pick between zone 1 through 10.");

                    }
                case "zone 8":
                    System.out.println("You chose " + z8 + ".");
                    // Ask the user if they want to search again. If the answer yes, loop the program. If no, program ends.
                    System.out.println("Do you want to search a different zone?");
                    String diffZone8 = scan.nextLine();
                    if (diffZone8 == "yes") {
                        //continue;
                        System.out.println("Please select a zone.");
                        //String newZone = scan.nextLine();
                    } else if (diffZone8 == "no") {
                        break;

                    } else {
                        System.out.println("You did not search an appropriate zone. Please pick between zone 1 through 10.");

                    }
                case "zone 9":
                    System.out.println("You chose " + z9 + ".");
                    // Ask the user if they want to search again. If the answer yes, loop the program. If no, program ends.
                    System.out.println("Do you want to search a different zone?");
                    String diffZone9 = scan.nextLine();
                    if (diffZone9 == "yes") {
                        //continue;
                        System.out.println("Please select a zone.");
                        //String newZone = scan.nextLine();
                    } else if (diffZone9 == "no") {
                        break;

                    } else {
                        System.out.println("You did not search an appropriate zone. Please pick between zone 1 through 10.");

                    }
                case "zone 10":
                    System.out.println("You chose " + z10 + ".");
                    // Ask the user if they want to search again. If the answer yes, loop the program. If no, program ends.
                    System.out.println("Do you want to search a different zone?");
                    String diffZone10 = scan.nextLine();
                    if (diffZone10 == "yes") {
                        //continue;
                        System.out.println("Please select a zone.");
                        //String newZone = scan.nextLine();
                    } else if (diffZone10 == "no") {
                        break;

                    } else {
                        System.out.println("You did not search an appropriate zone. Please pick between zone 1 through 10.");

                    }
                /*default:
                    System.out.println("You did not search an appropriate zone. Please pick between zone 1 through 10.");
                    break;*/
            }
    }
}





