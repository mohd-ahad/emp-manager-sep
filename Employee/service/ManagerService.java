package emp.portal.service;

import java.util.List;

import emp.portal.entity.Manager;
import emp.portal.payload.ManagerDTO;

public interface ManagerService {
	ManagerDTO createManager(ManagerDTO managerDto);
    List<Manager>getAllManagers();
    ManagerDTO getMangerById(Long id);
    ManagerDTO updateManager(ManagerDTO managerDto, Long id);
    void deleteManagerById(Long id);
}
