package pe.edu.upeu.LP2_clase01.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.LP2_clase01.dao.EmpleadoDao;
import pe.edu.upeu.LP2_clase01.entity.Empleado;
import pe.edu.upeu.LP2_clase01.service.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {
	
	@Autowired
	private EmpleadoDao empleadoDao;

	@Override
	public Empleado create(Empleado e) {
		// TODO Auto-generated method stub
		return empleadoDao.create(e);
	}

	@Override
	public Empleado update(Empleado e) {
		// TODO Auto-generated method stub
		return empleadoDao.update(e);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		empleadoDao.delete(id);
	}

	@Override
	public Optional<Empleado> read(Long id) {
		// TODO Auto-generated method stub
		return empleadoDao.read(id);
	}

	@Override
	public List<Empleado> readAll() {
		// TODO Auto-generated method stub
		return empleadoDao.readAll();
	}

}
