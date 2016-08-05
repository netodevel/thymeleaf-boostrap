package thymeleaf.bootstrap.component;

import java.util.List;

import org.thymeleaf.dom.Element;
import org.thymeleaf.dom.Text;

/**
 * 
 * @author Jose
 *
 */
public class Label implements Component {

	private String id;
	private String text;
	private List<String> cssClasses;
	
	public Label(){
	}
	
	public Label(String text) {
		this.text = text;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public List<String> getCssClasses() {
		return cssClasses;
	}
	
	public void setCssClasses(List<String> cssClasses) {
		this.cssClasses = cssClasses;
	}
	
	@Override
	public Element toNode() {
		Element label = new Element("span");
		label.setProcessable(true);
		label.setAttribute("class", "label label-default");
		label.addChild(new Text(this.text));
		return label;
	}
	
}

