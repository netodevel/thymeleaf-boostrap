package thymeleaf.bootstrap.dialect;

import java.util.HashSet;
import java.util.Set;

import org.thymeleaf.dialect.AbstractDialect;
import org.thymeleaf.processor.IProcessor;

import thymeleaf.bootstrap.processor.BootstrapFormProcessor;
import thymeleaf.bootstrap.processor.BootstrapLabelProcessor;

/**
 * 
 * @author Jose
 *
 */
public class BootstrapDialect extends AbstractDialect {
	public static final String DIALECT_PREFIX = "bootstrap";
	public static final String LAYOUT_NAMESPACE = "http://github.com/netodevel/";
	
	public String getPrefix() {
		return DIALECT_PREFIX;
	}

	public boolean isLenient() {
		return false;
	}
	
	@Override
	public Set<IProcessor> getProcessors() {
		final Set<IProcessor> processors = new HashSet<IProcessor>();
		processors.add(new BootstrapLabelProcessor());
		processors.add(new BootstrapFormProcessor());
		return processors;
	}

}
