import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Flashcard> cardList = new ArrayList<>();
        boolean running = true;

        Flashcard card = new Flashcard();
        card.setMainText("dsd");
        card.setBackText("auhaogsd");
        System.out.println(card.getMainText());
        while(running){
            System.out.println("\nWhat would you like to do? Would you like to: \n (C)reate new flashcard \n (E)dit a flashcard \n (Q)uiz yourself \n (End) program" );
            String userInput = input.nextLine().toLowerCase();

            if(userInput.equals("end")){
                System.out.println("Thank you for using the program.");
                running = false;
            }

            else if(userInput.equals("c")){
                FlashcardMethods.createCard(cardList);
                System.out.println("Done");
                FlashcardMethods.printCardList(cardList);
            }


            else if(userInput.equals("e")){
                if (cardList.size() != 0){
                    FlashcardMethods.editCardList(cardList);
                } else {
                    System.out.println("You cannot do that right now, try creating flashcards first.");
                }
            }


        }
    }
}