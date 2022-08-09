package chapter_08;

/*
PASSWORD VALIDATOR
Validate the complexity of a proposed password by assuring it meets these rules:
- at least 8 characters long
- contain an uppercase letter
- contain a special character
- not contain the username
- not the same as the old password
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    public static void main(String[] args) {
        String userName = getUserName();
        String oldPassword = getOldPassword();
        String newPassword = getNewPassword();

        isPasswordValid(userName,oldPassword,newPassword);

    }

    private static String getNewPassword() {
        System.out.println("Please enter your new Password");
        Scanner scanner = new Scanner(System.in);
        String newPassword = scanner.next();
        scanner.close();
        return newPassword;
    }

    private static String getOldPassword() {
        System.out.println("Please enter your old Password");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();

    }

    private static String getUserName() {
        System.out.println("Please enter your User Name");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    private static void isPasswordValid(String userName, String oldPassword, String newPassword){
        boolean isSameAsOldPassword = isSameAsOldPassword(oldPassword, newPassword);
        boolean isContainsUsername = isContainsUsername(newPassword, userName);
        boolean isEightCharacterLong = isEightCharactersLong(newPassword);
        boolean isUpperCaseLetterPresent = isUpperCaseLetterPresent(newPassword);
        boolean isSpecialCharacterPresent = isSpecialCharacterPresent(newPassword);

        System.out.println();
        System.out.println("---------Starting PASSWORD VERIFICATION -------");
        // CHECK 1
        if(isSameAsOldPassword || isContainsUsername){
            System.out.println("Password does not meet criteria - Check 1");
        } // CHECK 2
        else if(!isEightCharacterLong || !isUpperCaseLetterPresent || !isSpecialCharacterPresent){
            System.out.println("Password does not meet criteria - Check 2");
        }
        else{
            System.out.println("Password is valid");
        }

        System.out.println();
        System.out.println("CRITERIA CHECK REPORT");
        System.out.println("--------------------------------");
        System.out.println("Same as Old Password = " + isSameAsOldPassword);
        System.out.println("Contains Username = " + isContainsUsername);
        System.out.println("Eight Characters Long = " + isEightCharacterLong);
        System.out.println("Uppercase letter present = " + isUpperCaseLetterPresent);
        System.out.println("Special Character present = " + isSpecialCharacterPresent);
        System.out.println();
    }

    private static boolean isSpecialCharacterPresent(String newPassword) {

        Pattern p = Pattern.compile("[!@#$%&*0-9]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(newPassword);
        return m.find();

    }

    private static boolean isUpperCaseLetterPresent(String newPassword) {
        for (int i = 0; i < newPassword.length(); i++) {
            char charCase = newPassword.charAt(i);
            if (Character.isUpperCase(charCase)) {
                return true;
            }
        }
        return false;


    }

    private static boolean isEightCharactersLong(String newPassword) {
        return newPassword.length() >=8;
    }

    private static boolean isContainsUsername(String newPassword, String userName) {
        return userName.contains(newPassword);
    }

    private static boolean isSameAsOldPassword(String oldPassword, String newPassword) {
        return oldPassword.equals(newPassword);
    }


}
