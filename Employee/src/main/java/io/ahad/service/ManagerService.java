package io.ahad.service;

import java.util.List;

import org.springframework.stereotype.Service;

import io.ahad.entity.Manager;
import io.ahad.payload.ManagerDTO;

@Service
public interface ManagerService {
	ManagerDTO createManager(ManagerDTO managerDto);
    List<Manager>getAllManagers();
    ManagerDTO getMangerById(Long id);
    ManagerDTO updateManager(ManagerDTO managerDto, Long id);
    void deleteManagerById(Long id);
}
