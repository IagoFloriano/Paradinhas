package gente;

public class Aluno extends Pessoa{
  private String grr;

  public Aluno(){}
  public Aluno(String nome, String email, String grr){
    super(nome, email);
    this.grr = grr;
  }

  public void show(){
    super.show();
    System.out.println("GRR: " + this.grr);
  }

  @Override
  public String toString(){
    return super.toString() + " GRR:" + this.grr;
  }

  public boolean equals(Aluno a){
    return super.equals(a) && this.grr.equals(a.getGrr());
  }

  //getters
  public String getGrr(){
      return this.grr;
  }

  //setters
  public void setGrr(String  grr){
      this.grr=grr;
  }
}
