package org.example.asteroides;

import java.util.Vector;

public class AlmacenPuntuacionesArray implements IPointsStore{
	
	private Vector<String> mPuntuaciones;
	
	 public AlmacenPuntuacionesArray() {

         mPuntuaciones= new Vector<String>();

         mPuntuaciones.add("123000 Pepito Domingez");

         mPuntuaciones.add("111000 Pedro Martinez");

         mPuntuaciones.add("011000 Paco Pérez");

    }

	@Override
	public void saveScore(int points, String name, long date) {
		mPuntuaciones.add(0, points + " " + name);
		
	}

	@Override
	public Vector<String> listaPuntuaciones(int cantidad) {
		return mPuntuaciones;
	}

}
