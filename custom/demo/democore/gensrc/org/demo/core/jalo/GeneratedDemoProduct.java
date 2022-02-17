/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Feb 17, 2022, 12:09:53 PM                   ---
 * ----------------------------------------------------------------
 */
package org.demo.core.jalo;

import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.product.Product;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.demo.core.constants.DemoCoreConstants;

/**
 * Generated class for type {@link de.hybris.platform.jalo.product.Product DemoProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedDemoProduct extends Product
{
	/** Qualifier of the <code>DemoProduct.searchable</code> attribute **/
	public static final String SEARCHABLE = "searchable";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Product.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SEARCHABLE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DemoProduct.searchable</code> attribute.
	 * @return the searchable - Searchable Product
	 */
	public Boolean isSearchable(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SEARCHABLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DemoProduct.searchable</code> attribute.
	 * @return the searchable - Searchable Product
	 */
	public Boolean isSearchable()
	{
		return isSearchable( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DemoProduct.searchable</code> attribute. 
	 * @return the searchable - Searchable Product
	 */
	public boolean isSearchableAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSearchable( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DemoProduct.searchable</code> attribute. 
	 * @return the searchable - Searchable Product
	 */
	public boolean isSearchableAsPrimitive()
	{
		return isSearchableAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DemoProduct.searchable</code> attribute. 
	 * @param value the searchable - Searchable Product
	 */
	public void setSearchable(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SEARCHABLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DemoProduct.searchable</code> attribute. 
	 * @param value the searchable - Searchable Product
	 */
	public void setSearchable(final Boolean value)
	{
		setSearchable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DemoProduct.searchable</code> attribute. 
	 * @param value the searchable - Searchable Product
	 */
	public void setSearchable(final SessionContext ctx, final boolean value)
	{
		setSearchable( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DemoProduct.searchable</code> attribute. 
	 * @param value the searchable - Searchable Product
	 */
	public void setSearchable(final boolean value)
	{
		setSearchable( getSession().getSessionContext(), value );
	}
	
}
