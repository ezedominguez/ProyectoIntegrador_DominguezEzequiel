package com.portfolio.egd.Interface;

import com.portfolio.egd.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    // Traer una persona
    public List<Persona> getPersona();
    
    // Guardar un objeto de tipo Person
    public void savePersona(Persona persona);
    
    // Eliminar un objeto pero lo buscamos por ID
    public void deletePersona(Long id);
    
    // Buscar una persona por ID
    public Persona findPersona(Long id);
}