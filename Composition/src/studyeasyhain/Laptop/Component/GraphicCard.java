package studyeasyhain.Laptop.Component;

public class GraphicCard {
	private int series;
	private String brand;
	private String memory;
	public GraphicCard() {
		this.series = 940;
		this.brand = "Nvidia";
		this.memory = "2GB";
	}
	public GraphicCard(int series, String brand, String memory) {
		
		this.series = series;
		this.brand = brand;
		this.memory = memory;
	}
	@Override
	public String toString() {
		return "GraphicCard [series=" + series + ", brand=" + brand + ", memory=" + memory + "]";
	}
	
	
}
