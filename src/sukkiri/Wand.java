package sukkiri;

public class Wand {
	private String name;
	private double power;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPower() {
		return this.power;
	}
	
	public void setPower(double power) {
		if(power < 0.5) {
			throw new IllegalArgumentException("パワーが少な過ぎます");
		}
		if (power > 100) {
			throw new IllegalArgumentException("パワーが多過ぎます");
		}
		this.power = power;
	}
}
