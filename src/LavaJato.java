import java.util.ArrayList;

public class LavaJato {
    private ArrayList<Carro> lsCarro;

    public LavaJato() {
        lsCarro = new ArrayList<>();
    }

    public void incluir(Carro c) {
        lsCarro.add(c);

    }
    
    public void atualizar(int id, Carro c) {
        lsCarro.set(id, c);
        
    }

    public void excluir(int id) {
        lsCarro.remove(id);
    }

    public String verLIsta() {
        String texto = "";
        int i = 0;
        for (Carro c : lsCarro) {
            texto += "[" + i + "] Marca: " + c.getMarca() + "   Modelo: " + c.getModelo() + "   Cor: " + c.getCor() + "   Placa: " + c.getPlaca() + "\n";
            i++;
            }
            return texto;
        
    }
}
