import gente.*;
import java.io.*;

public class Main{

  public static void main(String[] args){
    Aluno teste = new Aluno("Aluno", "Aluno@email.aluno", "1209384");
    System.out.println(teste.getNome() + " " + teste.getEmail());
  }

}
