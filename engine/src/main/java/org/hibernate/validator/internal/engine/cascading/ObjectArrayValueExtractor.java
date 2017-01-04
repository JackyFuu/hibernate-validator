/*
 * Hibernate Validator, declare and validate application constraints
 *
 * License: Apache License, Version 2.0
 * See the license.txt file in the root directory or <http://www.apache.org/licenses/LICENSE-2.0>.
 */
package org.hibernate.validator.internal.engine.cascading;

import javax.validation.valueextraction.ValueExtractor;

class ObjectArrayValueExtractor implements ValueExtractor<Object[]> {

	static final ObjectArrayValueExtractor INSTANCE = new ObjectArrayValueExtractor();

	private ObjectArrayValueExtractor() {
	}

	@Override
	public void extractValues(Object[] originalValue, ValueReceiver receiver) {
		int i = 0;
		for ( Object object : originalValue ) {
			receiver.indexedValue( "<collection element>", i, object );
			i++;
		}
	}
}
