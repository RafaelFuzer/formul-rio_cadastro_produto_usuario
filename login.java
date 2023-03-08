import javax.security.auth.spi.LoginModule;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame {
    private JPanel telainicial;
    private JButton OKButton;
    private JPasswordField tswsenha;
    private JTextField textusuario;
    private JLabel lblusuario;
    private JLabel lblsenha;

    public login() {
        iniciarComponentes();
        criarListeners();
}

    public void iniciarComponentes(){

        setTitle("Tela de login");
        setSize(300,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(telainicial);
        setVisible(true);
    }
    public void criarListeners(){

            OKButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    validarLogin();
                }
            });

        }

    private void validarLogin() {
        String usuario = textusuario.getText();
        String senha = new String(tswsenha.getPassword());

        if (usuario.equals("admin") && senha.equals("admin")) {      /*equals comporação*/

            telamenu menu = new telamenu();
            menu.setVisible(true);
            dispose();

        } else {
            JOptionPane.showMessageDialog(this, "Usuário ou senha incorreto");
        }

    }
              public static void main(String[] args){
                login iniciar = new login();
        }


    }
