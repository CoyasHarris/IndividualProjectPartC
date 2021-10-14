/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package malcolm.services;

import malcolm.entity.Trainers;
import malcolm.repository.TrainerRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

@Transactional
@Service
public class TrainerService {

    @Autowired
    TrainerRepo trainerRepo;

    public List<Trainers> getTrainers() {
        List<Trainers> trainers = trainerRepo.findAll();
        return trainers;
    }

    public void addTrainer(Trainers trainer) {
        trainerRepo.save(trainer);
    }

    public void delete(@RequestParam("id") int id) {
        trainerRepo.delete(Trainers.class, id);

    }

    public Trainers getTrainerById(int trainerid) {
        return trainerRepo.find(trainerid);
    }

}
