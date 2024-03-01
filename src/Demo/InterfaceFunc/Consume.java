package Demo.InterfaceFunc;

import java.util.function.Consumer;

//Utilisation basique de l'I-F Consumer (aide pour comprendre les lambdas)
public class Consume implements Consumer {
    @Override
    public void accept(Object o) {

        System.out.println("Bonjour Mr : " + o.toString());

    }
}
