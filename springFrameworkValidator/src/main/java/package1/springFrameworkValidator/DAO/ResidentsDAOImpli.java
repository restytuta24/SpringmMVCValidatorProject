package package1.springFrameworkValidator.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import package1.springFrameworkValidator.model.Residents;

@Repository
public class ResidentsDAOImpli implements ResidentsDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void saveResident(Residents resident) {
		Session session = sessionFactory.getCurrentSession();
		session.save(resident);
		
	}

	@Override
	public void updateResident(Residents resident) {
		Session session = sessionFactory.getCurrentSession();
		session.update(resident);
		
	}

	@Override
	public void deleteResident(int id) {
		Session session = sessionFactory.getCurrentSession();
		Residents resident = (Residents) session.get(Residents.class, new Integer(id));
		if(null != resident) {
			session.delete(resident);
		}
		
	}

	@Override
	public Residents getResidentById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Residents adjustedResident = (Residents) session.get(Residents.class, new Integer(id));
		return adjustedResident;
		
	}

	@Override
	public List<Residents> getAllResidents() {
		Session session = sessionFactory.getCurrentSession();
		List<Residents> residentsList = session.createQuery("from residents").list();
		return residentsList;
	}

}
