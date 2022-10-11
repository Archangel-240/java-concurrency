import java.lang.Math;
import java.util.Hashtable;
import java.util.ArrayList;

public class Main {

	
	public static void main(String args[]){

		ArrayList<Thread> threadlist = new ArrayList<Thread>();


		for(int i = 0; i < 1000; i++){
			
			test x = new test(i);
			Thread t = new Thread(x);
			threadlist.add(t);
		}

		for(int y = 0; y < threadlist.size(); y++){
			Thread t = threadlist.get(y);
			t.start();
		}
		System.out.println(threadlist);

	}

}


