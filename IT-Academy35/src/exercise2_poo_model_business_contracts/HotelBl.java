package exercise2_poo_model_business_contracts;

import java.io.IOException;

import exercise2_poo_model.Hotel;

public interface HotelBl {

	public boolean crear(Hotel hotel) throws IOException;

	public void calcularManteniment();
}
