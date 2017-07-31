/**public class Calculate {
	public static void main(String[] arg) {
		System.out.println("Calculate...");
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);
		int sum = first + second;
		int sub = first - second;
		int mul = first * second;
		double div;
		if(first>=second)
			div = first / second;
		else
			div = second / first;
		System.out.println("sum = " + sum);
		System.out.println("sub = " + sub);
		System.out.println("mul = " + mul);
		System.out.println("div = " + div);
		System.out.println("exp = " + Math.pow(first, second));

	}
}
*/