package com.jashepherd.studies.java.ocajavase8studyguide.ch01.e14_naming_conflicts;

/*
 * When the class is found in multiple packages, Java gives you the compiler error:
 * The type Date is ambiguous
 *
 * import java.util.*;
 * import java.sql.*;  // DOES NOT COMPILE
 */

import java.util.Date;  // this date takes precedence since it is explicitly imported
import java.sql.*;      // the date in this package is not used as the exlicit import takes precedence

/**
 * Chapter 1: Java Building Blocks<br/>
 * Understanding Package Declarations and Imports<br/>
 * Naming Conflicts - pages 12-13
 * <p>
 * One of the reasons for using packages is so that class names don’t have to be unique across
 * all of Java.  The Date class exists in both java.util and java.sql packages. The one in java.util
 * is chosen for this class since it is explicitly imported.
 */
public class Conflicts {
	Date date;
	// some more code
}
