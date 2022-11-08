package fliperama;

public class Jogo {
    private int quantidadeCreditos;
    private String nomeJogo;

    public int getQuantidadeCreditos() {
        return quantidadeCreditos;
    }

    public void setQuantidadeCreditos(int quantidadeCreditos) {
        this.quantidadeCreditos = quantidadeCreditos;
    }

    public String getNomeJogo() {
        return nomeJogo;
    }

    public void setNomeJogo(String nomeJogo) {
        this.nomeJogo = nomeJogo;
    }

     public void passarCartaoParaJogar (Cartao cartao){
        int cartaoSaldoTicekts = cartao.getSaldoTickets();

        if(cartao.getSaldoAtual() >= quantidadeCreditos){
            cartao.setSaldoAtual(cartao.getSaldoAtual() - quantidadeCreditos);
            int ticketsGanhos = 100;
            cartao.setSaldoTickets(cartaoSaldoTicekts + ticketsGanhos);
            System.out.format("O número do cartão é: %d, e o número de tickets ganhos foi de: %d", cartao.getNumeroCartao(), ticketsGanhos);
            System.out.println("");
            System.out.format("O novo saldo de créditos atual é de %d, e de tickets é de: %d", cartao.getSaldoAtual(), cartao.getSaldoTickets());
            System.out.println("");
        } else {
            System.out.println("Saldo insuficiente.");
        }  
     }   
}
