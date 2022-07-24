package DIOPatternProject;

import DIOPatternProject.facade.Facade;
import DIOPatternProject.singleton.SingletonEager;
import DIOPatternProject.singleton.SingletonLazy;
import DIOPatternProject.singleton.SingletonLazyHolder;
import DIOPatternProject.strategy.*;

public class Test {
    public static void main(String[] args) {
        //singleton
        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        System.out.println(singletonLazy);

        singletonLazy = SingletonLazy.getInstance();
        System.out.println(singletonLazy);

        SingletonEager singletonEager = SingletonEager.getInstance();
        System.out.println(singletonEager);

        singletonEager = SingletonEager.getInstance();
        System.out.println(singletonEager);

        SingletonLazyHolder singletonLazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(singletonLazyHolder);

        singletonLazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(singletonLazyHolder);

        // teste de strategy
        IStrategy comportamento1 = new Strategy();
        IStrategy comportamento2 = new Strategy_2();
        IStrategy comportamento3 = new Strategy_3();
        Executor executor = new Executor();

        executor.setiStrategy(comportamento1);
        executor.mover();
        executor.mover();

        executor.setiStrategy(comportamento2);
        executor.mover();

        executor.setiStrategy(comportamento3);
        executor.mover();

        //Facade
        Facade facade = new Facade();
        facade.migrarCliente("Samuel", "16055-500");

    }
}
