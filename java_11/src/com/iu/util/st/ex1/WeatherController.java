package com.iu.util.st.ex1;

import java.util.HashMap;
import java.util.Scanner;

public class WeatherController {
	private WeatherInfo weatherInfo;
	private WeatherView weatherView;
	private WeatherSearch weatherSearch;
	private Scanner sc;
	
	public WeatherController() {
		weatherInfo = new WeatherInfo();
		weatherView = new WeatherView();
		weatherSearch = new WeatherSearch();
		sc = new Scanner(System.in);
	}
	
	public void start() {
		HashMap<String, Weather> weathers = weatherInfo.getWeather();
		boolean check = true;
		
		while(check) {
			System.out.println("1. 날씨정보출력");
			System.out.println("2. 날씨정보검색");
			System.out.println("3. 날씨정보초기화");
			System.out.println("4. 프로그램종료");
			int select = sc.nextInt();
			switch(select) {
			case 1 :
				weatherView.view(weathers);
				break;
			case 2 :
				Weather weather=weatherSearch.search(weathers);
				if(weather != null) {
					weatherView.view(weather);
				}else {
					weatherView.view("해당 지역정보가 없습니다");
				}
				break;
			case 3 :
				weathers = weatherInfo.getWeather();
				break;
			default :
				check = !check;
			}
			
		}
	}
	
	
	
	
	
	
	
	

}
