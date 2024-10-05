import java.util.Scanner;

public class CaesarCipher {

    // Method to decrypt using any Caesar shift
    public static String decryptCaesar(String text, int shift) {
        StringBuilder decrypted = new StringBuilder();
        
        // Loop through each character of the text
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            
            // Check if the character is a letter
            if (c >= 'A' && c <= 'Z') {
                // Rotate within uppercase letters
                c = (char) (((c - 'A' + shift) % 26) + 'A');
            } else if (c >= 'a' && c <= 'z') {
                // Rotate within lowercase letters
                c = (char) (((c - 'a' + shift) % 26) + 'a');
            }
            
            decrypted.append(c);
        }
        
        return decrypted.toString();
    }
    
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to input the text
        System.out.println("Enter the text you want to decrypt:");
        String encryptedText = scanner.nextLine();
        
        // Loop through all possible shifts from 1 to 25
        for (int shift = 1; shift <= 25; shift++) {
            // Decrypt the message using the current shift
            String decryptedText = decryptCaesar(encryptedText, shift);
            
            // Display the decrypted message for the current shift
            System.out.println("Shift: " + shift);
            System.out.println("Decrypted Text: " + decryptedText);
            System.out.println("------------------------------------");
        }
        
        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
