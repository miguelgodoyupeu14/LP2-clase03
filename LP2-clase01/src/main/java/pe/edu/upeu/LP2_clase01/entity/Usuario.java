package pe.edu.upeu.LP2_clase01.entity;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="usuarios")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	@Column(name="estado")
	private char estado;
	
	@JsonManagedReference
	@OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	@JoinColumn(name = "empleado_id", referencedColumnName = "id")
	private Empleado empleado;
	
	@ManyToMany(targetEntity = Rol.class, fetch = FetchType.LAZY)
	@JoinTable(
			name="usuario_rol",
			joinColumns = @JoinColumn(name="usuario_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name="rol_id", referencedColumnName = "id")
			)
	private Set<Rol> roles;
}
