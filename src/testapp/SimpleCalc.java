package testapp;
public class SimpleCalc {

private double a;
private double b;


SimpleCalc(double p1,double p2) {
this.a=p1;
this.b=p2;
}

public double getMult() {
return this.a+this.b;
}
public double getDiv() {
return this.a-this.b;
}
public double getDel() {
return this.a/this.b;
}
public double getMnoj() {
return this.a*this.b;
}
}
