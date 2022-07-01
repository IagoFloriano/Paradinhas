package list;
import java.io.*;

public class Lista{
  private No primeiro;
  private No ultimo;
  private int tam;

  public Lista(){
    this.primeiro = null;
    this.ultimo = null;
    this.tam = 0;
  }
  
  public boolean vazia(){return this.tam==0;}

  public void insere(String e){
    No novo = new No(this.primeiro, e);
    this.primeiro = novo;
    if (this.vazia()) this.ultimo = novo;
    this.tam++;
  }

  public void remove(){
    if (this.vazia()) return;
    if (this.ultimo == this.primeiro)
      this.ultimo = null;
    this.primeiro = this.primeiro.getProx();
    this.tam--;
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

  private class No implements Serializable{
    private No prox;
    private String elem;

    public No(){}
    public No(No prox, String elem){
      this.prox = prox;
      this.elem = elem;
    }

    @Override
    public String toString(){
      return this.elem;
    }

    public No getProx(){return prox;}
    public void setProx(No prox){this.prox = prox;}
    public String getElem(){return elem;}
    public void setElem(String elem){this.elem = elem;}
  }
}
