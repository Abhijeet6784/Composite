package studyeasyhain.Laptop.Component;

public class Processor {
	private String brand;
	private String serie;
	private int generation;
	private int cores;

	private int threads;

	private String cacheMemory;
	private String frequency;
	private String minFrequency;
	private String maxFrequency;
	
	
	public Processor() {
		this.brand = "Intel";
		this.serie = "7200u";
		this.generation =9;
		this.cores = 2;
		this.threads = 4;
		this.cacheMemory = "3mb";
		this.frequency = "2.5Ghz";
		this.minFrequency = "2.5Ghz";
		this.maxFrequency = "3.1Ghz";
	}


	public Processor(String brand, String serie, int generation, int cores, int threads, String cacheMemory,
			String frequency, String minFrequency, String maxFrequency) {
		
		this.brand = brand;
		this.serie = serie;
		this.generation = generation;
		this.cores = cores;
		this.threads = threads;
		this.cacheMemory = cacheMemory;
		this.frequency = frequency;
		this.minFrequency = minFrequency;
		this.maxFrequency = maxFrequency;
	}


	@Override
	public String toString() {
		return "Processor [brand=" + brand + ", serie=" + serie + ", generation=" + generation + ", cores=" + cores
				+ ", threads=" + threads + ", cacheMemory=" + cacheMemory + ", frequency=" + frequency
				+ ", minFrequency=" + minFrequency + ", maxFrequency=" + maxFrequency + "]";
	}


	public String getBrand() {
		return brand;
	}


	public String getSerie() {
		return serie;
	}


	public int getGeneration() {
		return generation;
	}


	public int getCores() {
		return cores;
	}


	public int getThreads() {
		return threads;
	}


	public String getCacheMemory() {
		return cacheMemory;
	}


	public String getFrequency() {
		return frequency;
	}


	public String getMinFrequency() {
		return minFrequency;
	}


	public String getMaxFrequency() {
		return maxFrequency;
	}


	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}







}
