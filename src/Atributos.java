public class Atributos {
    private String tronco;
    private String pernaDireita;
    private String pernaEsquerda;
    private String cabeca;

    public Atributos(String tronco, String pernaDireita, String pernaEsquerda, String cabeca) {
        this.tronco = tronco;
        this.pernaDireita = pernaDireita;
        this.pernaEsquerda = pernaEsquerda;
        this.cabeca = cabeca;
    }

    public String getTronco() {
        return tronco;
    }
    public void setTronco(String tronco) {
        this.tronco = tronco;
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

    public String getCabeca() {
        return cabeca;
    }
    public void setCabeca(String cabeca) {
        this.cabeca = cabeca;
    }
}
