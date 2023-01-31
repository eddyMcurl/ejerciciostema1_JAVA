package interfaces;

import java.util.List;

public class cocheCRUDImpl implements cocheCRUD {

	@Override
	public void save(cocheCRUD coche) {
		// TODO Auto-generated method stub
		
		System.out.println("METODO GUARDAR COCHE DESDE cocheCRUDImpl");
		
	}

	@Override
	public List<cocheCRUDImpl> findAll() {
		// TODO Auto-generated method stub
		System.out.println("METODO MOSTRAR COCHES DESDE cocheCRUDImpl");
		return null;
	}

	@Override
	public void delete(cocheCRUDImpl coche) {
		// TODO Auto-generated method stub
		System.out.println("METODO ELIMINAR COCHE DESDE cocheCRUDImpl");
	}

	
}
