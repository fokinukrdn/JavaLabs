public class Triangle  {          //public interface??


    private double a;
    private double b;
    private double c;


    public Triangle(double a, double b, double c){
        System.out.println("This is father's constructor");
        this.a = a;
        this.b = b;
        this.c = c;
    }



    @Annotation(name = "display set", args = "", desc = "display setter")
    public void setA(double a){
        this.a = a;
    }

    @Annotation(name = "display set", args = "", desc = "display setter")
    public void setB(double b){
        this.b = b;
    }

    @Annotation(name = "display set", args = "", desc = "display setter")
    public void setC(double c){
        this.c = c;
    }



    public double getA(){return a;}
    public double getB(){return b;}
    public double getC(){return c;}





    @Annotation(name = "display", args = "", desc = "print results")
    public double square(){
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }





    @Override
    public String toString(){
        return "Triangle{" + "a=" + a + ", b=" + b + ", c=" + c+ ", square="+ square() + '}';
    }
}
