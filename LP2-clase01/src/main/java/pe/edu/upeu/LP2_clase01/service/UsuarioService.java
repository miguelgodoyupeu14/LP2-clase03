package pe.edu.upeu.LP2_clase01.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.LP2_clase01.entity.Usuario;

public interface UsuarioService {
	Usuario create(Usuario u);
	Usuario update(Usuario u);
	void delete(Long id);
	Optional<Usuario> read(Long id);
	List<Usuario> readAll();
}
