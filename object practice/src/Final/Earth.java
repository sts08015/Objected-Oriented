package Final;

public class Earth {
	static final double PI = 3.141592;
	static final double EARTH_SURFACE_AREA;
	static final double EARTH_RADIUS = 6400;
	
	static {
		EARTH_SURFACE_AREA = 4*PI*EARTH_RADIUS*EARTH_RADIUS;
	}
	
	public Earth() {
		
	}

}
