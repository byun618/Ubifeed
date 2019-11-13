package irl.tud.ubifeed.meal;

import java.util.List;

import irl.tud.ubifeed.restaurant.RestaurantDto;

public class MealImpl implements MealDto {

	private int mealId;
	private String name;
	private RestaurantDto restaurant;
	private List<String> pictures;
	private int quantity;
	private double price;
	
	@Override
	public int getMealId() {
		return mealId;
	}
	@Override
	public void setMealId(int mealId) {
		this.mealId = mealId;
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
	public RestaurantDto getRestaurant() {
		return restaurant;
	}
	@Override
	public void setRestaurant(RestaurantDto restaurant) {
		this.restaurant = restaurant;
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
	public int getQuantity() {
		return quantity;
	}
	@Override
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public double getPrice() {
		return price;
	}
	@Override
	public void setPrice(double price) {
		this.price = price;
	}
		
}