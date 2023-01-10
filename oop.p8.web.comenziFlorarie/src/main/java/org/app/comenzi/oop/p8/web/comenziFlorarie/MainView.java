package org.app.comenzi.oop.p8.web.comenziFlorarie;

import org.app.comenzi.web.views.clienti.FormClientView;
import org.app.comenzi.web.views.clienti.NavigableGridClientiView;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.contextmenu.SubMenu;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLayout;

/**
 * The main view contains a button and a click listener.
 */
@Route
public class MainView extends VerticalLayout implements RouterLayout {
	public MainView() {
		setMenuBar();
		
	}	
	private void setMenuBar() {
		MenuBar mainMenu = new MenuBar();
		MenuItem homeMenu = mainMenu.addItem("Home");
		homeMenu.addClickListener(event -> UI.getCurrent().navigate(MainView.class));
		//
		MenuItem gridFormsClientiMenu = mainMenu.addItem("Clienti");
		SubMenu gridFormsClientiMenuBar = gridFormsClientiMenu.getSubMenu();
		gridFormsClientiMenuBar.addItem("Lista Clienti...", 
				event -> UI.getCurrent().navigate(NavigableGridClientiView.class));
		gridFormsClientiMenuBar.addItem("Form Editare Client...", 
				event -> UI.getCurrent().navigate(FormClientView.class));
		//
		add(new HorizontalLayout(mainMenu));
		}
}
