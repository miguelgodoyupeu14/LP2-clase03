package pe.edu.upeu.LP2_clase01.dao;

import java.util.Optional;
import java.util.List;

import pe.edu.upeu.LP2_clase01.entity.Usuario;

public interface UsuarioDao {

	Usuario create(Usuario u);
	Usuario update(Usuario u);
	void delete(Long id);
	Optional<Usuario> read(Long id);
	List<Usuario> readAll();
}
