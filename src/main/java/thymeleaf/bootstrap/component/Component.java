package thymeleaf.bootstrap.component;

import java.util.UUID;

import org.thymeleaf.dom.Element;

public interface Component {
	
	public Element toNode();
	
	/**
	 * Generate ID component if not add atributte id.
	 * @return
	 */
	static String generateId() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
}
