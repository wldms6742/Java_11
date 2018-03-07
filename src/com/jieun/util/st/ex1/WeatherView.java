package com.iu.util.st.ex1;

import java.util.HashMap;
import java.util.Iterator;

public class WeatherView {
	
	public void view(String message) {
		System.out.println(message);
	}
	
	public void view(Weather weather) {
		System.out.println("============");
		System.out.println("Loc  : "+weather.getLocation());
		System.out.println("Gion : "+weather.getGion());
		System.out.println("Hum  : "+weather.getHum());
		System.out.println("Wind : "+weather.getWind());
	}
	
	public void view(HashMap<String, Weather> weathers) {
		
		Iterator<String> it = weathers.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			this.view(weathers.get(key));
		}
		
		
		
	}

}
