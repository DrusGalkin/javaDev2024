package ru.galkin.geometry;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Polyline implements GetLengthLineOrPolyline, PolygonalChain{
	private List<Point> points = new ArrayList<>();

	public Polyline(Point...arr) {
		for (Point point : arr) {
			this.points.add(point);
		}
	}

	public void addPoint(Point...point) {
		for(int i = 0; i < point.length; i++){
			points.add(point[i]);
		}
	}

	public List<Point> getPoints(){
		return new ArrayList<>(points);
	}

	public int getLength(){
		int length = 0;

		for(int i = 0; i < points.size()-1; i++){
			length += new Line(points.get(i), points.get(i+1)).getLength();
		}
		return length;
	}

	public void removePoint(Point point) {
		for (int i = 0; i < points.size(); i++) {
			if (points.get(i).equals(point)) points.remove(i);
		}
	}

	public String toString() {
		return "Линия: " + points + " - длинна Ломанной: " + getLength();
	}

	@Override
	public Polyline getPolygonalChain() {
		return this;
	}

	@Override
	public final boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Polyline polyline) ) return false;
		if(o.getClass() == this.getClass()) return Objects.equals(points, polyline.points);

		List<Point> that = new ArrayList<>(this.points);
		List<Point> other = new ArrayList<>(polyline.points);

		if(this.getClass()==ClosedPolyline.class) that.add(this.points.getFirst());
		if(polyline.getClass()==ClosedPolyline.class) other.add(polyline.points.getFirst());

		return Objects.equals(that, other);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(points);
	}
}