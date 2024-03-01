package Demo.InterfaceFunc;

public class Main {
    public static void main(String[] args) {

//        //#region IF
//
//        // Interface fonctionelle avec Demo.Lambda
//        Runnable run = () -> System.out.println("run I-F");
//        run.run();
//
//
//        //Interface fonctionelle avec la classe anonyme
//        Runnable interfaceFonctionelle = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("run I-F");
//            }
//        };
//        interfaceFonctionelle.run();
//
//        //Interface fonctionelle depuis une classe
//        IF intFonc = new IF();
//        intFonc.run();
//
//
//        //Interface Consumer
//        Consumer<String> consume = (valeur) -> System.out.println("Bonjour Mr : "+ valeur);
//        consume.accept("Bazin");
//
//
//        //Consumer depuis une classe
//        Consume c = new Consume();
//        c.accept("Bazin");
//
//
//        //Interface Function
//        Function<Integer,Integer> func = (nbr) -> nbr*2;
//        System.out.println(func.apply(5));
//
//
//        //Interface Function classe anonyme
//        Function<Integer, Integer> funcAnonyme= new Function<>(){
//            @Override
//            public Integer apply(Integer nbr){
//                return nbr *2;
//            }
//        };
//
//        System.out.println(funcAnonyme.apply(8));
//
//
//        //
//        try{
//
//        Function<Integer, Boolean> funcTest = (valeur) -> valeur / 0 > 0;
//        System.out.println(funcTest.apply(8));
//        }catch (ArithmeticException e){
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
//        //
//        IFCustom<String, String, Integer, String> ifcustom = (nom, prenom, age) -> ("Bonjour je suis "+ nom +" "+prenom
//                                                                                    +" et j'ai "+age+" ans");
//
//        System.out.println(ifcustom.execute("Bazin","Jérémy",33));
//
//        //#endregion


//Exemple d'utilisation d'une Interface fonctionnelle Custom
        Banque b = new Banque(100D);

        //Ajoute dans la liste qui est dans banque les méthode suivantes
        //Celle-ci possèdent la signature de l'Interface fonctionnelle
        b.subscribe(() -> System.out.println("Passage en negatif"));
        b.subscribe(() -> System.out.println("Ton banquier est pas heureux"));
        b.subscribe(() -> System.out.println("les I-F c'est cool"));

        //Passage en négatif Raise la liste des événements
        b.setSolde(-50D);

    }
}
