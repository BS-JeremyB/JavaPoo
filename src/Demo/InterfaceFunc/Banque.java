package Demo.InterfaceFunc;

import java.util.ArrayList;
import java.util.List;

public class Banque {

    //Liste de méthodes respectant la signature de l'I-F Custom
    private List<IFDelegate> event = new ArrayList<>();

    private Double solde;

    public Banque(Double solde) {
        this.solde = solde;
    }

    public Double getSolde() {
        return solde;
    }

    public void setSolde(Double solde) {
        this.solde = solde;
        if(this.solde < 0){

            //Trigger l'appel des evenements
            raise();
        }
    }

    public void subscribe(IFDelegate i){
        event.add(i);
    }

    private void raise(){
        //Parcours les méthodes encadrées par l'I-F
        for (IFDelegate i : event){
            i.execute();
        }
    }
}
