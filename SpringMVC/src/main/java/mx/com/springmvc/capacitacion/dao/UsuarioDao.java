package mx.com.springmvc.capacitacion.dao;

import java.util.List;

import mx.com.springmvc.capacitacion.domain.TipoSexo;
import mx.com.springmvc.capacitacion.domain.Usuario;

public interface UsuarioDao {

	void salvar(Usuario usuario);
	
	void editar(Usuario usuario);
	
	void excluir(Long id);
	
	Usuario getId(Long id);
	
	List<Usuario> getTodos();

	List<Usuario> getBySexo(TipoSexo sexo);

	List<Usuario> getByNome(String nome); 
}
