package arvore;
import java.io.*;
import java.util.*;

public class Node<E extends Comparable<E> & Serializable> implements Serializable{
  private E valor;
  private Node<E> menor;
  private Node<E> maior;
  private static final long serialVersionUID = 1337;

  public Node(E value){
    this.valor = value;
    this.menor = null;
    this.maior = null;
  }

  @Override
  public String toString(){
    return this.valor.toString();
  }

  public void show(){
    if (this.menor != null)
      this.menor.show();
    System.out.println(this);
    if (this.maior != null)
      this.maior.show();
  }

  public void insere(Node<E> n){
    if (this.valor.compareTo(n.getValor()) > 0){
      if (this.menor == null)
        this.menor = n;
      else
        this.menor.insere(n);
    }
    else{
      if (this.maior == null)
        this.maior = n;
      else
        this.maior.insere(n);
    }
  }
  //getters
  public Node<E> getMaior(){
      return this.maior;
  }
  public Node<E> getMenor(){
      return this.menor;
  }
  public E getValor()
  {
      return this.valor;
  }

  //setters
  public void setMaior(Node<E>  maior){
      this.maior=maior;
  }
  public void setMenor(Node<E>  menor){
      this.menor=menor;
  }
  public void setValor(E  valor){
      this.valor=valor;
  }
}
