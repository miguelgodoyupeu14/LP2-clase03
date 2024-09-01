package pe.edu.upeu.LP2_clase01.dao;

import java.util.List;



import pe.edu.upeu.LP2_clase01.entity.Autor;

public interface AutorDao {
	Autor create(Autor a);
	Autor update(Autor a);
	void delete(Long id);
	Autor read(Long id);
	List<Autor> readAll();
}
