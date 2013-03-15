package org.example.asteroides;

import java.util.Vector;

public interface IPointsStore {
	
	public void saveScore(int points, String name, long date);
	
	public Vector<String> listaPuntuaciones(int cantidad);

}
