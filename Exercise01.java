public class ExerciseOne {
    public static void main(String args[]) {
      ExerciseOne ex01 = new ExerciseOne();
      
      String word = "redorangeyellowgreen";

      System.out.println(word + " to uppercase is " + ex01.stringToUppercase(word));
      System.out.println("The length of " + word + " is " + ex01.wordLength(word));
      System.out.println("The index of yellow in " + word + " is " + ex01.stringIndexOf("yellow", word));
      System.out.println("The word combo is " + ex01.wordCombo(word));
      System.out.println("The number of \'e\' in " + word + " is " + ex01.freqOfLetterInString('e', word));
      
    }
    
    // Complete this method to return the word in all uppercase
    private String stringToUppercase(String word) {
        return word.toUpperCase();
    }
    
    // Complete this method to return the length of the word
    private int wordLength(String word) {
        return word.length();
    }
    
    // Complete this method to return the index of 
    // the specified substring in the given word
    private int stringIndexOf(String subStr, String word) {
        int index = word.indexOf(subStr);
        return index;
    }
    
    // Complete this method to return a combination of 
    // the first three letters and the last four letters of the given word.
    // E.g. given the word "redorangeyellowgreen", "redgreen" should be returned
    private String wordCombo(String word) {
        String first3 = word.substring(0, 3);
        String last4 = word.substring(word.length() - 5, word.length());
        word = first3 + last4;
        return word;
    }
    
    // Complete this method to return the frequencey of 
    // the specified letter in the given word. If the specified letter is not 
    // in the given word, then return -1.
    // E.g. given the word "redorangeyellowgreen",
    // the frequency of 'e' in the word is 5
    private int freqOfLetterInString(char letter, String word) {
        int freq = 0;
        
        // go throuch each character in word
        // if the character is the same as the given letter,
        // then add 1 to freq
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                freq += 1;
            }
        }
        if (freq == 0) {
            freq = -1;
        }    
        return freq;
    }}
