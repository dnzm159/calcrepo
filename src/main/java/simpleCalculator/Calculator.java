package simpleCalculator;

public class Calculator {
	private int result=0;
	
	public void add(int x, int y) {
		result=x+y;
	}
	
	public void sub(int x, int y) {
		result=x-y;
	}
	public void multi(int x, int y) {
		result=x*y;
	}
	
	public int decinc(int delt)
	{
		result = delt--;
		return result;
	}
	
	public int getResult() {
		return result;
	}
}
