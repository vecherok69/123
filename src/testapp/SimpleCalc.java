package testapp;
public class TestApp {

public static void main(String[] args) {

System.out.println("GIT test application");
System.out.println(getSum());
System.out.println(getDel());
}

public class SimpleCalc {

private double a;
private double b;


SimpleCalc(double p1,double p2) {
this.a=p1;
this.b=p2;
}

public double getDelen() {
return this.a/this.b;
}
public double getDel() {
return this.a-this.b;
}


}

}

