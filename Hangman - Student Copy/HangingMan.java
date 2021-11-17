public class HangingMan {

    private int numWrongGuesses;

    private String[] HangmanImage = {"+----+\n"+ //requirement to edit this part
            "|\n"+
            "|\n"+
            "|\n"+
            "/\\\n",

            "+----+\n"+
            "|    O\n"+
            "|\n"+
            "|\n"+
            "/\\\n",

            "+----+\n"+
            "|    O\n"+
            "|    +\n"+
            "|\n"+
            "/\\\n",

            "+----+\n"+
            "|    O\n"+
            "|    +-\n"+
            "|\n"+
            "/\\\n",

            "+----+\n"+
            "|    O\n"+
            "|   -+-\n"+
            "|\n"+
            "/\\\n",

            "+----+\n"+
            "|    O\n"+
            "|   -+-\n"+
            "|   / \n"+
            "/\\\n",

            "+----+\n"+
            "|    O\n"+
            "|   -+-\n"+
            "|   / \\\n"+
            "/\\\n",
        };

    public boolean isntDead() {
        //return true; //max # of wrong guesses is 7
        return numWrongGuesses < HangmanImage.length; //array public instance variable no need for brackets for length 
    }

    public void show(){
        //System.out.println(HangmanImage[0]); //starts at 0, last at 6
        System.out.println(HangmanImage[numWrongGuesses]);
        numWrongGuesses = 1;   
    }

    public void dieSomeMore() {
    numWrongGuesses++;
    }

   
}
