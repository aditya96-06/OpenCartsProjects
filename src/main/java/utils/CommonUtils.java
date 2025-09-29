package utils;

import java.util.UUID;

public class CommonUtils {
	
	 // Method to generate unique email
    public static String generateBrandNewEmail() {
        return "user_" + UUID.randomUUID().toString() + "@yopmail.com";
    }

	public static boolean compareTwoScreenshots(String string, String string2) {
		// TODO Auto-generated method stub
		return false;
	}
}
