package DIOPatternProject.strategy;

/**
 * Simplificar a variacao dos algoritmos para
 * a resolução de um mesmo problema
 */
public class Strategy implements IStrategy {
    @Override
    public void mover() {
        System.out.println("Movin on ->");
    }
}
