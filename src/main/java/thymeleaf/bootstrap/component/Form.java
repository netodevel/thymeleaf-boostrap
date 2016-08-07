package thymeleaf.bootstrap.component;

import org.thymeleaf.dom.Element;

public class Form implements Component {

	private String id;
	private String name;
	private String classComponent;
	private String action;
	private String method;
	private String object;

	public Form() {
	}

	public Form(String id, String name, String classComponent, String action, String method, String object) {
		super();
		this.id = id;
		this.name = name;
		this.classComponent = classComponent;
		this.action = action;
		this.method = method;
		this.object = object;
	}

	public Form(String action, String method) {
		super();
		this.action = action;
		this.method = method;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getClassComponent() {
		return classComponent;
	}
	
	public void setClassComponent(String classComponent) {
		this.classComponent = classComponent;
	}
	
	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}
	
	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	@Override
	public Element toNode() {
		Element form = new Element("form");
	    form.setProcessable(true);
	    form.setAttribute("id", this.id);
	    form.setAttribute("name", this.name);
	    form.setAttribute("classComponent", this.classComponent);
	    form.setAttribute("object", this.object);
	    form.setAttribute("action", this.action);
	    form.setAttribute("method", this.method);
	    return form;
	}
	
}
