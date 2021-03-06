/*
 * utils - Part.java - Copyright © 2010 David Roden
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.pterodactylus.util.template;

import java.io.Writer;

/**
 * Interface for a part of a template that can be rendered without further
 * parsing.
 *
 * @author <a href="mailto:bombe@pterodactylus.net">David ‘Bombe’ Roden</a>
 */
public interface Part {

	/**
	 * Renders this part.
	 *
	 * @param templateContext
	 *            The template context for the part
	 * @param writer
	 *            The writer to render the part to
	 * @throws TemplateException
	 *             if a template variable can not be parsed
	 */
	public abstract void render(TemplateContext templateContext, Writer writer) throws TemplateException;

}
