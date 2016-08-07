package thymeleaf.bootstrap.dom;

import org.thymeleaf.dom.Element;

public interface GenerateDom {
	
	public static void generate(Element element, Element component) {
		element.getParent().insertBefore(element, component);
	}

}
