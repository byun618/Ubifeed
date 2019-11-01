package irl.tud.ubifeed.dbaccess.restaurantdao;

import irl.tud.ubifeed.Inject;
import irl.tud.ubifeed.business.modelfactory.ModelFactory;
import irl.tud.ubifeed.dbaccess.DalBackendServices;

public class RestaurantDaoImpl implements RestaurantDao{
	
	@Inject
	public ModelFactory	factory;
	
	@Inject
	public DalBackendServices dal;
}
