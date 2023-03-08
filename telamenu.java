import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telamenu extends JFrame{
    private JPanel pnlTelaMenu;
    private JButton btnCadUsuario;
    private JButton btnCadProduto;

    public telamenu(){

        createListener(); // chamando a função
        iniciarComponentes(); // chamando a função
    }
    public  void createListener(){      //minha função

        iniciarComponentes();
        btnCadUsuario.addActionListener(new ActionListener() {     //"ouvir" ação do clique
            @Override
            public void actionPerformed(ActionEvent e) {    //execução da ação

                cadUsuario usuario = new cadUsuario(); //abrir a tela do usuário. instanciando a classe usuario dentro da tela menu.
                usuario.setVisible(true);
                dispose();

            }
        });

        btnCadProduto.addActionListener(new ActionListener() { //chamar as telas
            @Override
            public void actionPerformed(ActionEvent e) {

                cadProduto produto = new cadProduto(); //abrir a tela do usuário. instanciando a classe produto dentro da tela menu.
                produto.setVisible(true);
                dispose();
            }
        });
    }

    public void iniciarComponentes(){       //aparecer na tela

        setTitle("Tela Menu");
        setSize(300,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(pnlTelaMenu);
        setVisible(true);
    }

    public static void main(String[] args) {
        telamenu menu = new telamenu();
    }
}
