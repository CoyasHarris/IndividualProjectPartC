/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package malcolm.controller;

import malcolm.entity.Trainers;
import malcolm.services.TrainerService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/trainer")
public class TrainerController {

    @Autowired
    private TrainerService trainerService;

    @RequestMapping
    public String showTrainers(Model model) {
        List<Trainers> trainerlist = trainerService.getTrainers();
        model.addAttribute("listofTrainers", trainerlist);
        return "trainerList";
    }

    @GetMapping("/delete/{trainerid}")
    public String delete(@PathVariable("trainerid") int id, RedirectAttributes attributes) {

        trainerService.delete(id);
        String minima = "Trainer successfully deleted!!";
        attributes.addFlashAttribute("message", minima);
        return "redirect:/trainer";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String showForm(@ModelAttribute("daskalos") Trainers trainer) {
        return "trainerForm";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String create(@Valid @ModelAttribute("daskalos") Trainers trainer,
            BindingResult result,
            RedirectAttributes attributes) {
        if (result.hasErrors()) {
            return "trainerForm";
        }
        trainerService.addTrainer(trainer);
        String minima = "Trainer " + trainer.getTrlast() + " successfully created!!";
        attributes.addFlashAttribute("message", minima);
        return "redirect:/trainer";
    }

    @GetMapping("/update/{trainerid}")
    public String showFormUpdate(@PathVariable("trainerid") int id, Model model) {
        Trainers trainer = trainerService.getTrainerById(id);
        model.addAttribute("daskalos", trainer);
        return "trainerForm";
    }

    @PostMapping("/update")
    public String update(@Valid @ModelAttribute("daskalos") Trainers trainer,
            BindingResult result,
            RedirectAttributes attributes) {
        if (result.hasErrors()) {
            return "trainerForm";
        }
        trainerService.addTrainer(trainer);
        String minima = "Trainer updated successfully!!";
        attributes.addFlashAttribute("message", minima);
        return "redirect:/trainer";

    }
}
