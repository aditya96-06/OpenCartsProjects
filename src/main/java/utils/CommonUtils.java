package utils;

import java.util.UUID;

public class CommonUtils {
	
	 // Method to generate unique email
    public static String generateBrandNewEmail() {
        return "user_" + UUID.randomUUID().toString() + "@yopmail.com";
    }
}
