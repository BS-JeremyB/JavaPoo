package Demo.InterfaceFunc;

@FunctionalInterface
public interface IFCustom<T, T1, T2, R> {

    //Dans une Interface fonctionnelle custom il est possible de de définir
    //autant de parametres que souhaité
    R execute(T t, T1 t1, T2 t2);
}
