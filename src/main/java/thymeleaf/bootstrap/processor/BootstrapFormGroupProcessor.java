package thymeleaf.bootstrap.processor;

import org.thymeleaf.Arguments;
import org.thymeleaf.dom.Element;
import org.thymeleaf.processor.ProcessorResult;
import org.thymeleaf.processor.element.AbstractElementProcessor;

import thymeleaf.bootstrap.component.FormGroup;
import thymeleaf.bootstrap.dom.GenerateDom;

public class BootstrapFormGroupProcessor extends AbstractElementProcessor {

	public BootstrapFormGroupProcessor() {
		super("formgroup");
	}

	@Override
	protected ProcessorResult processElement(Arguments arguments, Element element) {
		
		for (Element node : element.getElementChildren()) {
			System.out.println(node.getNormalizedName());
		}
		
		String classElement = element.getAttributeValue("class");
		FormGroup formGroup = new FormGroup(classElement != null ? classElement : "form-group");
		GenerateDom.generate(element, formGroup.toNode());
		element.getParent().removeChild(element);
		return ProcessorResult.OK;
	}

	@Override
	public int getPrecedence() {
		return 1000;
	}

}
