public class Flashcard {
    private String mainText;
    private String backText;

    public Flashcard(){
        mainText = null;
        backText = null;
    }

    public String getMainText() {
        return mainText;
    }

    public String getBackText() {
        return backText;
    }

    public void setBackText(String newText){
        this.backText = newText;
    }

    public void setMainText(String newText){
        this.mainText = newText;
    }
}
