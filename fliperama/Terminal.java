package fliperama;

public class Terminal {
    
    public void transferirCredito(Cartao cartao1, Cartao cartao2, int creditos){
        int saldoDoCartao1 = cartao1.getSaldoAtual();
        int saldoDoCartao2 = cartao2.getSaldoAtual();

        if(saldoDoCartao1 >= creditos){
            cartao1.setSaldoAtual(saldoDoCartao1 - creditos);
            cartao2.setSaldoAtual(saldoDoCartao2 + creditos);
        }else{
            System.out.println("Saldo insuficiente.");
        }
    }

    public void verificarSaldoCartao (Cartao cartao){
        int saldoCartao = cartao.getSaldoAtual();
        int numeroCartao = cartao.getNumeroCartao();
        System.out.format("O saldo de crédito do cartão de número, %d é de %d, já o saldo de tickets é de %d",numeroCartao ,saldoCartao, cartao.getSaldoTickets());
        System.out.println("");
    }

    public void trocarTicketPorPrêmio(Cartao cartao, CategoriaPremio premio, int quantidadePremios){
        int saldoTickets = cartao.getSaldoTickets();
        int contagemTicketsNecessarios = premio.getContagemTicketsNecessarios();
        int premiosDisponiveis = premio.getQuantidadePremios();

        if(saldoTickets >= contagemTicketsNecessarios * quantidadePremios){
           saldoTickets = saldoTickets - contagemTicketsNecessarios;
           premiosDisponiveis = premiosDisponiveis - quantidadePremios;
           System.out.format("%d prêmios foram resgatados, e sobrou um saldo de tickets de %d.",quantidadePremios, saldoTickets);
           System.out.println("");
        }else{
            System.out.println("Saldo insuficiente.");
        }
    }
}
