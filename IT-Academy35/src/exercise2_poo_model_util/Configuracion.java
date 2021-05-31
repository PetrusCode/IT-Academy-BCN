package exercise2_poo_model_util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import exercise2_poo_model_business.HotelBlImpl;

public class Configuracion {

	static Properties prop = null;
	static InputStream input = null;

	static {
		prop = new Properties();

		try {
			input = HotelBlImpl.class.getResourceAsStream("/config.properties");
			prop.load(input);
		} catch (IOException e) {
			throw new ExceptionInInitializerError(e);
		}
	}

	public static String getTxtFileName() {
		return prop.getProperty(Constants.TXT_FILE_NAME);
	}

	public static String getTxtTxtFileName() {
		return prop.getProperty(Constants.TXT_TXT_FILE_NAME);
	}
}
