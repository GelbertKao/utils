/*
 * utils - EmptyLoopPart.java - Copyright © 2010 David Roden
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

import java.io.IOException;
import java.io.Writer;
import java.util.Collection;

/**
 * {@ContainerPart} implementation that only renders its childrens if a
 * {@link Collection} in the template is empty. In combination with
 * {@link LoopPart} this can be used to implements {@code foreach}/{@code
 * foreachelse} loops.
 *
 * @author <a href="mailto:bombe@pterodactylus.net">David ‘Bombe’ Roden</a>
 */
public class EmptyLoopPart extends ContainerPart {

	/** The name of the collection. */
	private final String collectionName;

	/**
	 * Creates a new empty loop part.
	 *
	 * @param dataProvider
	 *            The part’s data provider
	 * @param collectionName
	 *            The name of the collection
	 */
	public EmptyLoopPart(DataProvider dataProvider, String collectionName) {
		super(dataProvider);
		this.collectionName = collectionName;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void render(Writer writer) throws IOException, TemplateException {
		Collection<?> collection = (Collection<?>) dataProvider.getData(collectionName);
		if (!collection.isEmpty()) {
			return;
		}
		super.render(writer);
	}

}