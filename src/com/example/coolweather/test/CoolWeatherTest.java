package com.example.coolweather.test;

import java.util.List;

import org.junit.Test;

import android.test.AndroidTestCase;

import com.example.coolweather.model.City;
import com.example.coolweather.model.CoolWeatherDB;
import com.example.coolweather.model.County;
import com.example.coolweather.model.Province;

public class CoolWeatherTest extends AndroidTestCase {
	private CoolWeatherDB weatherDB;

	@Override
	protected void setUp() throws Exception {
		weatherDB = new CoolWeatherDB(getContext());
		super.setUp();
	}

	// @Test
	public void testSaveProvince() {
		Province province = new Province();
		province.setId(1);
		province.setProvince_code("001");
		province.setProvince_name("chengdu");
		weatherDB.saveProvince(province);
	}

	// @Test
	public void testLoadProvince() {
		List<Province> list = weatherDB.loadProvinces();
		assertEquals(1, list.size());
	}

	public void testSaveCity() {
		City city = new City();
		city.setCity_code("000101");
		city.setCity_name("suining");
		city.setId(001);
		city.setProvince_id(1);
		weatherDB.saveCity(city);
	}

	// @Test
	public void testLoadCity() {
		List<City> list = weatherDB.loadCityes(1);
		assertEquals(1, list.size());
	}

	//@Test
	public void testSaveCounty() {
		County county = new County();
		county.setCity_code(00010101);
		county.setCounty_name("fuguo");
		county.setCity_code(000101);
		weatherDB.saveCounty(county);
	}
	@Test
	public void testLoadCounty() {
		List<County> list = weatherDB.loadCountys(000101);
		assertEquals(1, list.size());
	}
}
