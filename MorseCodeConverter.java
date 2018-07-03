package morse.code.converter;

import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class MorseCodeConverter {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Please enter the secret message.");
        String userInput = n.nextLine();
        HashMap<String, String> morse = new HashMap<String, String>();
        morse.put("a", ".-");
        morse.put("b", "-...");
        morse.put("c", "-.-.");
        morse.put("d", "-..");
        morse.put("e", ".");
        morse.put("f", "..-.");
        morse.put("g", "--.");
        morse.put("h", "....");
        morse.put("i", "..");
        morse.put("j", ".---");
        morse.put("k", "-.-");
        morse.put("l", ".-..");
        morse.put("m", "--");
        morse.put("n", "-.");
        morse.put("o", "---");
        morse.put("p", ".--.");
        morse.put("q", "--.-");
        morse.put("r", ".-.");
        morse.put("s", "...");
        morse.put("t", "-");
        morse.put("u", "..-");
        morse.put("v", "...-");
        morse.put("w", ".--");
        morse.put("x", "-..-");
        morse.put("y", "-.--");
        morse.put("z", "--..");
        morse.put("1", ".----");
        morse.put("2", "..---");
        morse.put("3", "...--");
        morse.put("4", "....-");
        morse.put("5", ".....");
        morse.put("6", "-....");
        morse.put("7", "--...");
        morse.put("8", "---..");
        morse.put("9", "----.");
        morse.put("0", "-----");
        morse.put(" ", "/");
        
        userInput = userInput.toLowerCase();
        String[] ary = userInput.split("");
        ArrayList<String> Message = new ArrayList<String>();
        System.out.print("The Morse Code for that message is: ");
        for (String i: ary) {
            System.out.print(morse.get(i) + " ");
        }
    }
    
}
