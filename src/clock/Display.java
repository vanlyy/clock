package clock;

public class Display {
	private int value = 0;
	private int limit = 0;
	
	public Display(int limit){
		this.limit = limit;
	}
	
	public void Increase(){
		value++;
		if(value == limit){
			value =0;
		}
	}
	
	public int getValue(){
		return value;
	}
	

	public static void main(String[] args) {
		Display d = new Display(24);
		for(;;){
			d.Increase();
			System.out.println(d.getValue());
		}

	}

}
