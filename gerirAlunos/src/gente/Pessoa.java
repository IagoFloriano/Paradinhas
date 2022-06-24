package gente;

public class Pessoa{
  private String nome;
  private String email;

  public Pessoa(){}

  public Pessoa(String nome, String email){
    this.nome = nome;
    this.email = email;
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
