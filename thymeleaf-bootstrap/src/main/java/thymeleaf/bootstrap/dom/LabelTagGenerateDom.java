package thymeleaf.bootstrap.dom;


import org.thymeleaf.dom.Element;

import thymeleaf.bootstrap.component.Label;
/**
 * 
 * @author Jose
 *
 */
public class LabelTagGenerateDom {

	public static void generateLabel(Element element, Label label) {
		element.getParent().insertBefore(element, label.toNode());
	}
}
