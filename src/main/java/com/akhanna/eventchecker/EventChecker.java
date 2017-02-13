package com.akhanna.eventchecker;

/**
 * This interface is used for checking if an event occurred during that year or
 * not. Through this interface we can have multiple implementations of the
 * event checker.
 * 
 * @author akhanna
 *
 */
public interface EventChecker {

	public void include(final int minYear, final int maxYear);

	public void exclude(final int minYear, final int maxYear);

	public boolean check(final int year);

}
