package com.jieun.util.st.ex1;

import java.util.HashMap;
import java.util.Scanner;

public class WeatherSearch {
	
	public Weather search(HashMap<String, Weather> weathers) {
		Scanner sc = new Scanner(System.in);
		System.out.println("지역명을 입력하세요");
		String loc = sc.next();
		Weather weather=null;
		
		weather = weathers.get(loc);
		
		
		return weather;
		
	}

}
