package interfaces;

import java.util.List;

public interface cocheCRUD {

	
	void save(cocheCRUD coche);
	List<cocheCRUDImpl> findAll() ;
	void delete(cocheCRUDImpl coche);
}
