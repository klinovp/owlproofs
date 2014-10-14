/**
 * 
 */
package org.semanticweb.owlapitools.proofs.expressions;

import org.semanticweb.owlapi.model.OWLAxiom;

/**
 * Represent {@link OWLExpression}s which can be represented in the OWL 2 syntax
 * as axioms.
 * 
 * @author Pavel Klinov
 * 
 *         pavel.klinov@uni-ulm.de
 */
public interface OWLAxiomExpression {

	public OWLAxiom getAxiom();

	public boolean isAsserted();
}
