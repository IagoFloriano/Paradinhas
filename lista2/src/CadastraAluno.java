import java.util.*;
import java.io.*;
import gente.Aluno;
import list.Lista;

public class CadastraAluno extends Lista<Aluno>{
  private Arquivo file;
  private String filepath;
  private Vector<Aluno> buffer;
  private boolean bufferSynced;
  private ListaDeAluno lista;

  public CadastraAluno(){
    lista = ListaDeAluno.getInstance();
    this.file = null;
    this.filepath = null;
    this.buffer = null;
    this.bufferSynced = true;
  }

  public CadastraAluno(String filepath){
    lista = ListaDeAluno.getInstance();
    this.filepath = filepath;
    this.file = new Arquivo(filepath);
    this.buffer = null;
    this.bufferSynced = true;
  }

  public boolean gravaAlunos(){
    if(this.filepath == null)
      return false;
   
    if(!this.bufferSynced){
      this.buffer = super.toVector();
      this.bufferSynced = true;
    }

    return this.file.gravaAlunos(this.buffer);
  }

  public boolean gravaAlunos(String filepath){
    this.setFilepath(filepath);
    return this.gravaAlunos();
  }

  public boolean leAlunos(){
    if(this.filepath == null)
      return false;

    this.bufferSynced = true;
    this.buffer = this.file.leAlunos();
    super.fromVector(this.buffer);
    return this.buffer != null;
  }

  public void insereAluno(String nome, String email, String grr){
    Aluno a = new Aluno(nome, email, grr);
    super.insere(a);
    this.bufferSynced = false;
  }

  public void imprime(){
    Lista<Aluno> it = lista.Iterator();
    while(it.hasNext()){
      System.out.println(it.next());
    }
  }

  @Override
  public void insere(Aluno a){
    super.insere(a);
    this.bufferSynced = false;
  }

  @Override
  public Aluno remove(){
    Aluno a = super.remove();
    this.bufferSynced = false;
    return a;
  }

  @Override
  public Vector<Aluno> toVector(){
    if(!this.bufferSynced)
      this.buffer = super.toVector();
    return this.buffer;
  }

  public String getFilepath(){
    return this.filepath;
  }

  public void setFilepath(String newPath){
    this.filepath = newPath;
    this.file = new Arquivo(this.filepath);
  }
}
