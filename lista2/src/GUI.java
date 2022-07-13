import java.util.*;
import java.io.*;
import gente.Aluno;
import list.Lista;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame implements ActionListener{
  private JButton B1,B2;
  private JLabel L1, L2;
  private JTextField T1,T2;
  private static final long serialVersionUID = 4L;

  public GUI(){
    B1 = new JButton("Botao 1");
    B2 = new JButton("Botao 2");
    B1.addActionListener(this);
    B2.addActionListener(this);
    L1 = new JLabel("Label 1");
    L2 = new JLabel("Label 2");
    T1 = new JTextField("TextField 1");
    T2 = new JTextField("TextField 2");
    this.getContentPane().setLayout(new FlowLayout());
    this.getContentPane().add(L1);
    this.getContentPane().add(T1);
    this.getContentPane().add(L2);
    this.getContentPane().add(T2);
    this.getContentPane().add(B1);
    this.getContentPane().add(B2);
    this.setLocation(200,200);
    this.setSize(200,150);
  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == B1){
      System.out.println("voce pressionou B1"+T1.getText());
    }
    if(e.getSource() == B2){
      System.out.println("voce pressionou B2"+T2.getText());
    }
  }

  public static void main(String[] args){
    JFrame janela = new GUI();
    janela.setVisible(true);
    WindowListener x = new WindowAdapter(){
      public void windowClosing(WindowEvent e){
        System.exit(0);
      }
    };
    janela.addWindowListener(x);
  }
}
