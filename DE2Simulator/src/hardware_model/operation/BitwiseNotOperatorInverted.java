package hardware_model.operation;

public class BitwiseNotOperatorInverted extends BitwiseNotOperator {

	public BitwiseNotOperatorInverted(int precedence) {
		super(precedence);
	}

	@Override
	public String getIdentifier() {
		return "~!";
	}

}
