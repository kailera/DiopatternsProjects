package DIOPatternProject.singleton;

/**
 * Singleton Apressado
 * @kailera
 * a instancia é feita sem verificação
 */
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstance(){
        return instancia;
    }
}
