package triviaoo;

public class Tupla {
    private String pergunta;
    private String resposta;
    private boolean acertou=false;
    
    public Tupla(String pergunta, String resposta){
        setPergunta(pergunta);
        setResposta(resposta);
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public boolean acertou() {
        return acertou;
    }

    public void setAcertou() {
        this.acertou = true;
    }
    
}
