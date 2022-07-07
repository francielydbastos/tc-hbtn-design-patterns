import java.util.HashSet;

public class Pedido {
    private HashSet<ItemPedido> itensDentroCaixa = new HashSet<>();
    private HashSet<ItemPedido> itensForaCaixa = new HashSet<>();

    public void adicionarItemDentroCaixa(ItemPedido item) {
        this.itensDentroCaixa.add(item);
    }

    public void adicionarItemForaCaixa(ItemPedido item) {
        this.itensForaCaixa.add(item);
    }

    @Override
    public String toString() {
        String pedidoString = "\tFora da Caixa:\n";

        for (ItemPedido item : this.itensForaCaixa) {
            pedidoString = pedidoString.concat("\t\t- " + item.getTipo() + " " + item.getNome() + "\n");
        }

        pedidoString = pedidoString.concat("\tDentro da Caixa:\n");

        for (ItemPedido item : this.itensDentroCaixa) {
            pedidoString = pedidoString.concat("\t\t- " + item.getTipo() + " " + item.getNome() + "\n");
        }

        return pedidoString;
    }
}
