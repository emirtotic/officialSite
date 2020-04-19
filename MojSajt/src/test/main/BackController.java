package test.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import test.main.dao.ContactDAOInterface;
import test.main.dao.DownloadersDAOInterface;
import test.main.entity.Contact;
import test.main.entity.Downloaders;

@Controller
@RequestMapping("/administration")
public class BackController {

	@Autowired
	private ContactDAOInterface contactDAO;
	
	@Autowired
	private DownloadersDAOInterface downloadersDAO;
	
	
	@RequestMapping({"/", "/contact-list"})
	public String getContactList(Model model) {
		
		List<Contact> contactList = contactDAO.getContactList();
		model.addAttribute("contactList", contactList);
		
		return "contact-list";
	}
	
	@RequestMapping("/contacts")
	public String getContacts(Model model) {
		
		List<Contact> contactList = contactDAO.getContactList();
		model.addAttribute("contactList", contactList);
		
		return "contacts-page";
	}
	
	@RequestMapping("/contact-delete")
	public String deleteContact(int id) {
		
		contactDAO.deleteContact(id);
		
		return "redirect:/administration/contact-list";
		
	}
	
	
	// DOWNLOADERS SECTION !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	
	@RequestMapping("/downloaders-list")
	public String getDownloadersList(Model model) {
		
		List<Downloaders> downloadersList = downloadersDAO.getDownloadersList();
		model.addAttribute("downloadersList", downloadersList);
		
		return "downloaders-page";
	}
	
	@RequestMapping("/downloaders-save")
	public String saveDownloader(@ModelAttribute Downloaders downloader) {
		
		downloadersDAO.saveDownloader(downloader);
		
		return "downloaders-page";
		
	}
	
	@RequestMapping("/downloads-delete")
	public String deleteDownloader(int id) {
		
		downloadersDAO.deleteDownloader(id);
		
		return "redirect:/administration/downloaders-list";
		
	}
	
}
