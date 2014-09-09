/**
 * 
 */
package org.semanticweb.owlapitools.proofs;

import org.semanticweb.owlapi.model.OWLAxiom;

/**
 * A representation of proof for the given entailment.
 * 
 * @author Pavel Klinov
 * 
 *         pavel.klinov@uni-ulm.de
 */
public interface Proofs {

	/**
	 * Returns the axiom for which this object encodes proofs.
	 * 
	 * @return
	 */
	public OWLAxiom getEntailment();

	/**
	 * Returns all inferences in this object which derive the given axiom as
	 * their conclusion.
	 * 
	 * The iteration order is consistent with the proof order: an inference
	 * returned at the step i has as premises only {@link OWLAxiom}s derived as
	 * conclusions by inferences returned at steps before i.
	 * 
	 * @param conclusion
	 * @return
	 */
	public Iterable<Inference<?>> getInferences(OWLAxiom conclusion);
}
