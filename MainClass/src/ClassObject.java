class Point{
		
		public int x;
		public int y;
	
	}

public class ClassObject {

		
	
	public static void main(String[] args) {

Point[] points;
		
		points = new Point[3];
		
		points[0] = new Point();
		points[1] = new Point();
		points[2] = new Point();
		
		points[0].x = 2;
		points[0].y = 4;
		
		points[1].x = 2;
		points[1].y = 4;
		
		points[2].x = 2;
		points[2].y = 4;

		for(Point point : points) {
			
			System.out.println(point.x + "," + point.y);
		}
		
	}

}