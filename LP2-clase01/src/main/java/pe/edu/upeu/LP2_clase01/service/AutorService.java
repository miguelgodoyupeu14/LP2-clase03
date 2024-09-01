package pe.edu.upeu.LP2_clase01.service;

import java.util.List;

import pe.edu.upeu.LP2_clase01.entity.Autor;

public interface AutorService {

	Autor create(Autor a);
	Autor update(Autor a);
	void delete(Long id);
	Autor read(Long id);
	List<Autor> readAll();
}
