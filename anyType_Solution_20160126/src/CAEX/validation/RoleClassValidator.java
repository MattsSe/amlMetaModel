/**
 *
 * $Id$
 */
package CAEX.validation;

import CAEX.Attribute;
import CAEX.ExternalInterface;

import CAEX.RoleClass;
import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link CAEX.RoleClass}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RoleClassValidator {
	boolean validate();

	boolean validateAttribute(EList<Attribute> value);
	boolean validateExternalInterface(EList<ExternalInterface> value);
	boolean validateRefBaseClassPath(String value);

	boolean validateBaseClass(RoleClass value);

	boolean validateRoleClass(EList<RoleClass> value);
}
