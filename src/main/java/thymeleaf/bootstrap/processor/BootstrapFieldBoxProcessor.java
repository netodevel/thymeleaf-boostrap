package thymeleaf.bootstrap.processor;

import org.thymeleaf.Arguments;
import org.thymeleaf.dom.Element;
import org.thymeleaf.processor.element.AbstractConditionalVisibilityElementProcessor;

public class BootstrapFieldBoxProcessor extends AbstractConditionalVisibilityElementProcessor {

	public BootstrapFieldBoxProcessor() {
		super("field-box");
	}

	public boolean removeHostElementIfVisible(Arguments arguments, Element element) {
		return false;
	}

	public boolean isVisible(Arguments arguments, Element element) {
		java.lang.reflect.Field field = (java.lang.reflect.Field) element.getNodeProperty("field");
		for (Element node : element.getElementChildren()) {
			if (node.getNormalizedName().equals(field.getName())) {
				node.setNodeProperty("field", field);
				node.setProcessable(true);
				return true;
			}
		}
		return false;
	}

	public int getPrecedence() {
		return 1000;
	}

}
