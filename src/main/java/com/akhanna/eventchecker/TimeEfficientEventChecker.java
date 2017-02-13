package com.akhanna.eventchecker;

/**
 * This class tracks some binary event described as "yes" or “no") happened in
 * any given year.
 * 
 * @author akhanna
 *
 */
public class TimeEfficientEventChecker implements EventChecker {

	// PRIVATE CONSTANT
	private static Integer MAX_YEAR_IN_CACHE = 5000;
	// Year Checker Array
	private boolean[] yearChecker;

	// The assumption is that year will always be greater than 0.
	public TimeEfficientEventChecker() {
		yearChecker = new boolean[MAX_YEAR_IN_CACHE];
	}

	public void include(int minYear, int maxYear) {

		validateyear(minYear, maxYear);

		for (int i = minYear; i < maxYear; i++) {
			yearChecker[i] = true;
		}
	}

	public void exclude(int minYear, int maxYear) {
		validateyear(minYear, maxYear);

		for (int i = minYear; i < maxYear; i++) {
			yearChecker[i] = false;
		}
	}

	public boolean check(int yearToCheck) {
		return yearChecker[yearToCheck];
	}

	///////////////////////////////////////////////////////
	// PRIVATE METHODS
	private void validateyear(int minYear, int maxYear) {
		if (minYear < 0 || maxYear > MAX_YEAR_IN_CACHE) {
			throw new IllegalArgumentException("Year cannot be less than 0 or greater than 5000");
			// Another SOLUTION rather than throwing exception, is to increase
			// the size of the array to maxYear.
			// Need to make sure no other function accesses the array while
			// that's happening.
		}
	}
}
