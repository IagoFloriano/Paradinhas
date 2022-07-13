import java.util.*;
import java.io.*;
import gente.Aluno;
import list.Lista;

public class Main{
  public static void main(String[] args){
    CadastraAluno teste = new CadastraAluno("arq.arq");
    //teste.insereAluno("Aluno 1", "Email 1", "grr 1");
    //teste.insereAluno("Aluno 2", "Email 2", "grr 2");
    //teste.insereAluno("Aluno 3", "Email 3", "grr 3");
    //teste.insereAluno("Aluno 4", "Email 4", "grr 4");
    //teste.insereAluno("Aluno 5", "Email 5", "grr 5");
    //teste.insereAluno("Aluno 6", "Email 6", "grr 6");

    //System.out.println("Imprimir Lista ------------------");
    //teste.print("\n");
    //teste.gravaAlunos();

    teste.leAlunos();
    System.out.println("Imprimir Lista ------------------");
    teste.print("\n");
  }
}
