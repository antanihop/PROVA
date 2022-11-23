package net.rossonet.console.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultRedirectPage {

	@RequestMapping("/logoutOauth")
	public String logout(final HttpServletRequest request, final HttpServletResponse response) throws ServletException {
		final Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		authentication.setAuthenticated(false);
		new SecurityContextLogoutHandler().logout(request, response, authentication);
		SecurityContextHolder.clearContext();
		request.logout();
		request.getSession().invalidate();
		return "redirect:/";
	}

	@RequestMapping(value = "/")
	public String mainPage() {
		return "redirect:/app/main";
	}

}
