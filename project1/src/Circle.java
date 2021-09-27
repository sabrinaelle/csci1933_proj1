public class Circle {

    private double xPos;
    private double yPos;
    private double radius;

    public Circle(double xPos, double yPos, double radius) {
        xPos = this.xPos;
        yPos = this.yPos;
        radius = this.radius;
    }

    public double calculatePerimeter(){
        return 2*Math.PI*this.radius;
    }
    public double calculateArea(){
        return Math.PI*(Math.pow(this.radius,2));
    }
    public void setColor(){
        //color set
    }
    public void getColor(){
        //get color
    }
    public double setPos(double center){
        //center set
        return 2; //ex
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getxPos() {
        return xPos;
    }

    public void setxPos(double xPos) {
        this.xPos = xPos;
    }

    public double getyPos() {
        return yPos;
    }

    public void setyPos(double yPos) {
        this.yPos = yPos;
    }









}