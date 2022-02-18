package io.ahad.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import org.modelmapper.ModelMapper;
import io.ahad.entity.Manager;
import io.ahad.payload.ManagerDTO;
import io.ahad.repository.ManagerRepository;

@Service
public class ManagerServiceImpl implements ManagerService {

	 @Autowired
	    private ManagerRepository managerRepository;
	
	@Autowired
	    private ModelMapper mapper;

	 @Override
		public ManagerDTO createManager(ManagerDTO managerDto) {
	        // convert DTO to entity
	        Manager manager = mapToEntity(managerDto);
	        Manager newManager = managerRepository.save(manager);
	        // convert entity to DTO
	        ManagerDTO managerResponse = mapToDto(newManager);
	        return managerResponse;
	    }
	 
	 	private Manager mapToEntity(ManagerDTO managerDto){
	        Manager post = mapper.map(managerDto, Manager.class);
	        return post;
	    }
	 	 private ManagerDTO mapToDto(Manager manager){
	         ManagerDTO managerDto = mapper.map(manager, ManagerDTO.class);
	         return managerDto;
	     }

		
		@Override
		public List<Manager> getAllManagers() {
			return managerRepository.findAll();
		}

		@Override
		public ManagerDTO getMangerById(Long id) {
			 Manager manager = managerRepository.findById(id).get();
		        return mapToDto(manager);
		}

		@Override
		public ManagerDTO updateManager(ManagerDTO managerDto, Long id) {
			Manager manager = managerRepository.findById(id).get();
	        manager.setId(managerDto.getId());
	        manager.setName(managerDto.getName());
	        Manager updateManager = managerRepository.save(manager);
	        return mapToDto(updateManager);
		}

		@Override
		public void deleteManagerById(Long id) {
				Manager manager = managerRepository.findById(id).get();
		        managerRepository.delete(manager);
		}
}
