/**
 *
 * $Id$
 */
package CAEX.validation;

import CAEX.AdditionalInformation;
import CAEX.ChangeMode;
import CAEX.Copyright;
import CAEX.Description;
import CAEX.Revision;
import CAEX.Version;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * A sample validator interface for {@link CAEX.CAEXBasicObject}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CAEXBasicObjectValidator {
	boolean validate();

	boolean validateDescription(Description value);
	boolean validateVersion(Version value);
	boolean validateRevision(EList<Revision> value);
	boolean validateCopyright(Copyright value);
	boolean validateChangeMode(ChangeMode value);
	boolean validateAdditionalInformation(EList<AdditionalInformation> value);

	boolean validateElementFeatureMap(FeatureMap value);

	boolean validateAttributeFeatureMap(FeatureMap value);
}
