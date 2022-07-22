import list.Lista;
import gente.*;

public class ListaDeAluno extends Lista<Aluno>{
  private static ListaDeAluno uniqueInstance;

  private ListaDeAluno(){
    super();
  }

  public static synchronized ListaDeAluno getInstance(){
    if(uniqueInstance == null){
      uniqueInstance = new ListaDeAluno();
    }
    return uniqueInstance;
  }
}
