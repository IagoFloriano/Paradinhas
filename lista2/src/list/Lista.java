package list;
import java.io.*;
import java.util.*;

interface Iterator<T>{
  boolean hasNext();
  T next();
}

public class Lista<T extends Serializable> implements Iterator<T>{
  private No primeiro;
  private No ultimo;
  private int tam;
  private No atual;

  public Lista(){
    this.primeiro = null;
    this.ultimo = null;
    this.tam = 0;
    this.atual = null;
  }
  
  public boolean vazia(){return this.tam==0;}
  public int tamanho(){return this.tam;}

  public void insere(T e){
    No novo = new No(this.primeiro, e);
    this.primeiro = novo;
    if (this.vazia()) this.ultimo = novo;
    this.tam++;
  }

  public T remove(){
    if (this.vazia()) return null;
    if (this.ultimo == this.primeiro)
      this.ultimo = null;
 
    T temp = this.primeiro.getElem();

    this.primeiro = this.primeiro.getProx();
    this.tam--;
    return temp;
  }

  public void print(){
    No temp = this.primeiro.getProx();
    System.out.print(this.primeiro);
    while(temp!=null){
      System.out.print(" " + temp);
      temp = temp.getProx();
    }
    System.out.print("\n");
  }

  public void print(String before){
    No temp = this.primeiro.getProx();
    System.out.print(this.primeiro);
    while(temp!=null){
      System.out.print(before + temp);
      temp = temp.getProx();
    }
    System.out.print("\n");
  }

  public Vector<T> toVector(){
    Vector<T> r = new Vector<T>();
    No temp = this.primeiro;
    while(temp != null){
      r.add(temp.getElem());
      temp = temp.getProx();
    }
    return r;
  }

  public void fromVector(Vector<T> v){
    this.primeiro = null;
    this.ultimo = null;
    this.tam = 0;
    for(T e:v){
      this.insere(e);
    }
  }

  public boolean hasNext(){
    if(this.atual == null) return false;
    return true;
  }
  
  public T next(){
    if(this.atual == null) return null;
    No aux = atual;
    this.atual = aux.getProx();
    return aux.getElem();
  }
  
  public Lista<T> Iterator(){
    this.atual = this.primeiro;
    return this;
  }

  private class No{
    private No prox;
    private T elem;

    public No(){}
    public No(No prox, T elem){
      this.prox = prox;
      this.elem = elem;
    }

    @Override
    public String toString(){
      return this.elem.toString();
    }

    public No getProx(){return this.prox;}
    public void setProx(No prox){this.prox = prox;}
    public T getElem(){return elem;}
    public void setElem(T elem){this.elem = elem;}
  }
}
