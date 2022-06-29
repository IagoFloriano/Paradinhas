import gente.Aluno;
import java.io.*;
import java.util.*;

class ManterAluno{
  private Vector<Aluno> alunos;

  public ManterAluno(){
    this.alunos = new Vector<Aluno>();
  }

  public void inserirAluno(Aluno a){
    this.alunos.add(a);
  }
  
  public void removerAluno(Aluno a){
    this.alunos.remove(a);
  }
  
  public void salvarAlunos(String path){
    Arquivo arq = new Arquivo(path);
    arq.gravaAlunos(this.alunos);
  }

  public void recuperarAlunos(String path){
    Arquivo arq = new Arquivo(path);
    this.alunos = arq.leAlunos();
  }

  public void imprimirAlunos(){
    for (Aluno a: this.alunos){
      System.out.println(a);
    }
  }
}
