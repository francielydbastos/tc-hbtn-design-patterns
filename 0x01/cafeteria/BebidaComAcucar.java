import java.util.List;

public class BebidaComAcucar extends BebidaDecorator {

    public BebidaComAcucar(Bebida bebida) {
        super(bebida);
    }

    @Override
    public List<String> obterIngredientes() {
        List<String> ingredientesSuper = super.obterIngredientes();
        ingredientesSuper.add("acucar");
        return ingredientesSuper;
    }

    @Override
    public double obterPreco() {
        return super.obterPreco() + 1.9;
    }
}
