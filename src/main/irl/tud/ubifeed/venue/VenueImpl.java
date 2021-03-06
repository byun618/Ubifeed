package irl.tud.ubifeed.venue;

import java.time.LocalDateTime;
import java.util.List;

import irl.tud.ubifeed.country.CityDto;

public class VenueImpl implements VenueDto {

	private int venueId;
	private CityDto city;
	private String address;
	private String name;
	private LocalDateTime date;
	private String map;
	private List<String> pictures;
	private String cityname;
	private String countryname;
	private String imagePath;
	
	@Override
	public int getVenueId() {
		return venueId;
	}
	@Override
	public void setVenueId(int venueId) {
		this.venueId = venueId;
	}
	@Override
	public CityDto getCity() {
		return city;
	}
	@Override
	public void setCity(CityDto city) {
		this.city = city;
	}
	@Override
	public String getAddress() {
		return address;
	}
	@Override
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public LocalDateTime getDate() {
		return date;
	}
	@Override
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	@Override
	public String getMap() {
		return map;
	}
	@Override
	public void setMap(String map) {
		this.map = map;
	}
	@Override
	public List<String> getPictures() {
		return pictures;
	}
	@Override
	public void setPictures(List<String> pictures) {
		this.pictures = pictures;
	}
	@Override
	public String getCityName() {
		return cityname;
	}
	@Override
	public void setCityName(String cityname) {
		this.cityname = cityname;
	}
	@Override
	public String getCountryName() {
		return countryname;
	}
	@Override
	public void setCountryName(String countryname) {
		this.countryname = countryname;
	}
	@Override
	public String getImagePath() {
		return this.imagePath;
	}
	@Override
	public void setImagePath(String path) {
		this.imagePath = path;
	}
}
