import java.util.ArrayList;
import java.util.List;

class Point {
	String id;
	double x,y;

	//TODO add new variable
	String color;
	//TODO constructor
	Point(String id,String color,double x,double y){
		this.id = id;
		this.color = color;
		this.x = x;
		this.y = y;
	}

	//TODO setters and getters

	public void set_x(double x){
		this.x = x;
	}

	public void set_y(double y){
		this.y = y;
	}

	public double get_x(){
		return x;
	}

	public double get_y(){
		return y;
	}

	public void move (char xDirection, char yDirection) {
		//TODO
        if(xDirection=='L'){
            x--;
        }
        if(xDirection=='R'){
            x++;
        }
        if(yDirection=='U'){
            y++;
        }
        if(yDirection=='D'){
            y--;
        }
	}

	public void draw () {
		//TODO
        System.out.println(String.format("x = %f y = %f",x,y));
	}



}

class Canvas {

	List<Point> points;

	Canvas(){
		points = new ArrayList<>();
	}

	public boolean addPoint(Point point){
		return points.add(point);
	}

	public com.company.Point removePoint(int index){
		return points.remove(index);
	}

	public void moveAllPoints(char xDirection,char yDirection){
		points.forEach(p ->p.move(xDirection,yDirection));
	}


}
