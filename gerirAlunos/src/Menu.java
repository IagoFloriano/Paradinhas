import java.util.*;
import java.io.*;
import gente.Aluno;

class Menu{

  Scanner kbd;

  private ManterAluno ma;

  Menu(){
    ma = new ManterAluno();
    kbd = new Scanner(System.in);
  }

  public boolean darEscolha(){
    System.out.println("Digite o número da escolha:");
    System.out.println("1) Inserir Aluno");
    System.out.println("2) Remover Aluno");
    System.out.println("3) Salvar Alunos");
    System.out.println("4) Recuperar Alunos");
    System.out.println("5) Imprimir Alunos");
    System.out.println("0) Fechar programa");
    int choice;
    choice = kbd.nextInt();
    switch(choice){
      case 1:
        inserir();
        break;
      case 2:
        remover();
        break;
      case 3:
        salvar();
        break;
      case 4:
        recuperar();
        break;
      case 5:
        imprimir();
        break; 
      case 0:
        return false;
      default:
        System.out.println("Dê uma entrada valida");
    }

    return true;
  }

  private void inserir(){
    String nome, email, grr;
    System.out.println("Nome do aluno a inserir:");
    nome = kbd.next();
    System.out.println("Email do aluno a inserir:");
    email = kbd.next();
    System.out.println("Grr do aluno a inserir:");
    grr = kbd.next();

    Aluno a = new Aluno(nome, email, grr);
    ma.inserirAluno(a);
  }

  private void remover(){
    imprimir();
    String nome, email, grr;
    System.out.println("Nome do aluno a remover:");
    nome = kbd.next();
    System.out.println("Email do aluno a remover:");
    email = kbd.next();
    System.out.println("Grr do aluno a remover:");
    grr = kbd.next();

    Aluno a = new Aluno(nome, email, grr);
    ma.removerAluno(a);
  }

  private void salvar(){
    System.out.println("Nome do arquivo para salvar alunos:");
    String path = kbd.next();
    ma.salvarAlunos(path);
  }
  
  private void recuperar(){
    System.out.println("Nome do arquivo para ler alunos:");
    String path = kbd.next();
    ma.recuperarAlunos(path);
  }

  private void imprimir(){
    System.out.println("Lista de alunos:");
    ma.imprimirAlunos();
  }
}
