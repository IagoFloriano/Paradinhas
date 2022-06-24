package gente;

public class Aluno extends Pessoa{
  private String grr;

  public Aluno(){}
  public Aluno(String nome, String email, String grr){
    super(nome, email);
    this.grr = grr;
  }

  //getters
  public String getGrr()
  {
      return this.grr;
  }

  //setters
  public void setGrr(String  grr)
  {
      this.grr=grr;
  }
}
