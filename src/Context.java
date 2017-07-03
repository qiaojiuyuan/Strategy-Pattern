
public class Context {

	private IStrategy strategy;
	
	//从构造方法传入要多态调用的算法对象
	public Context(IStrategy strategy) {
		this.strategy = strategy;
	}
	
	//执行算法
	public void operate() {
	    strategy.operate();
	}
}
