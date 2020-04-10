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

	public void move (char xDirection, char yDirection) {
		//TODO
        if(xDirection=="L"){
            x--;
        }
        if(xDirection=="R"){
            x++;
        }
        if(yDirection=="U"){
            y++;
        }
        if(yDirection=="D"){
            y--;
        }
	}

	public void draw () {
		//TODO
        System.out.println(String.format("x = %f y = %f",x,y));
	}



}