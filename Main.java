package rette;
import java.io.*;


public class Main {

	public static void main(String[] args) {
		
		String dato="";
		int x=0,y=0;
		double m=0,q=0;
		
	    InputStreamReader input = new InputStreamReader(System.in);
	    BufferedReader tastiera= new BufferedReader (input);
		
		try {
			System.out.println("Inserire le coordinate del punto P: ");
			dato=tastiera.readLine();
			x=Integer.valueOf(dato).intValue();
			dato=tastiera.readLine();
			y=Integer.valueOf(dato).intValue();
		}catch(Exception e) {}
		
		Punto P0 = new Punto(x,y);
		
		try {
			System.out.println("Inserire m: ");
			dato=tastiera.readLine();
			m=Double.parseDouble(dato);
			System.out.println("Inserire q: ");
			dato=tastiera.readLine();
			q=Double.parseDouble(dato);
		}catch(Exception e) {}
		
		Retta r = new Retta(m,q);
		
		try {
			System.out.println("Inserire le coordinate del punto P: ");
			dato=tastiera.readLine();
			x=Integer.valueOf(dato).intValue();
			dato=tastiera.readLine();
			y=Integer.valueOf(dato).intValue();
		}catch(Exception e) {}
		
		Punto P1 = new Punto(x,y);
		
		System.out.println("Distanza (r,P0) = "+r.distanzaPunto(P0));
		
		
		double  m1 = -(1/r.getM());
		double q1=P1.getY()-m1*P1.getX();
		
		Retta r1 = new Retta(m1,q1);
		System.out.println("retta r1: y= "+r1.getM()+"x +"+r1.getQ());
	}

}
