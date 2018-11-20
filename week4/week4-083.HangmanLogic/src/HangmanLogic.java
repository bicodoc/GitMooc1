
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

        // program here the functionality for making a guess
        // if the letter has already been guessed, nothing happens
        // it the word does not contains the guessed letter, number of faults increase
        // the letter is added among the already guessed letters

    public void guessLetter(String letter) {
        letter.toUpperCase();
        if (!(guessedLetters.contains(letter))) {
            this.guessedLetters = guessedLetters + letter;            
            if (!(this.word.contains(letter))) {
                this.numberOfFaults++;            
            }
        }
    }

        // program here the functionality for building the hidden word
        // create the hidden word by iterating through this.word letter by letter
        // if the letter in turn is within the guessed words, put it in the hidden word
        // if the letter is not among the guessed ones, replace it with _ in the hidden word
        // return the hidden word at the end

    public String hiddenWord() {
        // program here the functionality for building the hidden word
        String hiddenWord = "";
        for (int i = 0; i < this.word.length(); i++) {
            char c = this.word.charAt(i);
//            String s = "" + c;
            if (guessedLetters.contains("" + c)) {
                hiddenWord = hiddenWord + c;
            } else {
                hiddenWord = hiddenWord + "_";
            }
        }
        return hiddenWord;
    }    
        // create the hidden word by interating through this.word letter by letter
        // if the letter in turn is within the guessed words, put it in to the hidden word
        // if the letter is not among guessed, replace it with _ in the hidden word 

        // return the hidden word at the end
}

/*
public class HangmanLogic {
 
    private String word;
    private String guessedLetters;
    private int numberOfFaults;
 
    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }
 
    public int numberOfFaults() {
        return this.numberOfFaults;
    }
 
    public String guessedLetters() {
        return this.guessedLetters;
    }
 
    public int losingFaultAmount() {
        return 12;
    }
 
    public void guessLetter(String letter) {
        // program here the functionality for making a guess
 
        // if the letter has already been guessed, nothing happens
 
        // it the word does not contains the guessed letter, number of faults increase
        // the letter is added among the already guessed letters
        if (this.guessedLetters.contains(letter)) {
            return;
        }
 
        if (!this.word.contains(letter)) {
            this.numberOfFaults++;
        }
 
        this.guessedLetters = this.guessedLetters + letter;
    }
 
    public String hiddenWord() {
        // program here the functionality for building the hidden word
 
        // create the hidden word by interating through this.word letter by letter
        // if the letter in turn is within the guessed words, put it in to the hidden word
        // if the letter is not among guessed, replace it with _ in the hidden word 
 
        // return the hidden word at the end
        String hiddenVersionOfWord = "";
 
        int letterIndex = 0;
        while (letterIndex < this.word.length()) {
            char character = this.word.charAt(letterIndex);
 
            if (this.guessedLetters.contains("" + character)) {
                hiddenVersionOfWord = hiddenVersionOfWord + character;
            } else {
                hiddenVersionOfWord = hiddenVersionOfWord + "_";
            }
 
            letterIndex++;
        }
 
        return hiddenVersionOfWord;
    }
}
*/