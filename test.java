import java.lang.Math;

public class test implements Runnable { 

	int num = 0;

	test(int x){
		this.num = x;
	}

	@Override public void run() {  

		int x = Main.List2.get(0);
		Main.List2.remove(0);
		Main.List3.add(x);


        //System.out.println(x);
    }
}
