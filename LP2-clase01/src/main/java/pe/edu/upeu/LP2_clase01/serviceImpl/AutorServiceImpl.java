package pe.edu.upeu.LP2_clase01.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.LP2_clase01.dao.AutorDao;
import pe.edu.upeu.LP2_clase01.entity.Autor;
import pe.edu.upeu.LP2_clase01.service.AutorService;
@Service
public class AutorServiceImpl implements AutorService{

	@Autowired
	private AutorDao autorDao;
	@Override
	public Autor create(Autor a) {
		// TODO Auto-generated method stub
		return autorDao.create(a);
	}

	@Override
	public Autor update(Autor a) {
		// TODO Auto-generated method stub
		return autorDao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		autorDao.delete(id);
	}

	@Override
	public Autor read(Long id) {
		// TODO Auto-generated method stub
		return autorDao.read(id);
	}

	@Override
	public List<Autor> readAll() {
		// TODO Auto-generated method stub
		return autorDao.readAll();
	}

}
