package thymeleaf.bootstrap.component;

import org.thymeleaf.dom.Element;

public class FormGroup implements Component {

	private String classComponent;
	
	public FormGroup() {
	}

	public FormGroup(String classComponent) {
		super();
		this.classComponent = classComponent;
	}

	public String getClassComponent() {
		return classComponent;
	}
	
	public void setClassComponent(String classComponent) {
		this.classComponent = classComponent;
	}

	@Override
	public Element toNode() {
		Element div = new Element("div");
		div.setProcessable(true);
		div.setAttribute("class", this.getClassComponent());
		return div;
	}

}
