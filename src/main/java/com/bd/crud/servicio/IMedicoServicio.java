package com.bd.crud.servicio;

import java.util.List;

import com.bd.crud.modelo.ClassMedico;



public interface IMedicoServicio {
	//declaramos los metodos
	public void RegistrarMedico(ClassMedico clmedico);
	public void EliminarMedico(Integer id);
	public List<ClassMedico> ListadoMedicos();
	public ClassMedico BuscarporId(Integer id);
	

}  //fin de la interface...
