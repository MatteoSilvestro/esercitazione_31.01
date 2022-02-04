package rette;
import java.math.*;

public class Retta {

		private double m;
		private double q;
		
		public Retta() {
			m=0;
			q=0;
		}
		
		public Retta(double m1,double q1) {
			m=m1;
			q=q1;
		}
		
		public void setM(double m1) {
			m=m1;
		}
		
		public void setQ(double q1) {
			q=q1;
		}
		
		public double getM() {
			return m;
		}
		
		public double getQ() {
			return q;
		}
		
		public double distanzaPunto(Punto p) {
			double d=Math.abs((p.getX()*m)+(-1*p.getY())+q)/Math.sqrt((m*m)+(1));
			return d;
		}
		
		
		
	}




