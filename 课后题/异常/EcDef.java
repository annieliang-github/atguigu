package exceptionExercise;

public class EcDef extends Exception {
	static final long serialVersionUID = -9821564897513L;
	public EcDef() {
		
	}
	public EcDef(String msg) {
		super(msg);
	}
}
