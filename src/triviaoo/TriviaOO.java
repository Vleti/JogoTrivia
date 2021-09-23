
package triviaoo;

//import java.util.ArrayList;
//import java.util.List;


public class TriviaOO {
    
    
public static void main(String[] args){
    
    Tupla f1=new Tupla("Fruta verde por fora e vermelha por dentro","melancia");
    Tupla f2=new Tupla("Fruta amarela por dentro com caroço","manga");
    
    Tupla c1=new Tupla("Cor do sol", "laranja");
    Tupla c2=new Tupla("Cor do limão", "verde");
    Tupla c3=new Tupla("Cor do mar", "azul");
    Tupla c4=new Tupla("Cor da terra", "marrom");
    
    TriviaBase t1=new TriviaAnimais();
    t1.adicionaQuestao("Animal felino e noturno", "gato");
    t1.adicionaQuestao("Animal ratinio e noturno", "rato");
    
    TriviaBase t2=new TriviaFrutas();
    t2.adicionaQuestao(f1);
    t2.adicionaQuestao(f2);
    
    TriviaBase t3=new TriviaCores();
    t3.adicionaQuestao(c1);
    t3.adicionaQuestao(c2);
    t3.adicionaQuestao(c3);
    t3.adicionaQuestao(c4);
    
    JogoTrivia jogo=new JogoTrivia();
    jogo.setTrivia(t3);
    jogo.jogar();
}
    

    /*public static void main(String[] args) {
        List<Tupla> listaT=new ArrayList<>();
        
        Tupla obj1=new Tupla("Quem é você?", "Eu sou eu e mais ninguem");
        Tupla obj2=new Tupla("Eu sou eu?", "Não, você sou eu amanha");
        
        listaT.add(obj1);
        listaT.add(obj2);
        
        Tupla x = listaT.get(0);
        x.setPergunta("aaa");
        listaT.get(0).setPergunta("bbb");
        System.out.println("Valor na posicao 0:"+x.getPergunta());
        
        System.out.println(x.getPergunta());
        System.out.println(x.getResposta());
        
        System.out.println("Acertou:"+x.acertou());
        obj1.setAcertou();
        System.out.println("Acertou:"+x.acertou());
        
    }*/
    
}
