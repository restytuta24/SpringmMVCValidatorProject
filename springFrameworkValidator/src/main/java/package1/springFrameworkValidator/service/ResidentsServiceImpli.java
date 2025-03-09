package package1.springFrameworkValidator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import package1.springFrameworkValidator.DAO.ResidentsDAO;
import package1.springFrameworkValidator.model.Residents;

@Service
public class ResidentsServiceImpli implements ResidentsService{
	
	@Autowired
	private ResidentsDAO residentsDAO;

	@Transactional 
	@Override
	public void saveResident(Residents resident) {
		residentsDAO.saveResident(resident);
		
	}
	
	@Transactional
	@Override
	public void updateResident(Residents resident) {
		residentsDAO.updateResident(resident);
		
	}
	
	@Transactional 
	@Override
	public void deleteResident(int id) {
		residentsDAO.deleteResident(id);
		
	}
	
	@Transactional
	@Override
	public Residents getResidentById(int id) {
		return residentsDAO.getResidentById(id);
	}
	
	@Transactional 
	@Override
	public List<Residents> getAllResidents() {
		return residentsDAO.getAllResidents();
	}

}
