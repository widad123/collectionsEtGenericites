import java.util.ArrayList;
import java.util.List;

public class GestionnaireDePrets <T>{

    private List<T> prets = new ArrayList<>();

    public void ajouterPret(T pret){
        this.prets.add(pret);
    }

    public T retirerPret(){
        if(!this.prets.isEmpty()){
            return this.prets.removeFirst();
        }
        return null;
    }

    public List<T> listerPrets(){
        return this.prets;
    }

    public int compterPrets(){
        return this.prets.size();
    }

}
