import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        //Initializes the user input
        Scanner input = new Scanner(System.in);
        ArrayList<Flashcard> cardList = new ArrayList<>();

        boolean running = true; //keeps the code going until the user wants to stop it
        while(running){

            System.out.println("\nWhat would you like to do? Would you like to: \n (C)reate new flashcard \n (R)emove a flashcard \n (E)dit a flashcard \n " +
                    "(P)ractice \n (S)how flashcards \n (End) program" );
            String userInput = input.nextLine().toLowerCase();

            if(userInput.equals("end")){
                System.out.println("Thank you for using the program.");
                running = false;
            }

            else if(userInput.equals("s")){
                if(cardList.size() > 0){
                FlashcardMethods.printCardList(cardList);}
                else{System.out.println("You do not have anything in your list, try creating some flashcards first.");}
            }
            else if(userInput.equals("r")){
                if(cardList.size() > 0){
                    FlashcardMethods.removeCard(cardList);}
                else{System.out.println("You do not have anything in your list, try creating some flashcards first.");}
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

            else if(userInput.equals("p")){
                if(cardList.size() > 0){
                    FlashcardMethods.practice(cardList);}
                else{System.out.println("You do not have anything in your list, try creating some flashcards first.");}
            }


        }
    }
}