package exercise2_poo_model_dao;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

public class GestorDeArchivoDao extends Thread {
	private String fileName;

	private static File file = null;

	private static ConcurrentHashMap<String, File> fileType = new ConcurrentHashMap<String, File>();

	public GestorDeArchivoDao() {

	}

	public GestorDeArchivoDao(String filename) {
		this.fileName = filename;
	}

	public static synchronized boolean agregarTxtHotel(String fileName)
			throws IOException {

		boolean fileCreated = false;

		file = new File(fileName);

		try {
			if (file.createNewFile()) {
				System.out.println("Archivo creado");
				if (fileName.contains(".txt")) {
					fileType.put("txt", file);
				}
			} else {
				System.out.println("El archivo ya existe");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return fileCreated;

	}

	public static String getNameFile(String type) {
		return fileType.get(type).getName();

	}

	@Override
	public void run() {

		try {
			Thread.sleep(5000);
			file = new File(fileName);
			if (!file.exists()) {
				try {
					file.createNewFile();

				} catch (IOException e) {
					System.out.println(e.getMessage());
					throw e;
				}
			}
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}

		if (fileName.contains(".txt")) {
			fileType.put("txt", file);
		}

	}

}
