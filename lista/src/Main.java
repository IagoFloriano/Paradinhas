import list.Lista;
import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args){
    Lista lista = new Lista();
    lista.insere("Elem 1");
    lista.insere("Elem 2");
    lista.insere("Elem 3");
    lista.insere("Elem 4");
    lista.insere("Elem 5");
    lista.insere("Elem 6");
    lista.insere("Elem 7");
    lista.insere("Elem 8");
    lista.print();
    lista.remove();
    lista.remove();
    lista.remove();
    lista.remove();
    lista.print();
  }
}
