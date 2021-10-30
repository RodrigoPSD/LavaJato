import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        //JOptionPane.showMessageDialog(null, "Bem vindo a sua Agenda");
        LavaJato lavaJato = new LavaJato();

        Object[] opcoes = { "Cadastrar carro", "Ver carros cadastrados", "Excluir", "Editar cadastro", "Sair"};
        int escolha = 0;
        int id = 0;

        do {
            escolha = JOptionPane.showOptionDialog(null, "O que você quer fazer?", "Aviso", JOptionPane.DEFAULT_OPTION,
                      JOptionPane.WARNING_MESSAGE, null, opcoes, opcoes[0]);

            switch (escolha) {
                case 0:
                    Carro cadastro = new Carro();
                    cadastro.setMarca(JOptionPane.showInputDialog(null, "Digite a marca do seu carro: "));
                    cadastro.setModelo(JOptionPane.showInputDialog(null, "Digite o modelo do seu carro: "));
                    cadastro.setCor(JOptionPane.showInputDialog(null, "Digite a cor do seu carro: "));
                    cadastro.setPlaca(JOptionPane.showInputDialog(null, "Digite placa do seu carro: "));
                    lavaJato.incluir(cadastro);
                    break;

                case 1:                
                    JOptionPane.showMessageDialog(null, lavaJato.verLIsta());
                    break;
                case 2:                
                    id = Integer.parseInt(JOptionPane.showInputDialog(null, lavaJato.verLIsta() + "Digite o id de quem você deseja excluir"));
                    lavaJato.excluir(id);
                    break;
                case 3:                
                    id = Integer.parseInt(JOptionPane.showInputDialog(null, lavaJato.verLIsta() + "Digite o id de quem você deseja alterar"));
                    Carro cadastroAlterar = new Carro();
                    cadastroAlterar.setMarca(JOptionPane.showInputDialog(null, "Digite o marca do seu carro: "));
                    cadastroAlterar.setModelo(JOptionPane.showInputDialog(null, "Digite o modelo do seu carro: "));
                    cadastroAlterar.setCor(JOptionPane.showInputDialog(null, "Digite a cor do seu carro: "));
                    cadastroAlterar.setPlaca(JOptionPane.showInputDialog(null, "Digite placa do seu carro: "));
                    lavaJato.atualizar(id, cadastroAlterar);
                    break;
                default:
                    break;
            }
        } while (escolha !=4);
    }
}
