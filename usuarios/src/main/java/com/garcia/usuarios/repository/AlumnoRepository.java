package com.garcia.usuarios.repository;

import com.garcia.usuarios.entity.Alumno;
import org.springframework.data.repository.CrudRepository;

public interface AlumnoRepository extends CrudRepository <Alumno, Long> {
}
