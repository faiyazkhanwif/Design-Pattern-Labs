/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author faiya
 */
public class SearchManager {
    public static void main(String[] args) {
        AllCandidates allCandidates = new AllCandidates();
        Iterator iteratorAll = allCandidates.getAllCandidatesIterator();
        

        System.out.println("Printing File Content");
        printOutput(iteratorAll);
        promptUser(allCandidates);

    }

    private static void promptUser(AllCandidates allCandidates) {
        Scanner scanner = new Scanner(System.in);
        int choice=3;
        String certifiedType;
        Iterator iterator;
        do {
            try {
                System.out.print("Enter 1 to display all candidates, 2 to "
                        + "display certified candidates, 0 to exit: ");
                choice = scanner.nextInt();
                switch (choice) {
                    case 0:
                        break;
                    case 1:
                        iterator = allCandidates.getAllCandidatesIterator();
                        printOutput(iterator);
                        break;
                    case 2:
                        System.out.print("Enter certification type: ");
                        certifiedType = scanner.next();
                        iterator = allCandidates.getCertifiedCandidatesIterator(certifiedType);
                        printOutput(iterator);
                        break;
                    default:
                        System.out.println("Incorrect input, try again");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error, not a number");
                promptUser(allCandidates);
            }

        } while (choice != 0);
    }

    public static void printOutput(Iterator iterator) {
        while (iterator.hasNext()) {
            Candidate candidate = (Candidate) iterator.next();
            System.out.println(candidate.getNAME() + "," + candidate.getCERTIFICATION()
                    + "," + candidate.getWORK_LOCATION());
        }
        System.out.println("");
    }
}
