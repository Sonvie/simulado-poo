// Questão 04

import java.util.ArrayList;
import java.util.List;

public class GestaoPedidos {
    private List<String> pedidos;

    public GestaoPedidos(){
        this.pedidos = new ArrayList<>();
    }

    public void adicionarPedido(String item){
        pedidos.add(item);
    }

    public String proximoPedido(){
        if (pedidos.get(0) == null){
            return "Fila Vazia.";
        }
        String pedido = pedidos.get(0);
        pedidos.remove(0);
        return pedido;
    }

    public int quantidadePendentes(){
        return pedidos.size();
    }

    public void listarPedidos(){
        for (int i = 0; i < pedidos.size(); i++){
            System.out.println(pedidos.get(i));
        }
    }

    public static void main(String args[]){
        GestaoPedidos pedidos = new GestaoPedidos();
        pedidos.adicionarPedido("Notebook");
        pedidos.adicionarPedido("Celular");
        pedidos.adicionarPedido("Carregador");

        pedidos.proximoPedido();

        System.out.println("Quantidade de pedidos: " + pedidos.quantidadePendentes());
    }

}

