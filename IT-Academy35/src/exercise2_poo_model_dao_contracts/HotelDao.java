package exercise2_poo_model_dao_contracts;

import java.io.IOException;

import exercise2_poo_model.Hotel;

public interface HotelDao {

	public boolean crear(Hotel hotel) throws IOException;
}
