/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package malcolm.repository;

import malcolm.entity.Trainers;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class TrainerRepo extends HibernateUtil<Trainers>{
    
   public List<Trainers> findAll() {
        return super.findAll("Trainers.findAll");
     } 

    @Override
    public void delete(Class<Trainers> type, int id) {
        super.delete(type, id); 
    }

    @Override
    public Trainers save(Trainers entity) {
        return super.save(entity); 
    }

    public Trainers find(int trainerid) {
      return super.find(Trainers.class, trainerid);    
        
        }
    

    
}
