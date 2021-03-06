/**
 *
 * $Id$
 */
package GenericAnyType.validation;

import GenericAnyType.GenericAttribute;
import GenericAnyType.GenericElement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * A sample validator interface for {@link GenericAnyType.GenericElement}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface GenericElementValidator {
	boolean validate();

	boolean validateNestedElements(EList<GenericElement> value);
	boolean validateAttributes(EList<GenericAttribute> value);
	boolean validateElementFeatureMap(FeatureMap value);
	boolean validateAttributeFeatureMap(FeatureMap value);
}
