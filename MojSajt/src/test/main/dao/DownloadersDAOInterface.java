package test.main.dao;

import java.util.List;

import test.main.entity.Downloaders;

public interface DownloadersDAOInterface {
	
	public Downloaders getDownloader(int id);
	
	public List<Downloaders> getDownloadersList();
	
	public void saveDownloader(Downloaders downloader);
	
	public void deleteDownloader(int id);

}
