package vn.unigap.api.controller;

import jakarta.ws.rs.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.unigap.api.entity.Employe;


@RestController
public class EmployeController {

    @GetMapping("/employe/{id}")
    public Employe getEmployeById(@PathVariable("id") Long id) {
        Employe employe = new Employe();
        employe.setId(id);
        employe.setEmail("employe" + id + "@unigap.vn");
        return employe;
    }
    @PostMapping("/employe")
    public Employe createEmploye(Employe employe) {
        return employe;
    }
}
