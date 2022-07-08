package gente;
import java.io.*;

public class Pessoa implements Serializable{
  private static final long serialVersionUID = 4L;
  private String nome;
  private String email;

  public Pessoa(){}

  public Pessoa(String nome, String email){
    this.nome = nome;
    this.email = email;
  }

  public void show(){
    System.out.println("Nome: " + this.nome);
    System.out.println("Email: " + this.email);
  }

  @Override
  public String toString(){
    return this.nome + " " + this.email;
  }

  public boolean equals(Pessoa p){
    return this.nome.equals(p.getNome()) && this.email.equals(p.getEmail());
  }
  //getters
  public String getEmail(){
      return this.email;
  }
  public String getNome(){
      return this.nome;
  }
  //setters
  public void setEmail(String  email){
      this.email=email;
  }
  public void setNome(String  nome){
      this.nome=nome;
  }
}
