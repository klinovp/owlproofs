/**
 * 
 */
package org.semanticweb.owlapitools.proofs;

import java.util.Collection;

import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapitools.proofs.expressions.OWLExpression;

/**
 * The base interface of inferences. The inference is an elementary step of a
 * proof. It is an object which has the conclusion (the derived expression), a
 * set of premises (expressions from which the conclusion is derived), and a set
 * of side conditions (boolean expressions which have to hold true for the
 * inference to apply).
 * 
 * Both the conclusion and the premises are modeled using {@link OWLAxiom} while
 * conditions can take arbitrary arguments. One common form of side conditions is
 * to check presence of axioms in the input ontology.
 * 
 * @author Pavel Klinov
 * 
 *         pavel.klinov@uni-ulm.de
 */
public interface OWLInference {

	/**
	 * 
	 * @return
	 */
	public OWLExpression getConclusion();

	/**
	 * 
	 * @return
	 */
	public Collection<OWLExpression> getPremises();

}
