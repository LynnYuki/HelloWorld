package Test;

public class Odd extends Thread {

	public Odd(OddAndEven da) {

	}
public void run(){
		
		System.out.println(this.getName());
		//try{
			//sleep(1000);
		//}catch(InterruptedException ex){
			//ex.printStackTrace();
		//}
		for(int i=1;i<=50;i++){
			if((i%2)!=0){
			  System.out.println("ÆæÊý: "+i);
				
			}
		}
	}
}
