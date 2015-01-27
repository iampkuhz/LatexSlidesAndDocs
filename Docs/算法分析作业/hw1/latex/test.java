package test;

public class test {

	public static void main(String [] args)
	{
		double sum = (2*Math.log(6) + 12*Math.log(10))/Math.log(2);
		Getgap(0.0, sum, sum);
	}

	private static void Getgap(double beg, double end, double target) {
		// TODO Auto-generated method stub
		if(end - beg < 0.000001)
			return;
		System.out.println(beg + "\t" + end);
		//System.out.println(Math.pow(2, beg) + "\t" + Math.pow(2, end));
		double middle = (beg + end)/2;
		double tmp = middle + Math.log(middle);
		if(tmp == target)
		{
			return;
		}
		else if(tmp > target)
			Getgap(beg, middle, target);
		else Getgap(middle, end, target);
	}
}
