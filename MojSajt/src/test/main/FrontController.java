package test.main;


import java.util.List;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;

import test.main.dao.ContactDAOInterface;
import test.main.dao.DownloadersDAOInterface;
import test.main.entity.Contact;
import test.main.entity.Downloaders;

@Controller
@RequestMapping("/")
public class FrontController {

	@Autowired
	private ContactDAOInterface contactDAO;

	@Autowired
	private DownloadersDAOInterface downloadersDAO;

	@RequestMapping({ "/", "/main-page" })
	public String getMain(Model model) {

		model.addAttribute("contact", new Contact());
		model.addAttribute("downloader", new Downloaders());

		return "front/main-page";
	}

	@RequestMapping("/contact-save")
	public String getContact(@Valid @ModelAttribute Contact contact, BindingResult result) {

		if (result.hasErrors()) {

			System.out.println("Ima gresaka...");

			return "redirect: main-page";

		}

		contactDAO.saveContact(contact);

		return "redirect: main-page";
	}

	// DOWNLOADERS SECTION !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

	@RequestMapping("/downloaders-save")
	public String getDownloaders(@Valid @ModelAttribute Downloaders downloaders, BindingResult result) {

		if (result.hasErrors()) {

			System.out.println("Nisu uneti parametri na stranici!");

			return "redirect: main-page";

		}

		downloadersDAO.saveDownloader(downloaders);

		return "redirect: https://drive.google.com/open?id=19UPV4KwOMbpEEQVmYWWFiGL4MFxOGuJo";
	}

}
