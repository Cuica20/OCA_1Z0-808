package com.jashepherd.studies.java.ocajavase8studyguide.ch01.e27_ordering_elements;  // package must be first non-comment

import java.util.*;  // import must come after package

/**
 * Chapter 1: Java Building Blocks<br/>
 * Ordering Elements in a Class<br/>
 * page 35
 */
public class A1MeerKat {  // then comes class which is the only required element
	double weight;  // fields and methods go in any order
	public double getWeight() {
		return weight;
	}
	double height;  // another field, they don't need to be grouped
}
