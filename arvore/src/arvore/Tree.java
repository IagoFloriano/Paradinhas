package arvore;
import java.io.*;

public class Tree<E extends Comparable<E> & Serializable>{
  private Node<E> root;

  public Tree(){
    this.root = null;
  }

  public void insere(Node<E> n){
    if(this.root == null)
      this.root = n;
    else
      this.root.insere(n);
  }

  public void show(){
    if (this.root != null)
      this.root.show();
  }
}
