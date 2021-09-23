package triviaoo;


public class JogoTrivia {
    
    private TriviaBase trivia;

    public TriviaBase getTrivia() {
        return trivia;
    }

    public void setTrivia(TriviaBase trivia) {
        this.trivia = trivia;
    }
    
    public void jogar(){
        trivia.sortear();
        trivia.perguntar();
        trivia.mostrarResultado();
    }
}
