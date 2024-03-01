package Demo.GenericBis;

public class GenericStatic{

    //Methode Static qui gère le type générique
    public static<T> void saluer(T element){
        //Le résultat change en fonction du type passé
        //Instanceof permet de vérifier le type de l'élément reçu en Arg.
        if(element instanceof String){
            System.out.println("Bonjour je suis "+ element);
        }
        else if (element instanceof  Integer) {
            System.out.println("Bonjour j'ai "+ element +" ans");
        }
        else{
            System.out.println("Hello voici mon element : "+ element);
        }
    }
}
