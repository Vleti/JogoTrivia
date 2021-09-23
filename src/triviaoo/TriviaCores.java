
package triviaoo;


public class TriviaCores extends TriviaBase{
 
    public void adicionaQuestao(Tupla t){
        System.out.println("Método na cor");
        perguntasERespostas.add(t);
    }
    
    public void sortear(){
        System.out.println("Sorteando na cor");
        perguntaEscolhida=(int)(Math.random()*perguntasERespostas.size());
    }
}
