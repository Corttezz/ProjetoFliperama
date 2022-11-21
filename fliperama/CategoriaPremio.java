package fliperama;

public class CategoriaPremio {
    private String nome;
    private int contagemTicketsNecessarios;
    private int quantidadePremios;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getContagemTicketsNecessarios() {
        return contagemTicketsNecessarios;
    }
    public void setContagemTicketsNecessarios(int contagemTicketsNecessarios) {
        this.contagemTicketsNecessarios = contagemTicketsNecessarios;
    }
    public int getQuantidadePremios() {
        return quantidadePremios;
    }
    public void setQuantidadePremios(int quantidadePremios) {
        this.quantidadePremios = quantidadePremios;
    }  
}
