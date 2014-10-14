/**
 * 
 */
package org.semanticweb.owlapitools.proofs.expressions;

import org.semanticweb.owlapitools.proofs.OWLInference;
import org.semanticweb.owlapitools.proofs.exception.ProofGenerationException;

/**
 * The base interface for objects occurring as premises or conclusions in {@link OWLInference}s
 * 
 * @author Pavel Klinov
 *
 * pavel.klinov@uni-ulm.de
 */
public interface OWLExpression {

	public <O> O accept(OWLExpressionVisitor<O> visitor);
	
	public Iterable<OWLInference> getInferences() throws ProofGenerationException;
}
