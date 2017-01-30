public class printSeq {
	public printSeq() {
	}
	
	public int lazySeq(int n) {
		int p = 0;
		p = ((n*n) + n + 2) / 2;
		return p;
	}
	
	public int triangle(int num){
		int triNumber = 0;
    
		while(num >= 1){
		
			triNumber += num;
			num --;
		}
    
		return triNumber;
	}
	
	public static void main(String[] args) {
		int x = Integer.parseInt(args[1]);
		int lazyNum = 0;
		int triNum = 0;
		printSeq ps = new printSeq();
    
		if(args.length == 0) {
			System.out.println("You must indicate lazy or triangle\n");
			System.exit(1);
		}
    
		if( (x < 0) || (x > 2147483647)) {
			System.out.println("Argument is not a positive 32 bit integer");
			System.exit(2);
		}
    
    
		if(args[0].equals("lazy")) {
			lazyNum = ps.lazySeq(x);
			System.out.println("Lazy(n) = " + lazyNum);
		}
    
		else if(args[0].equals("triangle")) {
			triNum = ps.triangle(x);
			System.out.println("Tri(n) = " + triNum);
		}
    
	}
}