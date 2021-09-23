package triviaoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TriviaBase {
    
    List<Tupla> perguntasERespostas=new ArrayList<>();
    int perguntaEscolhida=-1;
    String respostaDigitada="";
    
    public void adicionaQuestao(String pergunta, String resposta){
        Tupla t=new Tupla(pergunta,resposta);
        perguntasERespostas.add(t);
    }
    
     public void adicionaQuestao(Tupla t){  
        perguntasERespostas.add(t);
    }
    
    public Tupla getTuplaSorteada(){
        return perguntasERespostas.get(perguntaEscolhida);
    }
    
    
    public void sortear(){
        perguntaEscolhida=(int)(Math.random()*perguntasERespostas.size());
    }
    public void perguntar(){
        Scanner leitor=new Scanner(System.in);
        Tupla t=getTuplaSorteada();
        System.out.println(t.getPergunta());
        //espera usuário digitar um valor   
        respostaDigitada=leitor.next();
    }
    public void mostrarResultado(){
        
        Tupla t = perguntasERespostas.get(perguntaEscolhida);
        String res = t.getResposta();
        if(respostaDigitada.equals(res)){
            System.out.println("Resposta Correta!");
        }
        else{
            System.out.println("Resposta Errada!");
        }
    }
}
