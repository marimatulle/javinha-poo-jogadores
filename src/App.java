public class App {
    public static void main(String[] args) throws Exception {
        Instanciar Pessoa1 = new Instanciar("pequena", "alto", "Dida", "perna predominante = destro", "perna não predominante");
        Instanciar Pessoa2 = new Instanciar("grande", "alto", "Ronaldo", "perna não predominante", "perna predominante = canhoto");
        Instanciar Pessoa3 = new Instanciar("pequena", "baixo", "Juninho", "perna predominante = destro", "perna não predominante");

        System.out.println("Jogador 1: \n" +
                            "Cabeça: " + Pessoa1.getCabeca() + "\n" +
                            "Tronco: " + Pessoa1.getTronco() + "\n" +
                            "Nome: " + Pessoa1.getNome() + "\n" +
                            "Perna Direita: " + Pessoa1.getPernaDireita() + "\n" +
                            "Perna Esquerda: " + Pessoa1.getPernaEsquerda());
        
        System.out.println("Jogador 2: \n" +
                            "Cabeça: " + Pessoa2.getCabeca() + "\n" +
                            "Tronco: " + Pessoa2.getTronco() + "\n" +
                            "Nome: " + Pessoa2.getNome() + "\n" +
                            "Perna Direita: " + Pessoa2.getPernaDireita() + "\n" +
                            "Perna Esquerda: " + Pessoa2.getPernaEsquerda());
        
        System.out.println("Jogador 3: \n" +
                            "Cabeça: " + Pessoa3.getCabeca() + "\n" +
                            "Tronco: " + Pessoa3.getTronco() + "\n" +
                            "Nome: " + Pessoa3.getNome() + "\n" +
                            "Perna Direita: " + Pessoa3.getPernaDireita() + "\n" +
                            "Perna Esquerda: " + Pessoa3.getPernaEsquerda());
    }
}