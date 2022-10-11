import java.lang.Math;

public class test implements Runnable { 

	int num = 0;

	test(int x){
		this.num = x;
	}

	@Override public void run() {  

		try {
			Thread.sleep((int) Math.random()*10000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
        System.out.println(this.num);
    }
}
