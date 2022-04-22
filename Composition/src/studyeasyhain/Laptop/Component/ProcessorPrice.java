package studyeasyhain.Laptop.Component;

public class ProcessorPrice {

	private String checpPeocessorPrice;
	private String brandedPeocessorPrice;
	private String midrangePeocessorPrice;
	public ProcessorPrice() {
		this.checpPeocessorPrice = "12k";
		this.brandedPeocessorPrice = "18k";
		this.midrangePeocessorPrice = "16k";
	}
	public ProcessorPrice(String checpPeocessorPrice, String brandedPeocessorPrice, String midrangePeocessorPrice) {
		
		this.checpPeocessorPrice = checpPeocessorPrice;
		this.brandedPeocessorPrice = brandedPeocessorPrice;
		this.midrangePeocessorPrice = midrangePeocessorPrice;
	}
	public String getChecpPeocessorPrice() {
		return checpPeocessorPrice;
	}
	public String getBrandedPeocessorPrice() {
		return brandedPeocessorPrice;
	}
	public String getMidrangePeocessorPrice() {
		return midrangePeocessorPrice;
	}
	
	
	
	
	
}
