package studyeasyhain.Laptop;

import studyeasyhain.Laptop.Component.GraphicCard;
import studyeasyhain.Laptop.Component.Processor;
import studyeasyhain.Laptop.Component.ProcessorPrice;

public class Laptop {
	private float screen;
	private Processor processor;//ITS VERY VITAL STEP IN COMPOSITION TO ACCESS OBJECT OR ANY METHOD ALL COMPOSITION DEPENDS ON A S
	//SINGAL LINE
	private String ram;
	private String  hardDrive;
	private GraphicCard graphiccard;
	private String opticalDrive;
	private String keyBoard;
	protected ProcessorPrice processorPrice;
	
	public Laptop() {
		this.screen = 15.6f;
		this.processor = new Processor();//ITS 2ND IMPORTANT STEP
		this.ram = "DDR4";
		this.hardDrive = "2TB";
		this.graphiccard = new GraphicCard();
		this.opticalDrive = "Multiplayer";
		this.keyBoard = "BackLit";
	this.processorPrice=new ProcessorPrice();
	}

	public Laptop(Float screen, Processor processor, String ram, String hardDrive, GraphicCard graphiccard,
			String opticalDrive, String keyboard,ProcessorPrice processorPrice) {
	
		this.screen = screen;
		this.processor = processor;
		this.ram = ram;
		this.hardDrive = hardDrive;
		this.graphiccard = graphiccard;
		this.opticalDrive = opticalDrive;
		this.keyBoard = keyboard;
		this.processorPrice=processorPrice;
	}

	@Override
	public String toString() {
		return "Laptop [screen=" + screen + ", processor=" + processor + ", ram=" + ram + ", hardDrive=" + hardDrive
				+ ", graphiccard=" + graphiccard + ", opticalDrive=" + opticalDrive + ", keyBoard=" + keyBoard + "]";
	}

	public Processor getProcessor() {
		return processor;
	}

	public float getScreen() {
		return screen;
	}

	public String getRam() {
		return ram;
	}

	public String getHardDrive() {
		return hardDrive;
	}

	public GraphicCard getGraphiccard() {
		return graphiccard;
	}

	public String getOpticalDrive() {
		return opticalDrive;
	}

	public String getKeyBoard() {
		return keyBoard;
	}

	public ProcessorPrice getProcessorPrice() {
		return processorPrice;
	}

	public void setProcessorPrice(ProcessorPrice processorPrice) {
		this.processorPrice = processorPrice;
	}

public String gamingMode()
{
	processor.setFrequency(processor.getMaxFrequency());//TRY TO UNDERSTAND IMP CONCEPT AS WELL ESY CONCEPT
	return "success";
}



}
