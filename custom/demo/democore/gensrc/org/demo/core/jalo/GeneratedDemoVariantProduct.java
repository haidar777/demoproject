/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Feb 12, 2022, 1:51:00 AM                    ---
 * ----------------------------------------------------------------
 */
package org.demo.core.jalo;

import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.variants.jalo.VariantProduct;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.demo.core.constants.DemoCoreConstants;

/**
 * Generated class for type {@link de.hybris.platform.variants.jalo.VariantProduct DemoVariantProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedDemoVariantProduct extends VariantProduct
{
	/** Qualifier of the <code>DemoVariantProduct.size</code> attribute **/
	public static final String SIZE = "size";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(VariantProduct.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SIZE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DemoVariantProduct.size</code> attribute.
	 * @return the size - Product Size
	 */
	public String getSize(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SIZE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DemoVariantProduct.size</code> attribute.
	 * @return the size - Product Size
	 */
	public String getSize()
	{
		return getSize( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DemoVariantProduct.size</code> attribute. 
	 * @param value the size - Product Size
	 */
	public void setSize(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SIZE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DemoVariantProduct.size</code> attribute. 
	 * @param value the size - Product Size
	 */
	public void setSize(final String value)
	{
		setSize( getSession().getSessionContext(), value );
	}
	
}
