
public class fibo {

	   
	    public static int fibonacciRecusion(int number){
	        if(number == 1 || number == 2){
	            return 1;
	        }
	 
	        return fibonacciRecusion(number-1) + fibonacciRecusion(number -2); 
	    }
	 
	   
	    public static int fibonacciLoop(int number){
	        if(number == 1 || number == 2){
	            return 1;
	        }
	        int fibo1=1, fibo2=1, fibonacci=1;
	        for(int i= 3; i<= number; i++){
	            fibonacci = fibo1 + fibo2; 
	            fibo1 = fibo2;
	            fibo2 = fibonacci;
	 
	        }
	        return fibonacci; 
	    }
	        public static void main(String[] args) {
	 	       
		        int dizi[] = {10, 20, 30, 40, 50, 60, 70};
		        long dizi2[] = new long[7];
		        long gecenSure[] = new long[7];

		        for (int i = 0; i < dizi.length; i++) {
		            long startTime = System.currentTimeMillis();
		            dizi2[i] = fibonacciRecusion(dizi[i]);
		            long endTime = System.currentTimeMillis();
		            gecenSure[i] = endTime - startTime;

		            System.out.println(dizi[i] + " = " + dizi2[i] + " elemanýn uretim suresi  " + gecenSure[i]);
		        }

	        }
}

	