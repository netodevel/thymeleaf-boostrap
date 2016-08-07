package thymeleaf.bootstrap.processor;

import org.thymeleaf.Arguments;
import org.thymeleaf.dom.Element;
import org.thymeleaf.processor.ProcessorResult;
import org.thymeleaf.processor.element.AbstractElementProcessor;
import org.thymeleaf.util.Validate;

import thymeleaf.bootstrap.component.Component;
import thymeleaf.bootstrap.component.Label;
import thymeleaf.bootstrap.dom.LabelTagGenerateDom;

public class BootstrapLabelProcessor extends AbstractElementProcessor {

	public BootstrapLabelProcessor() {
		super("label");
	}

	@Override
	protected ProcessorResult processElement(Arguments arguments, Element element) {
		String id = element.getAttributeValue("id");
		String value = element.getAttributeValue("value");
		String classElement = element.getAttributeValue("class");
		Validate.notNull(value, "You must define a value");

		LabelTagGenerateDom.generateLabel(element, new Label(id != null ? id : Component.generateId(), value, classElement != null ? classElement : "label label-default"));
		element.getParent().removeChild(element); 
		return ProcessorResult.OK;
	}

	@Override
	public int getPrecedence() {
		return 1000;
	}

}
