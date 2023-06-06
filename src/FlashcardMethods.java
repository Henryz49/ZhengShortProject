
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
            System.out.println( i+1 +". (" + cardList.get(i).getMainText()
                    + ":  " + cardList.get(i).getBackText() + ")");
        }
    }

    public static void editCardList(ArrayList<Flashcard> cardList){

        Scanner input = new Scanner(System.in);
        FlashcardMethods.printCardList(cardList);
        System.out.println("Which item would you like to edit? (Enter corresponding number)");
        int index = Integer.parseInt(input.nextLine());
        String input1 = "";
        String input2 = "";

            System.out.println("Would you like to edit the (f)ront, (b)ack, or both?)");
            String editParts = input.nextLine().toLowerCase();
            if (editParts.equals("a") || editParts.equals("both")) {
                System.out.println("What would you like the FRONT of your card to say?");
                input1 = input.nextLine();
            }
            if (editParts.equals("b") || editParts.equals("both")) {
                System.out.println("What would you like the BACK of your card to say?");
                input2 = input.nextLine();

        }
        Flashcard card = new Flashcard();
        card.setMainText(input1);
        card.setBackText(input2);
        cardList.set(index - 1, card);
    }

    public static void removeCard(ArrayList<Flashcard> cardList){
        Scanner input = new Scanner(System.in);
        FlashcardMethods.printCardList(cardList);
        System.out.println("Which item would you like to remove? (Enter corresponding number)");
        int index = Integer.parseInt(input.nextLine());
        cardList.remove(index-1);
        System.out.print("Done");
    }
    public static void practice(ArrayList<Flashcard> cardList){
        Scanner input = new Scanner(System.in);
        int correct = 0;
        int len = cardList.size();
        System.out.println("\n \n \n \n \n \n \n \n \n");
        System.out.println("Input the correct BACK text of these flash cards");
        for(Flashcard card: cardList){
            System.out.print(card.getMainText() + " : ");
            String answer = input.nextLine();
            if(answer.equals(card.getBackText())){
                correct++;
                System.out.println("Correct!");
            } else{
                System.out.println("Incorrect!");
            }
        }
        double temp = correct;
        double percent = temp/len * 100;
        System.out.println("You got " + correct + " out of " + len + " correct!\nThat is a percent score of " + percent + "%");
        if(percent >= 65){
            System.out.println("You are passing");
        } else {System.out.println("You are failing!");}
    }
    public static void practice2(ArrayList<Flashcard> cardList){
        Scanner input = new Scanner(System.in);
        int correct = 0;
        int len = cardList.size();
        System.out.println("\n \n \n \n \n \n \n \n \n");
        System.out.println("Input the correct FRONT text of these flash cards");
        for(Flashcard card: cardList){
            System.out.print(card.getBackText()+ " : ");
            String answer = input.nextLine();
            if(answer.equals(card.getMainText())){
                correct++;
                System.out.println("Correct!");
            } else{
                System.out.println("Incorrect!");
            }
        }
        double temp = correct;
        double percent = temp/len * 100;
        System.out.println("You got " + correct + " out of " + len + " correct!\nThat is a percent score of " + percent + "%");
        if(percent >= 65){
            System.out.println("You are passing");
        } else {System.out.println("You are failing!");}
    }
}


