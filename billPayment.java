import java.util.LinkedList;
import java.util.Queue;

public class billPayment implements bank{
	Queue<Integer> q;
	@Override
	public void bill_Payment() {
		// TODO Auto-generated method stub
		q = new LinkedList<Integer>();
		 for (int i = 1; i < 5; i++) 
		 {
		 q.add(i*1000); 
		 }
		for(Integer elem: q) {
				System.out.println(elem + " Rs recived.");
		}
		
	}
	@Override
	public void new_Account() {
		// TODO Auto-generated method stub
		
	}

	// @Override
	//public void loan_Takers() {
		// TODO Auto-generated method stub
		
	}

}
