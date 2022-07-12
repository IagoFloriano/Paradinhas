import java.util.*;
import java.io.*;
import gente.Aluno;
import list.Lista;

public class CadastraAluno extends Lista<Aluno>{
  private Arquivo file;
  private String filepath;
  private Vector<Aluno> buffer;
  private boolean bufferSynced;

  public CadastraAluno(){
    super();
    this.file = null;
    this.filepath = null;
    this.buffer = null;
    this.bufferSynced = true;
  }

  public void insereAluno(String nome, String email, String grr){
    Aluno a = new Aluno(nome, email, grr);
    super.insere(a);
    this.bufferSynced = false;
  }

  public String getFilepath(){
    return this.filepath;
  }

  public void setFilepath(String newPath){
    this.filepath = newPath;
    this.file = new Arquivo(this.filepath);
  }
}
