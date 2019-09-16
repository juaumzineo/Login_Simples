
import javax.swing.*;
import java.awt.*;

public class Login extends JFrame{
    public Login(){
        super("Login");
        Container tela = getContentPane();
        setLayout(null);

        JLabel rotulo1 = new JLabel("Login");
        rotulo1.setForeground(new Color(0, 0, 0));
        rotulo1.setBounds(20,40,80,60);
        rotulo1.setFont(new Font("Century Gothic",Font.PLAIN,16));
        tela.add(rotulo1);

        JTextField text1 = new JTextField(50);
        text1.setBounds(100,60,180,20);
        tela.add(text1);

        JLabel rotulo2 = new JLabel("Senha");
        rotulo2.setForeground(new Color(0, 0, 0));
        rotulo2.setBounds(20,80,80,60);
        rotulo2.setFont(new Font("Century Gothic",Font.PLAIN,16));
        tela.add(rotulo2);

        JLabel rotulo3 = new JLabel("Entre com seus dados: ");
        rotulo3.setForeground(new Color(0, 0, 0));
        rotulo3.setBounds(60,0,220,60);
        rotulo3.setFont(new Font("Century Gothic",Font.PLAIN,18));
        tela.add(rotulo3);

        JTextField text2 = new JTextField(50);
        text2.setBounds(100,100,180,20);
        tela.add(text2);

        JButton botao = new JButton("Logar");
        botao.setBounds(50, 150, 100, 30);
        botao.setBackground(new Color(66, 189, 68));
        botao.setForeground(new Color(255,255,255));
        botao.setFont(new Font("Century Gothic",Font.PLAIN,14));
        tela.add(botao);

        JButton botao2 = new JButton("Cancelar");
        botao2.setBounds(170, 150, 100, 30);
        botao2.setBackground(new Color(188, 0, 12));
        botao2.setForeground(new Color(255,255,255));
        botao2.setFont(new Font("Century Gothic",Font.PLAIN,14));
        tela.add(botao2);

        setSize(350, 250);
        setVisible(true);
        tela.setBackground(new Color(255, 255, 255));


    }


    public static void main(String args[]){
        Login app = new Login();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); } }
