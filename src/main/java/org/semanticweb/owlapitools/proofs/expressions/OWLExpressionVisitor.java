/**
 * 
 */
package org.semanticweb.owlapitools.proofs.expressions;

/**
 * @author Pavel Klinov
 *
 * pavel.klinov@uni-ulm.de
 */
public interface OWLExpressionVisitor<O> {

	public O visit(OWLAxiomExpression expression);
	
	public O visit(OWLLemmaExpression expression);
}
