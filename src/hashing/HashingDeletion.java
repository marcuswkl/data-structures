package hashing;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class HashingDeletion {

    public HashingModel delete(HashingModel hashingModel){
        int deleteKey = getDeletionInput();
        boolean check = ifExist(hashingModel,deleteKey);
        if(check){
            System.out.println("The number is not in the hash table");
        }
        else {
            performDeletion(hashingModel,deleteKey);
            return hashingModel;
        } return hashingModel;
    }

    public int getDeletionInput(){
        System.out.println("Please input the integer you want to delete.");
        System.out.println("Note: You can only delete one integer at a time.");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public boolean ifExist(HashingModel hashingModel, int deleteKey) {
        for(int i : hashingModel.hashTable){
            if(hashingModel.hashTable.equals(deleteKey))
                return true;
            else{
                return false;
            }
        }
        return false;
    }

    public HashingModel performDeletion(HashingModel hashingModel, int deleteKey){
        for (int i=0; i<hashingModel.hashTable.length;i++){
            if (hashingModel.hashTable[i] == deleteKey){
                hashingModel.hashTable[i] = -1;
                System.out.println(deleteKey + " is deleted.");
            }
        } return hashingModel;
    }

}
