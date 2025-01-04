package ru.galkin.geometry;

import java.util.Objects;

public class Point implements Cloneable, Geometryable {
	
	private int x,y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {return x;}
	public int getY() {return y;}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String toString() {
		return "{" + x + ";" + y + "}"; 
	}

	public Point clone(){
		try{
			return (Point)super.clone();
		}catch(CloneNotSupportedException e){
			throw new RuntimeException(e);
		}
	}

	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if(!(o instanceof Point)) return false;
		Point point = (Point) o;
		return x == point.x && y == point.y;
	}

	@Override
	public int hashCode() {
		return Objects.hash(x,y);
	}

	@Override
	public void shift(String name, int num) {
		if("x".equals(name)) this.setX(num);
		if ("y".equals(name)) this.setY(num);
	}
}
