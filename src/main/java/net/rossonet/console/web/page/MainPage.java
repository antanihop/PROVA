package net.rossonet.console.web.page;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.logging.Logger;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.material.Material;

@Route(value = "/main", absolute = true)
@Theme(value = Material.class, variant = Material.LIGHT)
public class MainPage extends VerticalLayout {

	private static final Logger logger = Logger.getLogger(MainPage.class.getName());

	private static final long serialVersionUID = -751854671882461650L;

	private final VerticalLayout mainView = new VerticalLayout();

	public MainPage() throws UnrecoverableKeyException, KeyStoreException, NoSuchAlgorithmException,
			CertificateException, FileNotFoundException, IOException {
		mainView.setId("mainView");
		mainView.setHeightFull();
		setWidthFull();
		setHeightFull();
		setMargin(true);
		setSpacing(false);
		setSizeFull();
		logger.info("main page started");
	}

}
