package pe.edu.upeu.LP2_clase01.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.LP2_clase01.entity.Rol;

public interface RolDao {

	Rol create(Rol r);
	Rol update(Rol r);
	void delete(Long id);
	Optional<Rol> read(Long id);
	List<Rol> readAll();
}
