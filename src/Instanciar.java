public class Instanciar {
    private String cabeca;
    private String tronco;
    private String nome;
    private String pernaDireita;
    private String pernaEsquerda;

    public Instanciar(String cabeca, String tronco, String nome, String pernaDireita, String pernaEsquerda) {
        this.cabeca = cabeca;
        this.tronco = tronco;
        this.nome = nome;
        this.pernaDireita = pernaDireita;
        this.pernaEsquerda = pernaEsquerda;
    }

    public String getCabeca() {
        return cabeca;
    }
    public void setCabeca(String cabeca) {
        this.cabeca = cabeca;
    }

    public String getTronco() {
        return tronco;
    }
    public void setTronco(String tronco) {
        this.tronco = tronco;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPernaDireita() {
        return pernaDireita;
    }
    public void setPernaDireita(String pernaDireita) {
        this.pernaDireita = pernaDireita;
    }

    public String getPernaEsquerda() {
        return pernaEsquerda;
    }
    public void setPernaEsquerda(String pernaEsquerda) {
        this.pernaEsquerda = pernaEsquerda;
    }
}
