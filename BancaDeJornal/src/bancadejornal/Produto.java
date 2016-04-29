
package bancadejornal;


public class Produto {
    
    private String nome;
    private String editora;
    private int quantidade;
    
    Produto(String nome, String editora, int quantidade){
        this.nome = nome;
        this.editora = editora;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
    
}
