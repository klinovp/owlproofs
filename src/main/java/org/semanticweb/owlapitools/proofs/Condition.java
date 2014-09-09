/**
 * 
 */
package org.semanticweb.owlapitools.proofs;

/**
 * An object testing a particular boolean condition on its argument.
 * 
 * @author Pavel Klinov
 * 
 *         pavel.klinov@uni-ulm.de
 */
public interface Condition<T> {

	public boolean holds(T input);
}
