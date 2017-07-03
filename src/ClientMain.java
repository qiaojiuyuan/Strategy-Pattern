
public class ClientMain {

	public static void main(String[] args) {
		Context context;
		context = new Context(new BackDoor());
		context.operate();
		context = new Context(new GiveGreenLight());
		context.operate();
		context = new Context(new BlockEnemy());
		context.operate();
	}
}
