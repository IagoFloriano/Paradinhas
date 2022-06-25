import gente.*;
import java.io.*;
import java.util.Vector;

public class Main{

  public static void main(String[] args){
    Arquivo arq = new Arquivo("arquivo");
    Vector<Aluno> alunos = new Vector<Aluno>(0);
    for (int i = 0; i < 10; i++){
      Aluno temp = new Aluno("Nome" + i, "email@" + i + ".com", Integer.toString(i));
      alunos.add(temp);
    }

    arq.gravaAlunos(alunos);
    for (Aluno aluno: alunos)
      System.out.println(aluno.toString());

    alunos = arq.leAlunos();
    System.out.println(alunos.size());

    for (Aluno aluno: alunos)
      System.out.println(aluno.toString());

  }

}
