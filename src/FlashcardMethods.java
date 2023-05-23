import java.util.ArrayList;
import java.util.Scanner;
public class FlashcardMethods {

    public static void createCard(ArrayList<Flashcard> cardList){
        Flashcard card = new Flashcard();
        Scanner input = new Scanner(System.in);
        System.out.println("What would you like the FRONT of your card to say?");
        String input1 = input.nextLine();
        System.out.println("What would you like the BACK of your card to say?");
        String input2 = input.nextLine();
        card.setMainText(input1);
        card.setBackText(input2);
        cardList.add(card);
    }

    public static void printCardList(ArrayList<Flashcard> cardList){
        System.out.println("Your list of flashcards: \n");
        for (int i = 0; i < cardList.size();i++)
        {
            System.out.println( i+1 +". (" + cardList.get(i).getMainText() + ", " + cardList.get(i).getBackText() + ")");
        }
    }

    public static void editCardList(ArrayList<Flashcard> cardList){
        Scanner input = new Scanner(System.in);
        FlashcardMethods.printCardList(cardList);
        System.out.println("Which item would you like to edit? (Enter corresponding number)");
        int index = input.nextInt();
        // add way to edit the card at specific element
    }


    public static String quiz(ArrayList<Flashcard> cardList){
        Scanner input = new Scanner(System.in);
        return "a";
    }


}
