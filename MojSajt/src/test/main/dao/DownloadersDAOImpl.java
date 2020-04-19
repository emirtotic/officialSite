package test.main.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import test.main.entity.Downloaders;

@Repository
public class DownloadersDAOImpl implements DownloadersDAOInterface {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	@Override
	public Downloaders getDownloader(int id) {
		
		Session session = sessionFactory.getCurrentSession();
		
		Downloaders downloader = session.get(Downloaders.class, id);
		
		return downloader;
	}

	@Transactional
	@Override
	public List<Downloaders> getDownloadersList() {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query<Downloaders> query = session.createQuery("from Downloaders", Downloaders.class);
		
		List<Downloaders> downloadersList = query.getResultList();
		
		return downloadersList;
	}

	@Transactional
	@Override
	public void saveDownloader(Downloaders downloader) {
		
		Session session = sessionFactory.getCurrentSession();
		
		session.saveOrUpdate(downloader);
		
	}

	@Transactional
	@Override
	public void deleteDownloader(int id) {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query query = session.createQuery("delete from Downloaders where id = :id");
		
		query.setParameter("id", id);
		
		query.executeUpdate();
		
		
	}

}
