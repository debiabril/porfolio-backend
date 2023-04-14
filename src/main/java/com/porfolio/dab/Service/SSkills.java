package com.porfolio.dab.Service;

import com.porfolio.dab.Entity.Skills;
import com.porfolio.dab.Repository.RSkills;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class SSkills {
    @Autowired
    RSkills rskills;
    
    public List<Skills> list(){
        return rskills.findAll();
    }
    
    public Optional<Skills> getOne(int id){
        return rskills.findById(id);
    }
    
    public Optional<Skills> getByNombre(String nombre){
        return rskills.findByNombre(nombre);
    }
    
    public void save(Skills skill){
        rskills.save(skill);
    }
    
    public void delete(int id){
        rskills.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rskills.existsById(id);
    }
    
    public boolean existsByNombre(String nombre){
        return rskills.existsByNombre(nombre);
    }
}
