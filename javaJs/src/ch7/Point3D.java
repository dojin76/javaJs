package ch7;

class Point3D extends Point{

	int z;
	
	Point3D(int x, int y, int z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	String getLocatioin() 
	{
		return "x : " + x + ", y : " + y + ", z : " + z;
	}
}
