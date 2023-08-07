import com.xworkz.Train.ExpressTrain;
import com.xworkz.Train.Train;

public class TrainRunner {
	
	public static void main(String []args) {
		
		ChennaiExpress ce=new ChennaiExpress();
		ce.heavyThingCarry();
		ce.travel();
		
		
		
		GoodsTrain get=new ChennaiExpress();
		get.heavyThingCarry();
		get.storage();
		get.travel();
		
		
		ExpressTrain et=new ChennaiExpress();
		et.travel();
		et.storage();
		
		Train train=new ChennaiExpress();
		train.storage();
		
	}

}
