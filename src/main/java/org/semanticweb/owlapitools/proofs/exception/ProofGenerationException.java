/**
 * 
 */
package org.semanticweb.owlapitools.proofs.exception;

/**
 * @author Pavel Klinov
 *
 * pavel.klinov@uni-ulm.de
 */
@SuppressWarnings("serial")
public class ProofGenerationException extends Exception {

	public ProofGenerationException() {
		this(null, null);
	}
	
	public ProofGenerationException(String msg) {
		this(msg, null);
	}
	
	public ProofGenerationException(Exception cause) {
		this(null, cause);
	}
	
	public ProofGenerationException(String msg, Exception cause) {
		super(msg, cause);
	}
}
