package thymeleaf.bootstrap.processor;

import org.thymeleaf.Arguments;
import org.thymeleaf.dom.Element;
import org.thymeleaf.processor.ProcessorResult;
import org.thymeleaf.processor.element.AbstractElementProcessor;

import thymeleaf.bootstrap.component.Label;
import thymeleaf.bootstrap.dom.LabelTagGenerateDom;

public class BootstrapLabelProcessor extends AbstractElementProcessor {

	public BootstrapLabelProcessor() {
		super("label");
	}

	@Override
	protected ProcessorResult processElement(Arguments arguments, Element element) {
		LabelTagGenerateDom.generateLabel(element, new Label(element.getAttributeValue("text")));
		element.getParent().removeChild(element); 
		return ProcessorResult.OK;
	}

	@Override
	public int getPrecedence() {
		return 1000;
	}

}
