package gs.dzee.dao;

import gs.dzee.model.Member;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataDaoImpl {

	@Autowired
	SessionFactory sessionFactory;
	
	Session session;
	Transaction tx;
	
	public boolean addEntity(Member member)throws Exception{
		
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.save(member);
		tx.commit();
		session.close();
		
		return true;
	}
}
