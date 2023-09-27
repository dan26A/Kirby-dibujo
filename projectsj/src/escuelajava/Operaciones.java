package escuelajava;

public class Operaciones {
double n1,n2,r;

public void setN1(double n1) {
	this.n1=n1;
}
public void setN2(double n2) {
	this.n2=n2;
}
public double getResultado(int menu) {
	if (menu==0) {
		r=n1+n2;
	}
	if (menu==1) {
		r=n1-n2;
	}
	if (menu==2) {
		r=n1*n2;
	}
	if (menu==3) {
		r=n1/n2;
	}
	if (menu== 4) {
		r= Math.pow(n1,n2);
	}
	
	return r;
	
}
}
