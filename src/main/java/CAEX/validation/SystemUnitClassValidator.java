/**
 *
 * $Id$
 */
package CAEX.validation;

import org.eclipse.emf.common.util.EList;

import CAEX.Attribute;
import CAEX.ExternalInterface;
import CAEX.InternalElement;
import CAEX.InternalLink;
import CAEX.SupportedRoleClass;
import CAEX.SystemUnitClass;

/**
 * A sample validator interface for {@link CAEX.SystemUnitClass}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SystemUnitClassValidator {
	boolean validate();

	boolean validateAttribute(EList<Attribute> value);
	boolean validateExternalInterface(EList<ExternalInterface> value);
	boolean validateInternalElement(EList<InternalElement> value);
	boolean validateSupportedRoleClass(EList<SupportedRoleClass> value);
	boolean validateInternalLink(EList<InternalLink> value);
	boolean validateRefBaseClassPath(String value);
	boolean validateBaseClass(SystemUnitClass value);
	boolean validateSystemUnitClass(EList<SystemUnitClass> value);
}
