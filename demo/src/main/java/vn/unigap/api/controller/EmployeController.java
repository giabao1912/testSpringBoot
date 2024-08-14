package vn.unigap.api.controller;

import jakarta.ws.rs.PathParam;
import org.springframework.web.bind.annotation.*;
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
    public Employe createEmploye(@RequestBody Employe employe) {
        return employe;
    }
}
