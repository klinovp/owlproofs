/**
 * 
 */
package org.semanticweb.owlapitools.proofs;

import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.semanticweb.owlapi.reasoner.UnsupportedEntailmentTypeException;
import org.semanticweb.owlapitools.proofs.exception.ProofGenerationException;
import org.semanticweb.owlapitools.proofs.expressions.OWLExpression;

/**
 * An extension of the OWL API's {@link OWLReasoner} for reasoners which can
 * reconstruct proofs for entailments.
 * 
 * @author Pavel Klinov
 * 
 *         pavel.klinov@uni-ulm.de
 */
public interface ExplainingOWLReasoner extends OWLReasoner {

	/**
	 * Returns an {@link OWLExpression} object which represents the entailed
	 * axiom, or {@code null} if the entailment does not hold. All proofs can be
	 * unwound recursively by calling {@link OWLExpression#getInferences()} on
	 * each premise.
	 * 
	 * @param entailment
	 * @return
	 */
	public OWLExpression getDerivedExpression(OWLAxiom entailment) throws ProofGenerationException, UnsupportedEntailmentTypeException;
}
