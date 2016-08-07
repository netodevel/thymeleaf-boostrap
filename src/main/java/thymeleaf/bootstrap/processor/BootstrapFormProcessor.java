package thymeleaf.bootstrap.processor;

import org.thymeleaf.Arguments;
import org.thymeleaf.dom.Element;
import org.thymeleaf.processor.ProcessorResult;
import org.thymeleaf.processor.element.AbstractElementProcessor;

import thymeleaf.bootstrap.component.Component;
import thymeleaf.bootstrap.component.Form;
import thymeleaf.bootstrap.dom.GenerateDom;

public class BootstrapFormProcessor extends AbstractElementProcessor {

	public BootstrapFormProcessor() {
		super("form");
	}

	@Override
	protected ProcessorResult processElement(Arguments arguments, Element element) {
		
		String id = element.getAttributeValue("id");
		String name = element.getAttributeValue("name");
		String classElement = element.getAttributeValue("class");
		String action = element.getAttributeValue("action");
		String method = element.getAttributeValue("method");
		String object = element.getAttributeValue("object");
		
		Form form = prepareForm(id, name, classElement, action, method, object);

		GenerateDom.generate(element, form.toNode());
		element.getParent().removeChild(element); 
		return ProcessorResult.OK;
	}


	@Override
	public int getPrecedence() {
		return 1000;
	}

	private Form prepareForm(String id, String name, String classElement, String action, String method, String object) {
		Form form = new Form();
		form.setId(id != null ? id : Component.generateId());
		form.setName(name);
		form.setClassComponent(classElement != null ? classElement : "form-horizontal");
		form.setAction(action);
		form.setMethod(method);
		form.setObject(object);
		return form;
	}
	
}
