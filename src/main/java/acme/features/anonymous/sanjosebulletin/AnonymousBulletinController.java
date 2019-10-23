
package acme.features.anonymous.sanjosebulletin;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.sanjosebulletin.SanjoseBulletin;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Anonymous;

@Controller
@RequestMapping("/anonymous/sanjose-bulletin/")
public class AnonymousBulletinController extends AbstractController<Anonymous, SanjoseBulletin> {

	@Autowired
	private AnonymousBulletinListService	listService;

	@Autowired
	private AnonymousBulletinCreateService	createService;


	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.CREATE, this.createService);
	}

}
