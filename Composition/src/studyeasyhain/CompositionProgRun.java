package studyeasyhain;

import studyeasyhain.Laptop.Laptop;
import studyeasyhain.Laptop.Component.GraphicCard;
import studyeasyhain.Laptop.Component.Processor;
import studyeasyhain.Laptop.Component.ProcessorPrice;

public class CompositionProgRun {
	public static void main(String[] args) {
//
//		Laptop lappyLaptop = new Laptop();
//		System.out.println(lappyLaptop.getProcessor().getBrand());// Object of object example->
//		System.out.println(lappyLaptop.getProcessorPrice().getBrandedPeocessorPrice());
//
//		
		Processor processor=new Processor("intel","720000u",7,4,4,"6mb","2.5gh","2.5ghz","6.7ghz");
		
		GraphicCard graphicCard=new GraphicCard(1050,"Nvidia","4gb");
		ProcessorPrice price=new ProcessorPrice("12k","67k","43");
		Laptop gaming = new Laptop(17f,processor,"DDR4","2TB",graphicCard,null,"backlit",price);
		
		System.out.println(gaming);
		gaming.gamingMode();
		System.out.println("Gaming mode on");
		System.out.println("current frequency"+gaming.getProcessor().getFrequency());
		
	}
}
