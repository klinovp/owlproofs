/**
 * 
 */
package org.semanticweb.owlapitools.proofs;

import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.reasoner.OWLReasoner;

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
	 * Returns a {@link Proofs} object which encodes proofs (sequences of
	 * {@link Inference}s) for this entailment, or {@code null} if the
	 * entailment does not hold.
	 * 
	 * @param entailment
	 * @return
	 */
	public Proofs getProofs(OWLAxiom entailment);
}
