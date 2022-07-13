import java.io.*;
import java.util.Vector;
import gente.Aluno;

public class Arquivo{
  private String path;

  public Arquivo(){}
  public Arquivo(String path){
    this.path = path;
  }

  public boolean gravaAlunos(Vector<Aluno> alunos){
    try{
      FileOutputStream file = new FileOutputStream(this.path);
      ObjectOutputStream out = new ObjectOutputStream(file);
      for(Aluno p: alunos){
        out.writeObject(p);
        out.flush();
      }
      out.writeObject(null);
      out.close();
    } catch(java.io.IOException exc) {
      System.out.println("Erro ao salvar arquivo");
      System.out.println(exc);
      return false;
    }
    return true;
  }

  public Vector<Aluno> leAlunos(){
    try{
      FileInputStream file = new FileInputStream(this.path);
      ObjectInputStream in = new ObjectInputStream(file);
      Vector<Aluno> alunos = new Vector<Aluno>();
      Aluno a;
      do {
        a = (Aluno) in.readObject();
        alunos.add(a);
      } while (a != null); 
      alunos.remove(alunos.size()-1);
      in.close();
      return alunos;

    } catch(java.io.IOException exc) {
      System.out.println("Erro ao ler o arquivo");
      System.out.println(exc);
      return null;

    } catch(ClassNotFoundException cnfex){
      System.out.println("Erro ao ler o arquivo");
      System.out.println(cnfex);
      return null;
    }
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
