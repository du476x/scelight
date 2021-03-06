/*
 * Project Scelight
 * 
 * Copyright (c) 2013 Andras Belicza <iczaaa@gmail.com>
 * 
 * This software is the property of Andras Belicza.
 * Copying, modifying, distributing, refactoring without the author's permission
 * is prohibited and protected by Law.
 */
package hu.scelightapibase.util.gui;

import hu.scelightapibase.gui.icon.IRIcon;

/**
 * Interface telling that an instance has an icon resource ({@link IRIcon}).
 * 
 * @author Andras Belicza
 */
public interface HasRIcon {
	
	/**
	 * Returns the ricon.
	 * 
	 * @return the ricon
	 */
	IRIcon getRicon();
	
}
