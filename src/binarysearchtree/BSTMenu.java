package binarysearchtree;

import java.util.ArrayList;
import java.util.Scanner;

public class BSTMenu {

    BSTInsertion bstInsertion = new BSTInsertion();

    public void printMainMenu() {
        System.out.println("Welcome to Binary Search Tree!");
        System.out.println("1. Insertion");
        System.out.println("2. Deletion");
        System.out.println("3. Traversal");
        System.out.println("0. Exit");
        System.out.println("Please input an integer to select your desired operation.");
    }

    public int getIntInput() {
        Scanner keyboardInput = new Scanner(System.in);
        return keyboardInput.nextInt();
    }

    public void performOperation(int intInput, ArrayList<Integer> bst) {
        switch (intInput) {
            case 0:
                System.exit(0);
                break;
            case 1:
                bstInsertion.insert(bst);
                break;
            case 2:
                System.out.println("Call deletion method");
                break;
            case 3:
                System.out.println("Call traversal method");
        }
    }

}
