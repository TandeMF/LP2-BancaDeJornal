
package bancadejornal;


public class LDP {
    private static int contador;
    private static Produto[] lista;
    
    LDP(int x){
        contador = 0;
        lista = new Produto[x]; 
    }
    
    public static void cadastroProduto(String nome, String editora, int quantidade){
        
        Produto x = new Produto(nome, editora, quantidade);
        lista[contador] = x;
        contador++;
    }
    
    public static String listarProdutos(){
        
        String x = "";
        
        for(int i=0; i < contador; i++){
            x = x + i + "   " + lista[i].getNome() + "    " + lista[i].getQuantidade() + "\n";
        }
        
        return x;
        
    }
    
}
