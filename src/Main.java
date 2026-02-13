void main() {
    Scanner inp = new Scanner(System.in);
    boolean keepPlaying = true;
    Random randomNum = new Random();
    int comp;
    String[] choices = {"rock", "paper", "scissors"};
    String compChoice;


    while (keepPlaying) {


        comp = randomNum.nextInt(3);
        compChoice = "";
        IO.println("Rock, paper, scissors!");
        String ans = inp.nextLine().toLowerCase();
        switch (comp) {
            case 0:
                compChoice = choices[0];
                break;
            case 1:
                compChoice = choices[1];
                break;
            case 2:
                compChoice = choices[2];


        }

        while (!ans.equals(choices[0]) && !ans.equals(choices[1]) && !ans.equals(choices[2])) {
            IO.println("Invalid answer! Pick rock, paper or scissors!");
            ans = inp.nextLine().toLowerCase();
        }


        if (ans.equals(choices[0]) && compChoice.equals(choices[1])) {
            IO.println("Player: " + ans + " Computer: " + compChoice + ". Computer wins!");
        } else if (ans.equals(choices[0]) && compChoice.equals(choices[2])) {
            IO.println("Player: " + ans + " Computer: " + compChoice + ". You win!");
        } else if (ans.equals(choices[1]) && compChoice.equals(choices[2])) {
            IO.println("Player: " + ans + " Computer: " + compChoice + ". Computer wins!");
        } else if (ans.equals(choices[2]) && compChoice.equals(choices[1])) {
            IO.println("Player: " + ans + " Computer: " + compChoice + ". You win!");
        } else if (ans.equals(choices[2]) && compChoice.equals(choices[0])) {
            IO.println("Player: " + ans + " Computer: " + compChoice + ". Computer wins!");
        } else if (ans.equals(choices[1]) && compChoice.equals(choices[0])) {
            IO.println("Player: " + ans + " Computer: " + compChoice + ". You win!");
        } else {
            IO.println("Player: " + ans + "Computer: " + compChoice + ". Draw!");
        }
        IO.println("Keep playing? Y/N");
        ans = inp.nextLine().toLowerCase();
        keepPlaying = !ans.equals("n");
    }
}
