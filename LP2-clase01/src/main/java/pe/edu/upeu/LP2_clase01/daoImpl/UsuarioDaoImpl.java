package pe.edu.upeu.LP2_clase01.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.LP2_clase01.dao.UsuarioDao;
import pe.edu.upeu.LP2_clase01.entity.Usuario;
import pe.edu.upeu.LP2_clase01.repository.UsuarioRepository;


@Component
public class UsuarioDaoImpl implements UsuarioDao {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	@Override
	public Usuario create(Usuario u) {
		// TODO Auto-generated method stub
		return usuarioRepository.save(u);
	}

	@Override
	public Usuario update(Usuario u) {
		// TODO Auto-generated method stub
		return usuarioRepository.save(u);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		usuarioRepository.deleteById(id);
	}

	@Override
	public Optional<Usuario> read(Long id) {
		// TODO Auto-generated method stub
		return usuarioRepository.findById(id);
	}

	@Override
	public List<Usuario> readAll() {
		// TODO Auto-generated method stub
		return usuarioRepository.findAll();
	}

}
