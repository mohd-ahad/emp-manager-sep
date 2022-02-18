package io.ahad.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.ahad.entity.Manager;
import io.ahad.payload.ManagerDTO;
import io.ahad.service.ManagerService;

@RestController
@RequestMapping("/manager")
public class ManagerController {

    @Autowired
    private ManagerService managerService;


    @PostMapping
    public ResponseEntity<ManagerDTO> createPost(@RequestBody ManagerDTO managerDto){
    	ManagerDTO response = managerService.createManager(managerDto);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping
    public List<Manager> getAll(){
        return this.managerService.getAllManagers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ManagerDTO> getManagerById(@PathVariable("id") Long id){
        ManagerDTO response =  managerService.getMangerById(id);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/{id}")
    public ManagerDTO updateManager(@RequestBody ManagerDTO managerDto, @PathVariable("id") Long id){
    	ManagerDTO postResponse = managerService.updateManager(managerDto, id);
        return postResponse;
    }

    @DeleteMapping("/{id}")
    public String deleteManager(@PathVariable("id") Long id){
        managerService.deleteManagerById(id);;
        return "post deleted successfully";
    }




}
