public class Calculation implements Runnable{
    public double radius;
    public double side;
    public double area;
    public double phi = 3.14;
    
    //public getRadius 

    public void setSquare(double side) throws IllegalArgumentException{
        if (side<1){
                throw new IllegalArgumentException("Side must be greater than or equal to 1");
            }
            area = side*side;
        }

    public double getSquare(double luas){
        return area;
    }
    public void setCircle(double radius) throws IllegalArgumentException {
        if (radius < 1) {
          throw new IllegalArgumentException("Radius must be greater than or equal to 1");
        }
        this.area = phi * radius * radius;
      }
  
    public double getCircle() {
        return this.area;
    }
    public void setTrapezoid(double a, double b, double t) throws IllegalArgumentException{
        if (a<1 || b<1 || t<1) {
            throw new IllegalArgumentException("Any sides must be greater than or equal to 1");
          }
        area = 1/2*(a+b)*t;
    }
    public double getTrapezoid(){
        return area;
    }

    public void run(){
        System.out.println("Program will start in : ");
        for (int i=3;i>0;i--){
            try{
                System.out.println("Starting in "+i);
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}