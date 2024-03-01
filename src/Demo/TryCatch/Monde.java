package Demo.TryCatch;

public class Monde {
    public static void faireExploserMonde(boolean choix) throws Exception{
        if(choix){

            throw new Exception("Monde explose");
        }
        else{
            System.out.println("Ouf sauvé");
        }
    }
}
