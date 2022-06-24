package gente;
import java.io.*;

public class Arquivo{
  private String path;
  private FileOutputStream file;

  public Arquivo(){}
  public Arquivo(String path){
    this.path = path;
  }

  public gravaAlunos(Vector alunos){
    try{
      this.file = new FileOutputStream(path);
      ObjectOutputStream out = new ObjectOutputStream(this.file);
      for(Aluno p: alunos){
        out.writeObject(p);
        out.flush();
      }
      out.close();
    } catch(java.io.IOException exc) {
      System.out.println("Erro ao salvar arquivo");
    }
  }

  public leAlunos(){
  }

  //getters
  public String getPath(){
      return path;
  }
  //setters
  public void setPath(String path){
      this.path=path;
  }
}
