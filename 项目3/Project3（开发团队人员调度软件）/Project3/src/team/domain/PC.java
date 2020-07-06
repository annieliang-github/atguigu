package team.domain;

public class PC implements Equipment {

	private String model;
	private String display;
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	public PC() {
		super();
	}

	public PC(String model, String display) {
		super();
		this.model = model;
		this.display = display;
	}

	@Override
	public String getDesctription() {
		return model + "(" + display + ")";
	}
	

}
