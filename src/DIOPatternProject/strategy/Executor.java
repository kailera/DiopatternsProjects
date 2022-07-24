package DIOPatternProject.strategy;

public class Executor {
    private IStrategy iStrategy;
    public void setiStrategy (IStrategy iStrategy){
        this.iStrategy = iStrategy;
    }
    public  void mover(){
        iStrategy.mover();
    }
}
