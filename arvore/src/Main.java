import arvore.*;
import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args){
    Tree<Integer> arv = new Tree<Integer>();
    
    arv.insere(new Node<Integer>(5));
    arv.insere(new Node<Integer>(4));
    arv.insere(new Node<Integer>(6));
    arv.insere(new Node<Integer>(3));
    arv.insere(new Node<Integer>(8));
    arv.insere(new Node<Integer>(2));
    arv.insere(new Node<Integer>(7));
    arv.insere(new Node<Integer>(1));
    arv.insere(new Node<Integer>(9));
    arv.insere(new Node<Integer>(0));

    arv.show();
  }
}
