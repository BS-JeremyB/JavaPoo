package Demo.TryCatch;

public class Main {
    public static void main(String[] args) {

        int nbr1 = 10;
        int nbr2 = 0;
        String nbrUser = "123&";
        int resultat;

        try {

            resultat = nbr1 / Integer.parseInt(nbrUser) ;
            System.out.println(resultat);

        }catch (ArithmeticException e){
            System.out.println("Impossible de diviser par zéro");
        }catch (NumberFormatException e){
            System.out.println("La valeur entrée n'est pas un nombre");
        }catch (Exception e){
            e.printStackTrace();
        }



        int age = -1;

        try{
            if(age < 0){
                throw new IllegalArgumentException("L'age doit être supérieur ou égale à 0");
            }
            System.out.println("L'age est "+ age);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());

        }



        try{
            boolean choix = true;
            Monde.faireExploserMonde(choix);
        }catch (Exception e){
            System.out.println(e.getMessage());

        }


        int nbr3 = -1;

        try{
            if(nbr3 < 0){
                throw new CustomException("C'est perso mais c'est cassé");
            }
        }catch(CustomException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("fin de programme");
    }
}
