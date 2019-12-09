package lab2;
public class Quadrangle extends Triangle implements MyInterface{

      private double d;
      private double diag;


    public Quadrangle(double a, double b, double c, double d, double diag){
        super(a, b, c);
        this.d = d;
        this.diag = diag;
        System.out.println("This is child's constructor");
    }


    public double getD(){return d;}
    public double getDiag() {return diag;}

    public void setD(double d){
        this.d = d;
    }
    public void setDiag(double diag){
        this.diag = diag;
    }

    @Override
    public  double square(){
        double p = (getA()+getB()+getC()+d)/2;
        return Math.round(Math.sqrt((p-getA())*(p-getB())*(p-getC())*(p-d))*100)/100;
    }

    @Override
    public String toString(){
        return "Quadrangle{" + "a=" + getA() + ", b=" + getB() + ", c=" + getC()+ ", d="+ d +", square="+ square() + '}';
    }
}
