/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
<<<<<<< HEAD
 * --- Generated at Feb 18, 2022, 6:31:41 PM                    ---
=======
 * --- Generated at Feb 18, 2022, 2:32:36 PM                    ---
>>>>>>> 912382c3cb00aca7c14c26dcae3254efdb1ba536
 * ----------------------------------------------------------------
 */
package org.demo.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.user.User;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.demo.core.constants.DemoCoreConstants;

/**
 * Generated class for type {@link org.demo.core.jalo.Testimony Testimony}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedTestimony extends GenericItem
{
	/** Qualifier of the <code>Testimony.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Testimony.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Testimony.rating</code> attribute **/
	public static final String RATING = "rating";
	/** Qualifier of the <code>Testimony.title</code> attribute **/
	public static final String TITLE = "title";
	/** Qualifier of the <code>Testimony.desc</code> attribute **/
	public static final String DESC = "desc";
	/** Qualifier of the <code>Testimony.date</code> attribute **/
	public static final String DATE = "date";
	/** Qualifier of the <code>Testimony.user</code> attribute **/
	public static final String USER = "user";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n USER's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedTestimony> USERHANDLER = new BidirectionalOneToManyHandler<GeneratedTestimony>(
	DemoCoreConstants.TC.TESTIMONY,
	false,
	"user",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(RATING, AttributeMode.INITIAL);
		tmp.put(TITLE, AttributeMode.INITIAL);
		tmp.put(DESC, AttributeMode.INITIAL);
		tmp.put(DATE, AttributeMode.INITIAL);
		tmp.put(USER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimony.code</code> attribute.
	 * @return the code - Testimony Code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimony.code</code> attribute.
	 * @return the code - Testimony Code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimony.code</code> attribute. 
	 * @param value the code - Testimony Code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimony.code</code> attribute. 
	 * @param value the code - Testimony Code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		USERHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimony.date</code> attribute.
	 * @return the date - Testimony Date
	 */
	public Date getDate(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTestimony.getDate requires a session language", 0 );
		}
		return (Date)getLocalizedProperty( ctx, DATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimony.date</code> attribute.
	 * @return the date - Testimony Date
	 */
	public Date getDate()
	{
		return getDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimony.date</code> attribute. 
	 * @return the localized date - Testimony Date
	 */
	public Map<Language,Date> getAllDate(final SessionContext ctx)
	{
		return (Map<Language,Date>)getAllLocalizedProperties(ctx,DATE,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimony.date</code> attribute. 
	 * @return the localized date - Testimony Date
	 */
	public Map<Language,Date> getAllDate()
	{
		return getAllDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimony.date</code> attribute. 
	 * @param value the date - Testimony Date
	 */
	public void setDate(final SessionContext ctx, final Date value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTestimony.setDate requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimony.date</code> attribute. 
	 * @param value the date - Testimony Date
	 */
	public void setDate(final Date value)
	{
		setDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimony.date</code> attribute. 
	 * @param value the date - Testimony Date
	 */
	public void setAllDate(final SessionContext ctx, final Map<Language,Date> value)
	{
		setAllLocalizedProperties(ctx,DATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimony.date</code> attribute. 
	 * @param value the date - Testimony Date
	 */
	public void setAllDate(final Map<Language,Date> value)
	{
		setAllDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimony.desc</code> attribute.
	 * @return the desc - Testimony Description
	 */
	public String getDesc(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTestimony.getDesc requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DESC);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimony.desc</code> attribute.
	 * @return the desc - Testimony Description
	 */
	public String getDesc()
	{
		return getDesc( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimony.desc</code> attribute. 
	 * @return the localized desc - Testimony Description
	 */
	public Map<Language,String> getAllDesc(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DESC,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimony.desc</code> attribute. 
	 * @return the localized desc - Testimony Description
	 */
	public Map<Language,String> getAllDesc()
	{
		return getAllDesc( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimony.desc</code> attribute. 
	 * @param value the desc - Testimony Description
	 */
	public void setDesc(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTestimony.setDesc requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DESC,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimony.desc</code> attribute. 
	 * @param value the desc - Testimony Description
	 */
	public void setDesc(final String value)
	{
		setDesc( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimony.desc</code> attribute. 
	 * @param value the desc - Testimony Description
	 */
	public void setAllDesc(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DESC,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimony.desc</code> attribute. 
	 * @param value the desc - Testimony Description
	 */
	public void setAllDesc(final Map<Language,String> value)
	{
		setAllDesc( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimony.name</code> attribute.
	 * @return the name - User Name
	 */
	public String getName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTestimony.getName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimony.name</code> attribute.
	 * @return the name - User Name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimony.name</code> attribute. 
	 * @return the localized name - User Name
	 */
	public Map<Language,String> getAllName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,NAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimony.name</code> attribute. 
	 * @return the localized name - User Name
	 */
	public Map<Language,String> getAllName()
	{
		return getAllName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimony.name</code> attribute. 
	 * @param value the name - User Name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTestimony.setName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimony.name</code> attribute. 
	 * @param value the name - User Name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimony.name</code> attribute. 
	 * @param value the name - User Name
	 */
	public void setAllName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimony.name</code> attribute. 
	 * @param value the name - User Name
	 */
	public void setAllName(final Map<Language,String> value)
	{
		setAllName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimony.rating</code> attribute.
	 * @return the rating - User Rating
	 */
	public Integer getRating(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTestimony.getRating requires a session language", 0 );
		}
		return (Integer)getLocalizedProperty( ctx, RATING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimony.rating</code> attribute.
	 * @return the rating - User Rating
	 */
	public Integer getRating()
	{
		return getRating( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimony.rating</code> attribute. 
	 * @return the rating - User Rating
	 */
	public int getRatingAsPrimitive(final SessionContext ctx)
	{
		Integer value = getRating( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimony.rating</code> attribute. 
	 * @return the rating - User Rating
	 */
	public int getRatingAsPrimitive()
	{
		return getRatingAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimony.rating</code> attribute. 
	 * @return the localized rating - User Rating
	 */
	public Map<Language,Integer> getAllRating(final SessionContext ctx)
	{
		return (Map<Language,Integer>)getAllLocalizedProperties(ctx,RATING,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimony.rating</code> attribute. 
	 * @return the localized rating - User Rating
	 */
	public Map<Language,Integer> getAllRating()
	{
		return getAllRating( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimony.rating</code> attribute. 
	 * @param value the rating - User Rating
	 */
	public void setRating(final SessionContext ctx, final Integer value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTestimony.setRating requires a session language", 0 );
		}
		setLocalizedProperty(ctx, RATING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimony.rating</code> attribute. 
	 * @param value the rating - User Rating
	 */
	public void setRating(final Integer value)
	{
		setRating( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimony.rating</code> attribute. 
	 * @param value the rating - User Rating
	 */
	public void setRating(final SessionContext ctx, final int value)
	{
		setRating( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimony.rating</code> attribute. 
	 * @param value the rating - User Rating
	 */
	public void setRating(final int value)
	{
		setRating( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimony.rating</code> attribute. 
	 * @param value the rating - User Rating
	 */
	public void setAllRating(final SessionContext ctx, final Map<Language,Integer> value)
	{
		setAllLocalizedProperties(ctx,RATING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimony.rating</code> attribute. 
	 * @param value the rating - User Rating
	 */
	public void setAllRating(final Map<Language,Integer> value)
	{
		setAllRating( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimony.title</code> attribute.
	 * @return the title - Testimony Title
	 */
	public String getTitle(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTestimony.getTitle requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, TITLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimony.title</code> attribute.
	 * @return the title - Testimony Title
	 */
	public String getTitle()
	{
		return getTitle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimony.title</code> attribute. 
	 * @return the localized title - Testimony Title
	 */
	public Map<Language,String> getAllTitle(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,TITLE,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimony.title</code> attribute. 
	 * @return the localized title - Testimony Title
	 */
	public Map<Language,String> getAllTitle()
	{
		return getAllTitle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimony.title</code> attribute. 
	 * @param value the title - Testimony Title
	 */
	public void setTitle(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTestimony.setTitle requires a session language", 0 );
		}
		setLocalizedProperty(ctx, TITLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimony.title</code> attribute. 
	 * @param value the title - Testimony Title
	 */
	public void setTitle(final String value)
	{
		setTitle( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimony.title</code> attribute. 
	 * @param value the title - Testimony Title
	 */
	public void setAllTitle(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,TITLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimony.title</code> attribute. 
	 * @param value the title - Testimony Title
	 */
	public void setAllTitle(final Map<Language,String> value)
	{
		setAllTitle( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimony.user</code> attribute.
	 * @return the user
	 */
	public User getUser(final SessionContext ctx)
	{
		return (User)getProperty( ctx, USER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Testimony.user</code> attribute.
	 * @return the user
	 */
	public User getUser()
	{
		return getUser( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimony.user</code> attribute. 
	 * @param value the user
	 */
	public void setUser(final SessionContext ctx, final User value)
	{
		USERHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Testimony.user</code> attribute. 
	 * @param value the user
	 */
	public void setUser(final User value)
	{
		setUser( getSession().getSessionContext(), value );
	}
	
}
