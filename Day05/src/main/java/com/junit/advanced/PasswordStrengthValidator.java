package com.junit.advanced;

public class PasswordStrengthValidator {


    public static boolean isValid(String password){

        if (password.length()<8){
            return false;
        }

        boolean capital = false;

        for (int i=0; i<password.toCharArray().length; i++){
            if (password.toCharArray()[i] == 'A' || password.toCharArray()[i] == 'B' || password.toCharArray()[i] == 'C' || password.toCharArray()[i] == 'D' ||
                    password.toCharArray()[i] == 'E' || password.toCharArray()[i] == 'F' || password.toCharArray()[i] == 'G' || password.toCharArray()[i] == 'H' ||
                    password.toCharArray()[i] == 'I' || password.toCharArray()[i] == 'J' || password.toCharArray()[i] == 'K' || password.toCharArray()[i] == 'L' ||
                    password.toCharArray()[i] == 'M' || password.toCharArray()[i] == 'N' || password.toCharArray()[i] == 'O' || password.toCharArray()[i] == 'P' ||
                    password.toCharArray()[i] == 'Q' || password.toCharArray()[i] == 'R' || password.toCharArray()[i] == 'S' || password.toCharArray()[i] == 'T' ||
                    password.toCharArray()[i] == 'U' || password.toCharArray()[i] == 'V' || password.toCharArray()[i] == 'W' || password.toCharArray()[i] == 'X' ||
                    password.toCharArray()[i] == 'Y' ||password.toCharArray()[i] == 'Z'){


                capital = true;
            }
        }

        boolean numeric = false;

        for (int i=0; i<password.toCharArray().length; i++){
            if (password.toCharArray()[i] == '0' || password.toCharArray()[i] == '1' || password.toCharArray()[i] == '2' || password.toCharArray()[i] == '3' ||
                    password.toCharArray()[i] == '3' ||password.toCharArray()[i] == '4' ||password.toCharArray()[i] == '5' ||password.toCharArray()[i] == '6' ||
                    password.toCharArray()[i] == '7' ||password.toCharArray()[i] == '8' ||password.toCharArray()[i] == '9'){


                numeric= true;
            }
        }


        if (capital==true && numeric == true){
            return true;
        }

        return false;

    }


}
