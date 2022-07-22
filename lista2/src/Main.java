import java.util.*;
import java.io.*;
import gente.Aluno;
import list.Lista;

public class Main{
  public static void main(String[] args){
    CadastraAluno teste = new CadastraAluno("arq.arq");
    teste.insereAluno("Nome1", "Email1", "1");
    teste.insereAluno("Nome2", "Email2", "2");
    teste.insereAluno("Nome3", "Email3", "3");
    teste.insereAluno("Nome4", "Email4", "4");
    teste.insereAluno("Nome5", "Email5", "5");
    teste.insereAluno("Nome6", "Email6", "6");

    teste.imprime();
  }
}
