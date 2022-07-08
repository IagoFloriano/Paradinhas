import java.util.*;
import java.io.*;
import gente.Aluno;
import list.Lista;

public class Main{
  public static void main(String[] args){
    Lista<Aluno> teste = new Lista<Aluno>();
    Aluno a = new Aluno("nome1", "email1", "grr1");
    teste.insere(a);
    a = new Aluno("nome2", "email2", "grr2");
    teste.insere(a);
    a = new Aluno("nome3", "email3", "grr3");
    teste.insere(a);
    a = new Aluno("nome4", "email4", "grr4");
    teste.insere(a);
    a = new Aluno("nome5", "email5", "grr5");
    teste.insere(a);
    a = new Aluno("nome6", "email6", "grr6");
    teste.insere(a);

    System.out.println("Imprimir Lista ------------------");
    teste.print();

    Vector<Aluno> v = teste.toVector();
    System.out.println("Imprimir Vector------------------");
    for(Aluno temp: v){
      System.out.println(temp);
    }
    
    while(!teste.vazia()){
      teste.remove();   
    }

    teste.fromVector(v);

    teste.print();

  }
}
