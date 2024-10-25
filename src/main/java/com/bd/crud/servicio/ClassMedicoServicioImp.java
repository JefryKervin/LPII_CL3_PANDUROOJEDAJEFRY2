package com.bd.crud.servicio;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bd.crud.modelo.ClassMedico;
import com.bd.crud.repositorio.IMedicoRepository;


@Service
public class ClassMedicoServicioImp implements IMedicoServicio{
	//aplicamos la inyeccion de dependencia...
		@Autowired
		private IMedicoRepository imedicomepository;

	@Override
	public void RegistrarMedico(ClassMedico clmedico) {
		// metodo guardar
		imedicomepository.save(clmedico);
		
	}//fin del metodo registrar

	@Override
	public void EliminarMedico(Integer id) {
		// metodo eliminar
		imedicomepository.deleteById(id);
		
	}// fin del metodo eliminar

	@Override
	public List<ClassMedico> ListadoMedicos() {
		// listado
		return (List<ClassMedico>)imedicomepository.findAll();
	}//fin del metodo listar

	@Override
	public ClassMedico BuscarporId(Integer id) {
		// metodo buscar por cod
		return imedicomepository.findById(id).orElse(null);
	}//fin del metodo buscar

}//fin de la clase imp....