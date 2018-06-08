package ca.uregina.ahmed35m;
import java.util.ArrayList;
import java.util.Random;


public class Coordinates {
	private double lat;
	private double longt;
	public static int earth_radius = 6371;
	public static int earth_circum = 40075;

	
	public Coordinates()
	{
		this.setLat();
		this.setLongt();
	}
	
	public double getLat() {
		return lat;
	}
	public void setLat() {

		Random rg = new Random();
		this.lat = rg.nextInt(180)-90+ (rg.nextInt(99999999))*(Math.pow(10, -8));
		
	}
	public double getLongt() {
		return longt;
	}
	public void setLongt() {
		Random rg = new Random();
		this.longt = rg.nextInt(360)-180+ (rg.nextInt(99999999))*(Math.pow(10, -8));
	}
	
	
	public static void main(String[] args) {
	

	System.out.println("Random Location Calculator\n");
	
	
	Coordinates x1 = new Coordinates();
	Coordinates x2 = new Coordinates();
	Coordinates x3 = new Coordinates();
	Coordinates x4 = new Coordinates();
	Coordinates x5 = new Coordinates();
	
	ArrayList<Coordinates> loc = new ArrayList<Coordinates>();
	loc.add(x1);
	loc.add(x2);
	loc.add(x3);
	loc.add(x4);
	loc.add(x5);
	
	for(int i =0; i<5;i++)
	{
		loc.get(i).printCoord();
	}
	
	System.out.println("Shortest Distance: " + getShortestDist(x4,x5));
	System.out.println("Longest Distance: " + getLongDist(x4,x5));

	
	}
	public double haversine(double d)
	{
		return d/earth_radius;
	}
	public static double getShortestDist(Coordinates a, Coordinates b)
	{
		double d =0;
		double dlong = Math.toRadians(a.getLongt() - b.getLongt());
		double dlat = Math.toRadians(a.getLat() - b.getLat());
		
		// Haversine formula implements
		 double r = Math.pow(Math.sin(dlat / 2),2) + Math.pow(Math.sin(dlong / 2),2) * Math.cos(Math.toRadians(a.getLat())) * Math.cos(b.getLat());
	     double c = 2 * Math.asin(Math.sqrt(r));
	     d =r*c;
		
	     return d;
	}
	public static double getLongDist(Coordinates a, Coordinates b)
	{
		double d =0;
		d = earth_circum - getShortestDist(a,b);
		return d;
	}
	
	public void printCoord()
	{
		System.out.println("Location:" + getLat()+ " ,"+ getLongt());
	}
}
