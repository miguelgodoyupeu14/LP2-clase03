package pe.edu.upeu.LP2_clase01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import pe.edu.upeu.LP2_clase01.entity.Autor;
import pe.edu.upeu.LP2_clase01.service.AutorService;


@RestController
@RequestMapping("/autores")
public class AutorController {
	@Autowired
	private AutorService autorService;

	@GetMapping
	public ResponseEntity<List<Autor>> readAll() {
		try {
			List<Autor> autores = autorService.readAll();
			if (autores.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);

			}
			return new ResponseEntity<>(autores, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping
	public ResponseEntity<Autor> crear(@Valid @RequestBody Autor au) {
		try {

			Autor a = autorService.create(au);
			return new ResponseEntity<>(a, HttpStatus.CREATED);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/{id}")
	public ResponseEntity<Autor> getAutorId(@PathVariable("id") Long id) {
		try {
			Autor a = autorService.read(id);
			return new ResponseEntity<>(a, HttpStatus.CREATED);

		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Autor> delAutor(@PathVariable("id") Long id) {
		try {
			autorService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);

		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/{id}")
	public ResponseEntity<?> updateAutor(@PathVariable("id") Long id, @Valid @RequestBody Autor au){
		
			Autor a = autorService.read(id);
			if(a.getId()>0) {
				return new ResponseEntity<>(autorService.update(au), HttpStatus.OK);
			}else {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
	
	
	
}
}
