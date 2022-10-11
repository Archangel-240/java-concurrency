import java.lang.Math;
import java.util.Hashtable;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	static ArrayList<Integer> List = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
	static ArrayList<Integer> List2 = List;
	static ArrayList<Integer> List3 = new ArrayList<Integer>();
	public static void main(String args[]){

		
		ArrayList<Thread> threadlist = new ArrayList<Thread>();


		for(int i = 0; i < 10; i++){
			
			test x = new test(i);
			Thread t = new Thread(x);
			threadlist.add(t);
		}

		for(int y = 0; y < threadlist.size(); y++){
			Thread t = threadlist.get(y);
			t.start();
		}

		try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		System.out.println(threadlist);
		System.out.println(List);
		System.out.println(List2);
		System.out.println(List3);

	}

}


