# 🚆 UC11 – Regex Validation

/**
 * Author: vamsikoneru06
 * UC11 - Regex Validation
 */

import java.util.regex.*;

public class usecase11 {
    public static void main(String[] args) {

        String trainId = "TRN-1234";
        String cargo = "PET-AB";

        boolean validTrain = Pattern.matches("TRN-\\d{4}", trainId);
        boolean validCargo = Pattern.matches("PET-[A-Z]{2}", cargo);

        System.out.println("Train ID Valid: " + validTrain);
        System.out.println("Cargo Valid: " + validCargo);
    }
}