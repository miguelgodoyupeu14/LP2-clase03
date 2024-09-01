package pe.edu.upeu.LP2_clase01.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.LP2_clase01.dao.RolDao;
import pe.edu.upeu.LP2_clase01.entity.Rol;
import pe.edu.upeu.LP2_clase01.service.RolService;

@Service
public class RolServiceImpl implements RolService{
	
	@Autowired
	private RolDao rolDao;

	@Override
	public Rol create(Rol r) {
		// TODO Auto-generated method stub
		return rolDao.create(r);
	}

	@Override
	public Rol update(Rol r) {
		// TODO Auto-generated method stub
		return rolDao.update(r);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		rolDao.delete(id);
	}

	@Override
	public Optional<Rol> read(Long id) {
		// TODO Auto-generated method stub
		return rolDao.read(id);
	}

	@Override
	public List<Rol> readAll() {
		// TODO Auto-generated method stub
		return rolDao.readAll();
	}

}
