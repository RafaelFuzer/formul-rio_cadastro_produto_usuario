import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cadProduto extends JFrame {
    private JTextField textcodigo;
    private JTextField textdescricao;
    private JTextField textpreco;
    private JTextField textestoque;
    private JLabel txtcodigo;
    private JLabel txtdescricao;
    private JLabel txtpreco;
    private JLabel txtestoque;
    private JButton OKButton;
    private JPanel pnlcadProduto;       //tela

    public cadProduto(){

        createListeners();
        iniciarComponentes();
        }

    public void createListeners(){

        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String codigo = textcodigo.getText(); //pegando o valor dentro do campo de texto
                String descricao = textdescricao.getText();
                String preco = textpreco.getText();
                String estoque = textestoque.getText();

                JOptionPane.showMessageDialog(OKButton, "Código produto: " + textcodigo.getText() +
                        "\nDescrição produto: "+ textdescricao.getText() +
                        "\nPreço: " + textpreco.getText() +
                        "\nQuantidade em estoque:" + textestoque.getText());
            }
        });
    }

    public void iniciarComponentes(){       //aparecer na tela

        setTitle("Tela Menu");
        setSize(300,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(pnlcadProduto); //chamar a tela
        setVisible(true);
    }
}
