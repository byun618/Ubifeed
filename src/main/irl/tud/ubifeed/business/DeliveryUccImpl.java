package irl.tud.ubifeed.business;

import java.util.List;

import irl.tud.ubifeed.Inject;
import irl.tud.ubifeed.dbaccess.DalServices;
import irl.tud.ubifeed.dbaccess.deliverydao.DeliveryDao;
import irl.tud.ubifeed.order.OrderDto;
import irl.tud.ubifeed.pickupstation.PickupStation;
import irl.tud.ubifeed.pickupstation.PickupStationDto;
import irl.tud.ubifeed.restaurant.Restaurant;

public class DeliveryUccImpl implements DeliveryUcc {
	
	@Inject
	public DeliveryDao deliveryDao;
	
	@Inject
	public DalServices dal;

	@Override
	public PickupStationDto loginPickupStation(PickupStationDto pickupstation) {
		PickupStation toRet = null;
		try {

			// init restaurant thanks to RestaurantDao
			dal.startTransaction();
			toRet = (PickupStation) deliveryDao.loginPickupStation(pickupstation);
			dal.commitTransaction();
		} catch (Exception dbfExcept) {
			dal.rollbackTransaction();
		}

		if (toRet == null || toRet.getEmail() == null || !toRet.verifyPassword(pickupstation.getPassword())) {
			return null;
		}
		return toRet;
	}

	@Override
	public List<OrderDto> getAllOrders() {
		List<OrderDto> orders = null;
		try {
			dal.startTransaction();
			orders = deliveryDao.getAllOrders();
			dal.commitTransaction();
		} catch(Exception dbfExcept) {
			dal.rollbackTransaction();
		}
		return orders;
	}
}
