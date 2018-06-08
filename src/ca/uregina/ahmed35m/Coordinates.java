package ca.uregina.ahmed35m;
import java.util.Random;


public class Coordinates {
	private double lat;
	private double longt;
	
	
	public Coordinates()
	{
		lat= 0.0000000;
		longt=0.000000;
	}
	
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {

		Random rg = new Random();
		this.lat = rg.nextInt(180)-90+ (rg.nextInt(99999999))*(Math.pow(10, -8));
		
	}
	public double getLongt() {
		return longt;
	}
	public void setLongt(double longt) {
		Random rg = new Random();
		this.longt = rg.nextInt(360)-180+ (rg.nextInt(99999999))*(Math.pow(10, -8));
	}
	
	
	public static void main(String[] args) {
	double a = 0;
	Random rg = new Random();

	a =rg.nextInt(180)-90+ (rg.nextInt(99999999))*(Math.pow(10, -8));
	System.out.println(a);
	
	
	}
	
	public double getShortestDist(Coordinates a, Coordinates b)
	{
		double d =0;
		
		
		return d;
	}
	public double getLongDist(Coordinates a, Coordinates b)
	{
		double d =0;
		
		
		return d;
	}
}
