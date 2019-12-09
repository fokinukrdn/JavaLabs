public class Numbers {
    double a, b, c;
    double D;
    String rez;
//    Numbers(double a, double b, double c){
//        this.a = a;
//        this.b = b;
//        this.c=c;
//        D = b * b - 4 * a * c;
//    }
    public void input(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
        D = b * b - 4 * a * c;
    }
    public String output(){
        if (D > 0) {
            double x2;
            double x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            rez = "Корни уравнения: x1 = " + x1 + ", x2 = " + x2;
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
            return rez;
        }
        else if (D == 0) {
            double x;
            x = -b / (2 * a);
            rez = "Уравнение имеет единственный корень: x = " + x;
            System.out.println("Уравнение имеет единственный корень: x = " + x);
            return rez;
        }
        else {
            rez = "Уравнение не имеет действительных корней!";
            System.out.println("Уравнение не имеет действительных корней!");
            return rez;
        }
    }

}
