package package1.springFrameworkValidator.DAO;

import java.util.List;

import package1.springFrameworkValidator.model.Residents;


public interface ResidentsDAO {
	
	
	public void saveResident(Residents resident);
	
	public void updateResident(Residents resident);
	
	public void deleteResident(int id);
	
	public Residents getResidentById(int id);
	
	public List<Residents>getAllResidents();

}
